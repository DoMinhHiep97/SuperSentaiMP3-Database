package com.judge.configuration;


import com.judge.repository.RoleRepository;
import com.judge.repository.RoleRepositoryImpl;
import com.judge.repository.UserRepository;
import com.judge.repository.UserRepositoryImpl;
import com.judge.service.IRoleService;
import com.judge.service.IUserService;
import com.judge.service.RoleServiceImpl;
import com.judge.service.UserServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan("com.judge.controller")
@EnableTransactionManagement
@EnableJpaRepositories("com.judge.repository")
public class ApplicationConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {
    //    @Bean
//    public BlogService blogService(){
//        return new BlogServiceImpl();
//    }
    @Bean
    public UserRepository userRepository(){
        return new UserRepositoryImpl();
    }
//
    @Bean
    public IUserService UserService(){
        return new UserServiceImpl();
    }
//Role
@Bean
public IRoleService RoleService(){
    return new RoleServiceImpl();
}
//
@Bean
public RoleRepository roleRepository(){
    return new RoleRepositoryImpl();
}

private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

//    //Thymeleaf Configuration
//    @Bean
//    public SpringResourceTemplateResolver templateResolver(){
//        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setApplicationContext(applicationContext);
//        templateResolver.setPrefix("/WEB-INF/views");
//        templateResolver.setSuffix(".html");
//        templateResolver.setTemplateMode(TemplateMode.HTML);
//        templateResolver.setCharacterEncoding("UTF-8");
//        return templateResolver;
//    }
//
//    @Bean
//    public TemplateEngine templateEngine(){
//        TemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        return templateEngine;
//    }
//
//    @Bean
//    public ThymeleafViewResolver viewResolver(){
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(templateEngine());
//
//        viewResolver.setCharacterEncoding("UTF-8");
//        return viewResolver;
//    }

    //Config JPA
    @Bean
    @Qualifier(value = "entityManager")
    public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
        return entityManagerFactory.createEntityManager();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan(new String[]{"com.judge.model"});

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(additionalProperties());
        return em;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/customers");
        dataSource.setUsername( "root" );
        dataSource.setPassword( "hieuthuy12" );
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }

    Properties additionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        return properties;
    }
}
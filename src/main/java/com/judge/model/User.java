package com.judge.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="Users",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {
                "emil"
        })
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String avatarUrl;
    @NotBlank
    private String name;

    @NotBlank
    private String userName;

    @NotBlank
    private String email;

    @NotBlank
    private String passWord;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
    public User(String signUpRequestName, String name, String userName, String email, String encode) {
        this.name = signUpRequestName;
        this.userName = userName;
        this.email = email;
        this.passWord = encode;
        this.avatarUrl = name;
    }

    public User(String avatarUrl, @NotBlank String name, @NotBlank String userName, @NotBlank String email, @NotBlank String passWord, Set<Role> roles) {
        this.avatarUrl = avatarUrl;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

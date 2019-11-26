package com.judge.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String firstName;
    private String lastName;
    private String account;
    private String passWord;
    private String addressEmail;
    private Date dateBirthday;
    private String gender;

    public User() {
    }

    public User(String firstName, String lastName, String account, String passWord, String addressEmail, Date dateBirthday, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
        this.passWord = passWord;
        this.addressEmail = addressEmail;
        this.dateBirthday = dateBirthday;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAddressEmail() {
        return addressEmail;
    }

    public void setAddressEmail(String addressEmail) {
        this.addressEmail = addressEmail;
    }

    public Date getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account='" + account + '\'' +
                ", passWord='" + passWord + '\'' +
                ", addressEmail='" + addressEmail + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", gender='" + gender + '\'' +
                '}';
    }
}

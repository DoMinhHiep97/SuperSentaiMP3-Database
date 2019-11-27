package com.judge.message.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class SignUpForm {
    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

    private String avatarUrl;

    @NotBlank
    @Size(min = 3, max = 50)
    private String userName;

    @NotBlank
    @Size(max = 60)
    @Email
    private String email;
    private Set<String> role ;
    @NotBlank
    @Size (min=6 ,max =12)
    private String passWord;

    public SignUpForm() {
    }

    public SignUpForm(@NotBlank @Size(min = 3, max = 50) String name, String avatarUrl, @NotBlank @Size(min = 3, max = 50) String userName, @NotBlank @Size(max = 60) @Email String email, Set<String> role, @NotBlank @Size(min = 6, max = 12) String passWord) {
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.userName = userName;
        this.email = email;
        this.role = role;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

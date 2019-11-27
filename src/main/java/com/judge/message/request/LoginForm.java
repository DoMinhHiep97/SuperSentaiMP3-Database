package com.judge.message.request;

import javax.validation.constraints.NotBlank;

public class LoginForm {
    @NotBlank
    private String userName;

    @NotBlank
    private String passWord;

    public LoginForm(@NotBlank String userName, @NotBlank String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public LoginForm() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

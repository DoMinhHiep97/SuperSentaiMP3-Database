package com.judge.message.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UpdateForm {
    @NotBlank
    private String name;
    @NotBlank
    @Email
    private String email;

    public UpdateForm() {
    }

    public UpdateForm(@NotBlank String name, @NotBlank @Email String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

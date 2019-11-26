package com.judge.service;

import com.judge.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findById(Long id);

    void save(User user);

    void remove(Long id);
}

package com.judge.service;

import com.judge.model.Role;
import com.judge.model.User;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();

    Role findById(Long id);

    void save(Role role);

    void remove(Long id);
}

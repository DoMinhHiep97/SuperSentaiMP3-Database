package com.judge.repository;

import com.judge.model.User;

public interface UserRepository extends Repository<User> {
    User findById(Long id);
}

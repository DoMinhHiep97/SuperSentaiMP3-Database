package com.judge.service;

import com.judge.model.User;
import com.judge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
      userRepository.save(user);
    }

    @Override
    public void remove(Long id) {
        userRepository.remove(id);
    }
}

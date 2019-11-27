package com.judge.service.Impl;

import com.judge.model.Role;
import com.judge.model.RoleName;
import com.judge.repository.RoleRepository;
import com.judge.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired private RoleRepository roleRepository;
    @Override
    public Optional<Role> findByName(RoleName roleName) {
        return roleRepository.findByName(roleName);
    }
}

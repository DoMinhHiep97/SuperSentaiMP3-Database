package com.judge.service;

import com.judge.model.Role;
import com.judge.model.RoleName;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface RoleService {
    Optional<Role> findByName(RoleName roleName);
}

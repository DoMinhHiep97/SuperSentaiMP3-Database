package com.judge.repository;

import com.judge.model.Role;
import com.judge.model.User;

public interface RoleRepository extends Repository<Role> {
    Role findById(Long id);
}

package com.token.jsonwebtoken.repository;

import com.token.jsonwebtoken.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}

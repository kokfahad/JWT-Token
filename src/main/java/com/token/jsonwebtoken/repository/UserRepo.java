package com.token.jsonwebtoken.repository;

import com.token.jsonwebtoken.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUsername(String username);

}

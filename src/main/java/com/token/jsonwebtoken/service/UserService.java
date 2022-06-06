package com.token.jsonwebtoken.service;

import com.token.jsonwebtoken.domain.Role;
import com.token.jsonwebtoken.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String rolename);
    User getUser(String username);
    List<User>getUser();
}

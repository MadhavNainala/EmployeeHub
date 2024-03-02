package com.example.RESTAPI.Service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.RESTAPI.Entity.User;

public interface UserService extends UserDetailsService{
    
    public User findByUserName(String userName);
}

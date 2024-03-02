package com.example.RESTAPI.Service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.RESTAPI.Entity.User;
import com.example.RESTAPI.User.WebUser;

public interface UserService extends UserDetailsService{
    
    public User findByUserName(String userName);

    void save(WebUser webUser);

}

package com.example.RESTAPI.DAO;

import com.example.RESTAPI.Entity.User;

public interface UserDao {
   
    User findByUserName(String userName);
   
}

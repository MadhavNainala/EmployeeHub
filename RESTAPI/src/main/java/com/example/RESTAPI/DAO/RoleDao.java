package com.example.RESTAPI.DAO;

import com.example.RESTAPI.Entity.Role;

public interface RoleDao {

    public Role findRoleByName(String theRoleName);

}

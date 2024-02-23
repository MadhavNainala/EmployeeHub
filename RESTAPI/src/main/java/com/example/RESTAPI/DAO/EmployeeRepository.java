package com.example.RESTAPI.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RESTAPI.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer >{
    
}

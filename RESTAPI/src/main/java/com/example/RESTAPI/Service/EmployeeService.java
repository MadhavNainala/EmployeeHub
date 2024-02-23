package com.example.RESTAPI.Service;
import java.util.List;

import com.example.RESTAPI.Entity.Employee;
public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    void deleteById(int id);



    Employee savEmployee(Employee theemployee);
}

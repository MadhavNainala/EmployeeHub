package com.example.RESTAPI.Service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.RESTAPI.DAO.EmployeeRepository;
import com.example.RESTAPI.Entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    private EmployeeRepository theEmployeRepository;

    public EmployeeServiceImplementation(EmployeeRepository theEmployeRepository) {
        this.theEmployeRepository = theEmployeRepository;
    }

    public List<Employee> findAll(){
        return theEmployeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        // TODO Auto-generated method stub
        return theEmployeRepository.findById(id).get();
    }

    @Override
    public Employee savEmployee(Employee theemployee) {
        return theEmployeRepository.save(theemployee);
    }

    @Override
    public void deleteById(int id) {
        theEmployeRepository.deleteById(id);
        
    }

    

    
}

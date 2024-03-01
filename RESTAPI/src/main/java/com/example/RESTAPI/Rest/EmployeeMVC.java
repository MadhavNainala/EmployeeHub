package com.example.RESTAPI.Rest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RESTAPI.Entity.Employee;
import com.example.RESTAPI.Service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeMVC {

     private EmployeeService theEmployeeService;

    public EmployeeMVC(EmployeeService theEmployeeService) {
        this.theEmployeeService = theEmployeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel){
        List<Employee> theEmployee = theEmployeeService.findAll();
        theModel.addAttribute("employees", theEmployee);
        return "employee/employee-list";
    }

    @GetMapping("/showForm")
    public String showEmployeeForm(Model theModel){
        theModel.addAttribute("employee", new Employee());
        return "employee/employee-form";
    }

    @GetMapping("/updateForm")
    public String updateForm(@RequestParam("employeeId") int id, Model theModel){
        Employee theEmployee = theEmployeeService.findById(id);
        theModel.addAttribute("employee", theEmployee);
        return "employee/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
        theEmployeeService.savEmployee(theEmployee);
        return "redirect:/employees/list";

    }

    @GetMapping("/deleteForm")
    public String deleteEmployee(@RequestParam("employeeId") int id){
        theEmployeeService.deleteById(id);
        return "redirect:/employees/list";

    }

    @GetMapping("/showLoginPage")
    public String loginForm(){
        return "employee/employee-login";
    }

    @GetMapping("/accessDenied")
    public String accessDenied(){
        return "employee/employee-deny";
    }
 
}

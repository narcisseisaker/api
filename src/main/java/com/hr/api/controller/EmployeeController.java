package com.hr.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.api.model.Employee;
import com.hr.api.service.EmployeeService;

public class EmployeeController {
 
	@Autowired
    private EmployeeService employeeService;

    @GetMapping (path="/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
	
}

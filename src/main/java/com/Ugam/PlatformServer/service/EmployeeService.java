package com.Ugam.PlatformServer.service;

import com.Ugam.PlatformServer.entity.Employee;
import com.Ugam.PlatformServer.repository.EmployeeRepositoryWithoutDynamoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepositoryWithoutDynamoDB employeeRepositoryWithoutDynamoDB;

    // Add_All_Employee
    public List<Employee> addEmployee(List<Employee> employee) {
        return employeeRepositoryWithoutDynamoDB.saveAll(employee);

    }
    //Get All the Employees
    public List<Employee> getAllEmployee(){
        return employeeRepositoryWithoutDynamoDB.findAll();
    }

    //update Employee
    public  Employee updateEmployee(Employee employees){
        return employeeRepositoryWithoutDynamoDB.saveAndFlush(employees);
    }

    //Delete Employee
    public  String deleteEmployee(int employeeId){
        employeeRepositoryWithoutDynamoDB.deleteById(employeeId);
        return "Employee Deleted";
    }



}

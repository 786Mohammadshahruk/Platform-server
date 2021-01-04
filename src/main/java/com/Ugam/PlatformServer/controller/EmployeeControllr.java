package com.Ugam.PlatformServer.controller;

import com.Ugam.PlatformServer.entity.Employee;
import com.Ugam.PlatformServer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeControllr {

    @Autowired
    private EmployeeService employeeService;

//    @PostMapping("/add")
//    public List<Employee> addPerson(@RequestBody List<Employee> employee) {
//        return  employeeService.addEmployee(employee);
//    }

    @PostMapping("/add")
    public ResponseEntity<List<Employee>> addPerson(@RequestBody List<Employee> employee) {
        return new ResponseEntity<List<Employee>>(employeeService.addEmployee(employee), HttpStatus.CREATED);
    }

//    @GetMapping("/get")
//    public List<Employee> getEmployees() {
//        return  employeeService.getAllEmployee();
//    }

    @RequestMapping(value = "/check",method = RequestMethod.GET )
    public String check(){
        return  "Running Application..............";
    }

    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getEmployees() {
        return new ResponseEntity<List<Employee>>(employeeService.getAllEmployee(), HttpStatus.OK);
    }
//    @DeleteMapping("/delete")
//    public String deleteEmployee(@RequestParam int employeeId) {
//        return  employeeService.deleteEmployee(employeeId);
//    }


    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteEmployee(@RequestParam int employeeId) {
        return new ResponseEntity<Object>(employeeService.deleteEmployee(employeeId), HttpStatus.OK);
    }
//    @PutMapping("/update")
//    public String updateEmployee(@RequestBody Employee employee) {
//      return employeeService.updateEmployee(employee);
//    }
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee), HttpStatus.CREATED);
    }


}

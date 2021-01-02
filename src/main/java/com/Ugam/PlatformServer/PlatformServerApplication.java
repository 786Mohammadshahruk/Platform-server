package com.Ugam.PlatformServer;

import com.Ugam.PlatformServer.entity.Employee;
import com.Ugam.PlatformServer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class PlatformServerApplication {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(PlatformServerApplication.class, args);
	}






}

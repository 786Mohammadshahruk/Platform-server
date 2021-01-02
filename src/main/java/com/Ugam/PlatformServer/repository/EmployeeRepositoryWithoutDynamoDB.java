package com.Ugam.PlatformServer.repository;

import com.Ugam.PlatformServer.entity.Employee;
import com.Ugam.PlatformServer.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryWithoutDynamoDB extends JpaRepository<Employee,Integer> {

}

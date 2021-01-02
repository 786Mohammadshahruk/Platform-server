package com.Ugam.PlatformServer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    private int employeeId;
    private String employeeName;
    private String employeeEmail;
    private long contectNo;
    private EmployeeAddress employeeAddress;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeEmail, long contectNo, EmployeeAddress employeeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.contectNo = contectNo;
        this.employeeAddress = employeeAddress;
    }

    public void setContectNo(long contectNo) {
        this.contectNo = contectNo;
    }

    public void setEmployeeAddress(EmployeeAddress employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public EmployeeAddress getEmployeeAddress() {
        return employeeAddress;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public long getContectNo() {
        return contectNo;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}

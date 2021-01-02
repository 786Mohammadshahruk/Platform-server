package com.Ugam.PlatformServer.entity;

import java.io.Serializable;

public class EmployeeAddress implements Serializable {

    private String city;
    private String state;
    private long pinCode;

    public EmployeeAddress() {
    }

    public EmployeeAddress(String city, String state, long pinCode) {
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }
}

package com.Ugam.PlatformServer.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.io.Serializable;

@DynamoDBTable(tableName = "person")
public class Person implements Serializable {

    @DynamoDBHashKey(attributeName = "personid")
    @DynamoDBAutoGeneratedKey
    private String personid;
    @DynamoDBAttribute
    private String name;
    @DynamoDBAttribute
    private int age;
    @DynamoDBAttribute
    private String email;
    @DynamoDBAttribute
    private Address  address;

    public Person(){}
    public Person(String personid,String name,int age,String email,Address address ){
        this.personid=personid;
        this.name=name;
        this.age=age;
        this.email=email;
        this.address=address;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPersonid() {
        return personid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }
}

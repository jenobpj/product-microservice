package com.example.ProductMicroservice.Product_Microservice.DTo;

import com.example.ProductMicroservice.Product_Microservice.Entity.Address;
import com.example.ProductMicroservice.Product_Microservice.Entity.Application;

import java.io.Serializable;
import java.util.List;

public class UserDto implements Serializable {
    public UserDto(String name, String age, Address address, List<Application> applicationDTO) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.applicationDTO = applicationDTO;
    }

    private  long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Application> getApplicationDTO() {
        return applicationDTO;
    }

    public void setApplicationDTO(List<Application> applicationDTO) {
        this.applicationDTO = applicationDTO;
    }

    private String age;
    private Address address;
    private List<Application> applicationDTO;

}

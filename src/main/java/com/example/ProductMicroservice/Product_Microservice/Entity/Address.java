package com.example.ProductMicroservice.Product_Microservice.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Address  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String address;

    @OneToOne
    @JoinColumn(name = "user_id")


    @JsonBackReference// Foreign key in Address table
    private User user;

    // Constructors
    public Address() {}

    public Address(String address, User user) {
        this.address = address;
        this.user = user;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

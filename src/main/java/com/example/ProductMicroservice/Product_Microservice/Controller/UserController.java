package com.example.ProductMicroservice.Product_Microservice.Controller;

import com.example.ProductMicroservice.Product_Microservice.Entity.Address;
import com.example.ProductMicroservice.Product_Microservice.Entity.User;
import com.example.ProductMicroservice.Product_Microservice.Entity.Application;
import com.example.ProductMicroservice.Product_Microservice.DTo.UserDto;
import com.example.ProductMicroservice.Product_Microservice.Repositores.AddressRepo;
import com.example.ProductMicroservice.Product_Microservice.Repositores.ApplicationRep;
import com.example.ProductMicroservice.Product_Microservice.Repositores.UserRepo;
import com.example.ProductMicroservice.Product_Microservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    UserRepo userRepo;

    @Autowired
    AddressRepo addressRepo;

    AddressService addressService;

    @Autowired
    ApplicationRep applicationRep;


     UserController(AddressService addressService){
         this.addressService=addressService;
     }


    @PostMapping
    public User addUser(@RequestBody User user){
     return addressService.addUser(user);
    }
    @PostMapping("address/{id}")
    public  Address addAddress(@PathVariable long id,@RequestBody  Address address){
         return addressService.addAddress(id,address);
    }
    @GetMapping("{id}")
    public  UserDto getUser(@PathVariable long id){
         return addressService.getUser(id);
    }



}

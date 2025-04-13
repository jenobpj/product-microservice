package com.example.ProductMicroservice.Product_Microservice.service;

import com.example.ProductMicroservice.Product_Microservice.DTo.UserDto;
import com.example.ProductMicroservice.Product_Microservice.Entity.Address;
import com.example.ProductMicroservice.Product_Microservice.Entity.User;
import com.example.ProductMicroservice.Product_Microservice.Repositores.AddressRepo;
import com.example.ProductMicroservice.Product_Microservice.Repositores.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
public class AddressService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    private KafkaTemplate<String, String> template;

    @Autowired
    AddressRepo addressRepo;

    public User addUser(User user) {
       return userRepo.save(user);
    }
        public static String getCurrentTime() {
            return LocalDateTime.now().toString();

    }


    public Address addAddress(long id, Address address){
        Optional<User> currentUser=userRepo.findUserById(id);
        Address current_address=new Address();
       if(currentUser.isPresent()){
           current_address.setAddress(address.getAddress());
           current_address.setUser(currentUser.get());
           addressRepo.save(current_address);

           CompletableFuture<SendResult<String, String>> future = template.send("javaKafka", currentUser.get().getName());

           // Handle the completion of the message send, whether it succeeds or fails
           future.whenComplete((result, ex) -> {
               if (ex == null) {
                   System.out.println("Message sent to Kafka with offset: " + result.getRecordMetadata().offset());
                   System.out.println("Hai everyone");
                   System.out.println("Helooo");
               } else {
                   // Log the error if the Kafka message failed, without affecting the main process
                   System.err.println("Unable to send the message to Kafka: " + ex.getMessage());
               }
           }).exceptionally(ex -> {
               // Handle any unexpected errors in the asynchronous code
               System.err.println("Error in sending Kafka message: " + ex.getMessage());
               return null;
           });

           // Return the address even if Kafka sending fails
           return current_address;

       }
       return null;
    }
    @Cacheable(value = "user",key ="#id")
    public UserDto getUser(long id) {
        System.out.println("First time");

        User user=userRepo.findUserById(id)
                        .orElseThrow(()->new RuntimeException("User is not found"));

        UserDto userDto= new UserDto(user.getName(), user.getAge(),user.getAddress(),user.getApplicationList());
        return userDto;
    }
}

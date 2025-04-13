package com.example.ProductMicroservice.Product_Microservice.Repositores;

import com.example.ProductMicroservice.Product_Microservice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findUserById(Long id);
}

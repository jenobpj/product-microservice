package com.example.ProductMicroservice.Product_Microservice.Repositores;

import com.example.ProductMicroservice.Product_Microservice.Entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRep extends JpaRepository<Application,Long> {
}

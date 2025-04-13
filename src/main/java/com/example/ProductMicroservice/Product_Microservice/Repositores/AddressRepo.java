package com.example.ProductMicroservice.Product_Microservice.Repositores;

import com.example.ProductMicroservice.Product_Microservice.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {
    Optional<Address> findAddressById(Long id);
}

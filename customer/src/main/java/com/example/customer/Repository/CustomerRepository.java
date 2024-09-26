package com.example.customer.Repository;

import com.example.customer.controller.CustomerController;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerController,Long>{
    
}

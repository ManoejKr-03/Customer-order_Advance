package com.example.customer.controller;

import com.example.customer.Repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {


    @Autowired
    CustomerRepository customerRepository;
     


    @GetMapping("/customer/{cid}")
    public CustomerController getACustomer(@PathVariable long id)
    {
       CustomerController customerController = customerRepository.findById(id).get();
        return customerController;
    }

    @PostMapping("/customer")
    public CustomerController createCustomer(@RequestBody CustomerController customerController)
    {
        return customerRepository.save(customerController);
    }

    @DeleteMapping("/customer/{cid}")
    public void deleteCustomer(@PathVariable long id)
    {
        customerRepository.deleteById(id);
        return;
    }
    
}

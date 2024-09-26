package com.example.customer.controller;

import com.example.customer.Repository.CustomerRepository;
import com.example.customer.entity.CustomerService;

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
    public CustomerService getACustomer(@PathVariable long id)
    {
       CustomerService customerservice = customerRepository.findById(id).get();
        return customerservice;
    }

    @PostMapping("/customer")
    public CustomerService createCustomer(@RequestBody CustomerService customerController)
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

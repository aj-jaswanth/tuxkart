package com.aconex.tuxkart.controller;

import com.aconex.tuxkart.MediaTypes;
import com.aconex.tuxkart.repository.CustomerRepository;
import com.aconex.tuxkart.representation.Customers;
import com.aconex.tuxkart.representation.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping(produces = MediaTypes.CUSTOMERS_V1)
    @ResponseBody
    public Customers customers() {
        return new Customers(customerRepository.findAll());
    }
}

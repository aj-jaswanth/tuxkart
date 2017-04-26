package com.aconex.tuxkart.representation;

import com.aconex.tuxkart.model.Customer;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Customers {
    private final List<Customer> customers;

    public Customers(List<Customer> customers) {
        this.customers = customers;
    }
}

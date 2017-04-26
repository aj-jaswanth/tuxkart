package com.aconex.tuxkart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private double cost;
    private String type;

    public Product() {
    }

    public Product(Integer id, String name, double cost, String type) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }
}

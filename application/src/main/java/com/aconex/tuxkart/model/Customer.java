package com.aconex.tuxkart.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

/**
 * Created by skumar on 25/04/17.
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer {


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    @Column
    private  String name;
    @Column
    private String email;
}

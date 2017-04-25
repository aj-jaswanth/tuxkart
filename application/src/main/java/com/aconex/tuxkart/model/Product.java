package com.aconex.tuxkart.model;

import javax.persistence.*;

/**
 * Created by skumar on 25/04/17.
 */
@Entity
@Table(name = "product")
public class Product {
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productID;
    @Column
    private String productName;
    @Column
    private float cost;
}

package com.aconex.tuxkart.representation;

import com.aconex.tuxkart.model.Product;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Products {
    private final List<Product> products;

    public Products(List<Product> products) {
        this.products = products;
    }
}

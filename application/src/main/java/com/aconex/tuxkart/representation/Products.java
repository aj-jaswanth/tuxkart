package com.aconex.tuxkart.representation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Products {
    private final Product[] products;

    public Products(Product[] products) {
        this.products = products;
    }
}

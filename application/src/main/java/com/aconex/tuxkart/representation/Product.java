package com.aconex.tuxkart.representation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Product {
    public final String id;
    public final String name;
    public final String type;

    public Product(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}

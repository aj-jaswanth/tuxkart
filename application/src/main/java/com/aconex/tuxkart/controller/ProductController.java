package com.aconex.tuxkart.controller;

import com.aconex.tuxkart.MediaTypes;
import com.aconex.tuxkart.repository.ProductRepository;
import com.aconex.tuxkart.representation.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(produces = MediaTypes.PRODUCTS_V1)
    @ResponseBody
    public Products products() {
        return new Products(productRepository.findAll());
    }
}

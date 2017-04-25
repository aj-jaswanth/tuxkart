package com.aconex.tuxkart.controller;

import com.aconex.tuxkart.MediaTypes;
import com.aconex.tuxkart.repository.ProductRepository;
import com.aconex.tuxkart.representation.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductRepository productRepository;

    @Test
    public void shouldGiveListOfProducts() throws Exception {
        Product[] products = {new Product("1", "Pixel", "Mobile Phone")};
        when(productRepository.getAllProducts()).thenReturn(products);

        mockMvc.perform(get("/products")
                .header(HttpHeaders.ACCEPT, MediaTypes.PRODUCTS_V1))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaTypes.PRODUCTS_V1))
                .andExpect(jsonPath("$.products", hasSize(1)))
                .andExpect(jsonPath("$.products[0].id", is("1")))
                .andExpect(jsonPath("$.products[0].name", is("Pixel")))
                .andExpect(jsonPath("$.products[0].type", is("Mobile Phone")));

        verify(productRepository).getAllProducts();
    }

}

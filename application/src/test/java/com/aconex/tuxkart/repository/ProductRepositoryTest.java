package com.aconex.tuxkart.repository;

import com.aconex.tuxkart.TuxkartApplication;
import com.aconex.tuxkart.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
@ContextConfiguration(classes = {TuxkartApplication.class})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class,})
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void shouldGetAllCustomers() {
        productRepository.save(new Product(1, "abcd", 33.0, "efgh"));

        List<Product> products = productRepository.findAll();

        assertThat(products.size(), is(1));
        assertThat(products.get(0).getId(), is(1));
        assertThat(products.get(0).getName(), is("abcd"));
        assertThat(products.get(0).getCost(), is(33.0));
        assertThat(products.get(0).getType(), is("efgh"));
    }
}

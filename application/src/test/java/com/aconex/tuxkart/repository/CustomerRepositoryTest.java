package com.aconex.tuxkart.repository;

import com.aconex.tuxkart.TuxkartApplication;
import com.aconex.tuxkart.model.Customer;
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
public class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void shouldGetAllCustomers() {
        customerRepository.save(new Customer("abcd", "efgh"));

        List<Customer> customers = customerRepository.findAll();

        assertThat(customers.size(), is(1));
        assertThat(customers.get(0).getName(), is("abcd"));
        assertThat(customers.get(0).getEmail(), is("efgh"));
    }
}

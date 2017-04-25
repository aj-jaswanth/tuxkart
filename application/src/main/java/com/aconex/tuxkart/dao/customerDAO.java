package com.aconex.tuxkart.dao;

import com.aconex.tuxkart.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by skumar on 25/04/17.
 */

@Repository
public class customerDAO {
    @PersistenceContext
    private EntityManager entityManager;


    public void create(Customer customer) {
        entityManager.persist(customer);
    }


    public void update(Customer customer) {
        entityManager.merge(customer);
    }


    public Customer getCustomerByID(long id) {
        return entityManager.find(Customer.class, id);
    }

    public void delete(long id) {
        Customer customer = getCustomerByID(id);
        if (customer != null) {
            entityManager.remove(customer);
        }
    }
}


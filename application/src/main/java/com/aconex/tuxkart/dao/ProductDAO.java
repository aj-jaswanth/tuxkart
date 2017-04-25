package com.aconex.tuxkart.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

/**
 * Created by skumar on 25/04/17.
 */
@Repository
public class ProductDAO {
    @PersistenceContext
    private EntityManager entityManager;

}

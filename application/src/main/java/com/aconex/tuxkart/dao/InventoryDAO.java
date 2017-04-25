package com.aconex.tuxkart.dao;

import com.aconex.tuxkart.model.Customer;
import com.aconex.tuxkart.model.Inventory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by skumar on 25/04/17.
 */
@Repository
public class InventoryDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public void create(Inventory inventory){
        entityManager.persist(inventory);
    }
    public void update(Inventory inventory){
        entityManager.persist(inventory);
    }
    public int updateProductCount(int prodcutID)
    {
        return  0;
    }

}

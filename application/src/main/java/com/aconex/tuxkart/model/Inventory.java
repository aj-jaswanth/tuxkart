package com.aconex.tuxkart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by skumar on 25/04/17.
 */
@Entity
@Table(name="Inventory")
public class Inventory {

    @Column
    private  int productId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Column
    private  int count;

}

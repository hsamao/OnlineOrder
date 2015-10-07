package com.samao.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by hsamao on 10/5/15.
 */
public class OrderItem implements Serializable{
    private Long id;
    private Order order;
    private Item item;
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

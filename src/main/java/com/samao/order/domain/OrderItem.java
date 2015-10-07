package com.samao.order.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

/**
 * Created by hsamao on 10/6/15.
 */
@Entity
public class OrderItem implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn(name = "ITEM_ID")
    private List<Item> itemList;
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

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

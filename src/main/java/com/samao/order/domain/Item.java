package com.samao.order.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by hsamao on 10/6/15.
 */

@Entity
public class Item implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long itemNumber;
    private String itemName;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "ITEM_CATEGORY_ID")
    private ItemCategory itemCategory;

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = this.itemCategory;
    }

    public Long getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Long itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

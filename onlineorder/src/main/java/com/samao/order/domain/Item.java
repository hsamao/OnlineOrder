package com.samao.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hsamao on 10/5/15.
 */
public class Item implements Serializable {
    private int itemNumber;
    private String itemName;
    private Date createDate;
    private BigDecimal price;

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

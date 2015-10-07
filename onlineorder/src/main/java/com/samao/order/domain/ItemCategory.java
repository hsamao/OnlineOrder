package com.samao.order.domain;

import java.io.Serializable;

/**
 * Created by hsamao on 10/5/15.
 */
public class ItemCategory implements Serializable {
    private long id;
    private String name;
    private Boolean active;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}

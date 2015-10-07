package com.samao.order.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by hsamao on 10/6/15.
 */
@Entity
@Table (name = "ITEM_CATEGORY")
public class ItemCategory implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "NAME")
    private String name;
    private Boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

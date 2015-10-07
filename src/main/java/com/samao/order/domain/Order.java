package com.samao.order.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by hsamao on 10/6/15.
 */
@Entity
public class Order implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

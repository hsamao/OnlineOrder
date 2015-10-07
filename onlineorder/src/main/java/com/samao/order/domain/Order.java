package com.samao.order.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by hsamao on 10/5/15.
 */
public class Order {
    private Long id;
    private Date createDate;
    private Customer customer;
    private List<OrderTrack> orderTrackList;

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderTrack> getOrderTrackList() {
        return orderTrackList;
    }

    public void setOrderTrackList(List<OrderTrack> orderTrackList) {
        this.orderTrackList = orderTrackList;
    }
}

package com.samao.order.service;

import com.samao.order.domain.*;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by hsamao on 10/6/15.
 */
public class OnlineOrderTest implements Serializable {

    public static void main (String [] args) {

        HibernateUtil hibernateUtil = HibernateUtil.getInstance();
        Session session = hibernateUtil.getSession();

        Item item = new Item();
        ItemCategory itemCategory = new ItemCategory();
        Order order = new Order();
        OrderItem orderItem = new OrderItem();
        List<Item> itemList = null;

        item.setItemName("SAMSUNG_65_INTCH_TV");
        itemCategory.setName("ELECTRONICS");
        itemCategory.setActive(true);
        item.setItemCategory(itemCategory);

        order.setCreateDate(new Date());

        orderItem.setPrice(BigDecimal.ONE);
        orderItem.setOrder(order);
        itemList.add(item);
        orderItem.setItemList(itemList);

        Transaction transaction = session.beginTransaction();
        session.save(item);
        session.save(itemCategory);
        session.save(itemCategory);
        session.save(orderItem);
        transaction.commit();

    }
}

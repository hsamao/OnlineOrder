package com.samao.order.service;

import com.samao.order.domain.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hsamao on 10/6/15.
 */

@Component
@Transactional
public class OnlineOrderService {
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;

    public void makeOrder (Order order){
        session.getSessionFactory().openSession();
        session.beginTransaction();
       session.save(order);
        session.getTransaction().commit();
        session.close();

    }
}

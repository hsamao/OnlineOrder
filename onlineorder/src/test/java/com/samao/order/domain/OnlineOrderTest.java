package com.samao.order.domain;

import com.samao.order.service.OnlineOrderService;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * Created by hsamao on 10/6/15.
 */
public class OnlineOrderTest {

    private SessionFactory sessionFactory;
    private FileSystemXmlApplicationContext applicationContext;
    private OnlineOrderService onlineOrderService;

    @Before
    public void setUP() {
        System.out.println("Setup was called");
       applicationContext = new FileSystemXmlApplicationContext("order-service.xml");

    }

    @After
    public void tearDown() {
        System.out.println("Teardown was called");
        //applicationContext.destroy();
    }

    @Test
    public void testFirst() {
        System.out.println("Test first");
        Order order = new Order();
        onlineOrderService.makeOrder(order);
    }

    @Test
    public void testLast() {
        System.out.println("Test Last");
    }

}

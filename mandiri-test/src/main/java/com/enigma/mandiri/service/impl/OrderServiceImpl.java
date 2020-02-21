package com.enigma.mandiri.service.impl;

import com.enigma.mandiri.model.Order;
import com.enigma.mandiri.repository.OrderRepostory;
import com.enigma.mandiri.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepostory orderRepostory;

    @Override
    public List<Order> findAllOrder() {
        return orderRepostory.findAll();
    }

    @Override
    public Order createOrder(Order order) {
        order.setDate(new Date(System.currentTimeMillis()));
        return orderRepostory.save(order);
    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepostory.save(order);
    }

    @Override
    public Order findByOrderId(String id) {
        return orderRepostory.findById(id).get();
    }
}

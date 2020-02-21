package com.enigma.mandiri.service;

import com.enigma.mandiri.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAllOrder();
    Order createOrder(Order order);
    Order updateOrder(Order order);
    Order findByOrderId(String id);
}

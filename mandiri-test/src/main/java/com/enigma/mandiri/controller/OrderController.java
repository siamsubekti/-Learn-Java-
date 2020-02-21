package com.enigma.mandiri.controller;

import com.enigma.mandiri.model.Order;
import com.enigma.mandiri.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/order")
    public List<Order> getAllOrder(){
        return orderService.findAllOrder();
    }

    @PostMapping("/order")
    public Order addOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @PutMapping("/order")
    public Order updateOrder(@RequestBody Order order){
        return orderService.updateOrder(order);
    }

    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable String id){
        return orderService.findByOrderId(id);
    }
}

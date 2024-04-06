package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;

@RestController
@RequestMapping("/{userId}/orders")
public class OrderStatusController {
	
	
	@GetMapping
    public List<Order> getUserOrders(@PathVariable int userId) {
        // Logic to fetch orders for a user
        List<Order> orders = null; // Fetch orders based on user ID
        return orders;
    }
	

    @GetMapping("/{orderId}")
    public Order getOrderDetails(@PathVariable int userId, @PathVariable int orderId) {
        // Logic to fetch details of a specific order
        Order order = null; // Fetch order details based on order ID
        return order;
    }
}

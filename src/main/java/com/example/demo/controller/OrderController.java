package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderResponse;

@RestController 
@RequestMapping("/{userId}/order")

public class OrderController {
   
	
	@PostMapping
    public OrderResponse placeOrder(@PathVariable int userId,
                                    @RequestParam int qty ,
                                    @RequestParam String coupon) {
        // Logic to handle placing an order
        // Validate quantity and coupon
        // Apply coupon if valid
        // Calculate amount after discount
        // Generate order response
        OrderResponse response = new OrderResponse();
        // Set response detai
        return response;
    }

}

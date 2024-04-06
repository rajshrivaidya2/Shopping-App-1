package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PaymentResponse;

@RestController
@RequestMapping("/{userId}/{orderId}/pay")
public class PaymentController {
	
	@PostMapping
    public PaymentResponse makePayment(@PathVariable int userId,
                                       @PathVariable int orderId,
                                       @RequestParam int amount) {
        // Logic to handle payment processing
        // Mocking payment responses
        PaymentResponse response = new PaymentResponse();
        // Set response details
        return response;
    }
}

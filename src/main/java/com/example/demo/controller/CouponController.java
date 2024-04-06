package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fetchCoupons")
public class CouponController {
	 
       @GetMapping
	    public Map<String, Integer> getCoupons() {
	    Map<String, Integer> coupons = new HashMap<>();
	        // Logic to fetch available coupons
	     coupons.put("OFF5", 5);
	     coupons.put("OFF10", 10);
	        return coupons;
	    }
}

package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

@RestController
@RequestMapping("/inventory/{ordered}")
public class InventoryController {
	
	
	 private int availableQuantity = 100;
	    private double price = 100;
	    
	    
	    @GetMapping
	    public Map<String, Object> getInventory(@PathVariable int ordered) {
	        // Calculate the ordered quantity based on the provided value
	        int orderedQuantity = ordered;
	        
	        // Update the available quantity based on the ordered quantity
	        int remainingQuantity = availableQuantity - orderedQuantity;

	        Map<String, Object> inventory = new HashMap<>();
	        inventory.put("ordered", orderedQuantity);
	        inventory.put("price", price);
	        inventory.put("available", remainingQuantity);
	        return inventory;
	    }
	   
	

}

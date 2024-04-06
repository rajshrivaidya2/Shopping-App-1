package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "OrderResponse")
public class OrderResponse {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	  

    private int id;
	private int orderId;
	private int userId;
    private int quantity;
    private int amount;
    private String coupon;


   








}

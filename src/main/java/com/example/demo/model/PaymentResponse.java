package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "PaymentResponse")
public class PaymentResponse {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	

    private int id;
	private int userId;
	private int orderId;
    private String transactionId;
    private String status;
    private String description;
    





}

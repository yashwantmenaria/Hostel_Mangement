package com.example.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hostel.entity.Payment;
import com.example.hostel.service.PaymentService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

	@Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Payment> save(@RequestBody Payment payment) {
        return ResponseEntity.ok(paymentService.save(payment));
    }

    // @GetMapping("/student/{id}")
    // public ResponseEntity<List<Payment>> getByStudent(@PathVariable Long id) {
    //     return ResponseEntity.ok(paymentService.getByStudent(id));
    // }
}
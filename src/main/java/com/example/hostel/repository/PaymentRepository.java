package com.example.hostel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hostel.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

	List<Payment> findByStudentId(Long studentId);
}
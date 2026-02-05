package com.example.hostel.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hostel.entity.Payment;
import com.example.hostel.repository.PaymentRepository;
import com.example.hostel.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Override
	public Payment save(Payment payment) {
		// TODO Auto-generated method stub
        return paymentRepository.save(payment);
	}

	// @Override
	// public List<Payment> getByStudent(Long studentId) {
	// 	// TODO Auto-generated method stub
    //     return paymentRepository.findByStudentId(studentId);
	// }

}

package com.lhlinh.service;

import com.lhlinh.model.Payment;
import com.lhlinh.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public Payment doPayment(Payment payment) {
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }
}

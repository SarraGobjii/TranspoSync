package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Payment;
import com.example.modulemavenspring.repository.Ipaymentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements IpaymentService {
    @Autowired
    private Ipaymentrepository paymentRepository;

    @Override
    public Payment addPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> retrieveAllPayments() {
        return (List<Payment>) paymentRepository.findAll();
    }

    @Override
    public Payment retrievePayment(Long idP) {
        return paymentRepository.findById(idP).orElse(null);
    }

    @Override
    public void removePayment(Long idP) {
        paymentRepository.deleteById(idP);
    }

    @Override
    public Payment modifyPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}

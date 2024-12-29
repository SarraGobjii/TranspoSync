package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements IpaymentService {
    @Override
    public Payment addPayment(Payment payment) {
        return null;
    }

    @Override
    public List<Payment> retrieveAllPayments() {
        return null;
    }

    @Override
    public Payment retrievePayment(Long idP) {
        return null;
    }

    @Override
    public void removePayment(Long idP) {

    }

    @Override
    public Payment modifyPayment(Payment payment) {
        return null;
    }
}

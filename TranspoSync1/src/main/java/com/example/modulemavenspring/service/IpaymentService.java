package com.example.modulemavenspring.service;


import com.example.modulemavenspring.entities.Payment;

import java.util.List;

public interface IpaymentService {
    public Payment addPayment (Payment payment);
    public List<Payment > retrieveAllPayments();
    public  Payment retrievePayment(Long  idP);
    public void removePayment   (Long idP);
    public  Payment   modifyPayment    (Payment payment);
}

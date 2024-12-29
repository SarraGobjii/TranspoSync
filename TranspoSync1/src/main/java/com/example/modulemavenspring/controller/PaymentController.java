package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.service.IpaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PaymentController")
public class PaymentController {
    @Autowired
    IpaymentService paymentService;
}

package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Payment;
import com.example.modulemavenspring.service.IpaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PaymentController")
public class PaymentController {
    @Autowired
    IpaymentService paymentService;

    @PostMapping("/addPayment") //validée
    public Payment addPayment(@RequestBody Payment payment) {
        return paymentService.addPayment(payment);
    }

    @GetMapping("/getPayment/{idP}") //validée
    public Payment retrievePayment(@PathVariable Long idP) {
        return paymentService.retrievePayment(idP);
    }

    @GetMapping("/getAllPayments") //validée
    public List<Payment> retrieveAllPayments() {
        return paymentService.retrieveAllPayments();
    }

    @DeleteMapping("/deletePayment/{idP}") //validée
    public void removePayment(@PathVariable Long idP) {
        paymentService.removePayment(idP);
    }

    @PutMapping("/modifyPayment/{idP}") //validée
    public Payment modifyPayment(@PathVariable Long idP, @RequestBody Payment payment) {
        return paymentService.modifyPayment(payment);
    }

}

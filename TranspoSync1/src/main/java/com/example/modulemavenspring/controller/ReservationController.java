package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.service.IreservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ReservationController")
public class ReservationController {
    @Autowired
    IreservationService reservationService;}

package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.repository.Ipassengerrepository;
import com.example.modulemavenspring.service.IpassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PassengerController")
public class PassengerController {
    @Autowired
    IpassengerService passengerService;
}

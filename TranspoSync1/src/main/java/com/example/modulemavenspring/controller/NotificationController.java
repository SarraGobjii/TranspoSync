package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.service.InotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/NotificationController")
public class NotificationController {
    @Autowired
    InotificationService notificationService;
}

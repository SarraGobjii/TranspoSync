package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.service.IitineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itineraryController")
public class itineraryController {
    @Autowired
     IitineraryService itineraryService;

}

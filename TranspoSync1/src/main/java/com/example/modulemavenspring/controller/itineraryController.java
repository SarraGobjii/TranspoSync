package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Itinerary;
import com.example.modulemavenspring.service.IitineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itineraryController")
public class itineraryController {
    @Autowired
     IitineraryService itineraryService;
    @PostMapping("/additinerary")
    public Itinerary addItinerary (@RequestBody Itinerary itinerary){
        return itineraryService .addItinerary(itinerary);
    }

}

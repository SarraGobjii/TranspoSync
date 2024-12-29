package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Itinerary;
import com.example.modulemavenspring.service.IitineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ItineraryController")
public class ItineraryController {
    @Autowired
     IitineraryService itineraryService;
    @PostMapping("/additinerary")
    public Itinerary addItinerary (@RequestBody Itinerary itinerary){
        return itineraryService .addItinerary(itinerary);
    }
    @GetMapping("/getitinerary")
    public List<Itinerary> getAllItineraires() {
        return IitineraryService.getAllItineraires();
    }

    @GetMapping("/{id}")
    public Optional<Itinerary> getItineraireById(@PathVariable Long id) {
        return itineraireService.getItineraireById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteItineraire(@PathVariable Long id) {
        IitineraryService.removeItinerary(id);
    }

}

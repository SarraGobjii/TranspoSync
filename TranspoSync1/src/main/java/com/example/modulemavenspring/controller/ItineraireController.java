package com.example.modulemavenspring.controller;


import com.example.modulemavenspring.entities.Itineraire;
import com.example.modulemavenspring.service.IItineraireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itineraire")
public class ItineraireController {

    @Autowired
    private IItineraireService itineraireService;


    @GetMapping("/all")
    public List<Itineraire> getAllItineraires() {
        return itineraireService.getAllItineraires();
    }

    @GetMapping("/{id}")
    public Itineraire getItineraireById(@PathVariable Long id) {
        return itineraireService.getItineraireById(id);
    }

    @PostMapping("/create")
    public Itineraire createItineraire(@RequestBody Itineraire itineraire) {
        return itineraireService.createItineraire(itineraire);
    }

    @PutMapping("/update/{id}")
    public Itineraire updateItineraire(@PathVariable Long id, @RequestBody Itineraire updatedItineraire) {
        return itineraireService.updateItineraire(id, updatedItineraire);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItineraire(@PathVariable Long id) {
        itineraireService.deleteItineraire(id);
    }
}

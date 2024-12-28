package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Itineraire;
import com.example.modulemavenspring.service.IItineraireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/itineraires")
public class ItineraireController {

    @Autowired
    private IItineraireService itineraireService;

    @PostMapping
    public Itineraire addItineraire(@RequestBody Itineraire itineraire) {
        return itineraireService.saveItineraire(itineraire);
    }

    @GetMapping
    public List<Itineraire> getAllItineraires() {
        return itineraireService.getAllItineraires();
    }

    @GetMapping("/{id}")
    public Optional<Itineraire> getItineraireById(@PathVariable Long id) {
        return itineraireService.getItineraireById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteItineraire(@PathVariable Long id) {
        itineraireService.deleteItineraire(id);
    }
}

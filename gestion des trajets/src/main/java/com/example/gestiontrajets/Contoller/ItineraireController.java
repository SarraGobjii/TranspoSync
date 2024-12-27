package com.example.gestiontrajets.Contoller;

import com.example.gestiontrajets.Entities.Itineraire;
import com.example.gestiontrajets.Service.IItineraireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itineraires")
public class ItineraireController {

    @Autowired
    private IItineraireService itineraireService;

    @PostMapping
    public ResponseEntity<Itineraire> createItineraire(@RequestBody Itineraire itineraire) {
        Itineraire savedItineraire = itineraireService.saveItineraire(itineraire);
        return new ResponseEntity<>(savedItineraire, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Itineraire>> getAllItineraires() {
        return new ResponseEntity<>(itineraireService.getAllItineraires(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Itineraire> getItineraireById(@PathVariable Long id) {
        return itineraireService.getItineraireById(id)
                .map(itineraire -> new ResponseEntity<>(itineraire, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItineraire(@PathVariable Long id) {
        itineraireService.deleteItineraire(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

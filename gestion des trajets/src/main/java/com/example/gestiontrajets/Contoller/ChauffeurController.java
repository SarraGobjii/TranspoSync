package com.example.gestiontrajets.Contoller;

import com.example.gestiontrajets.Entities.Chauffeur;
import com.example.gestiontrajets.Service.IChauffeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chauffeurs")
public class ChauffeurController {

    @Autowired
    private IChauffeurService chauffeurService;

    @PostMapping
    public ResponseEntity<Chauffeur> createChauffeur(@RequestBody Chauffeur chauffeur) {
        Chauffeur savedChauffeur = chauffeurService.saveChauffeur(chauffeur);
        return new ResponseEntity<>(savedChauffeur, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Chauffeur>> getAllChauffeurs() {
        return new ResponseEntity<>(chauffeurService.getAllChauffeurs(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chauffeur> getChauffeurById(@PathVariable Long id) {
        return chauffeurService.getChauffeurById(id)
                .map(chauffeur -> new ResponseEntity<>(chauffeur, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChauffeur(@PathVariable Long id) {
        chauffeurService.deleteChauffeur(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

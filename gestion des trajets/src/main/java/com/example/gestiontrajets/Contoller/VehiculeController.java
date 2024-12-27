package com.example.gestiontrajets.Contoller;

import com.example.gestiontrajets.Entities.Vehicule;
import com.example.gestiontrajets.Service.IVehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
public class VehiculeController {

    @Autowired
    private IVehiculeService vehiculeService;

    @PostMapping
    public ResponseEntity<Vehicule> createVehicule(@RequestBody Vehicule vehicule) {
        Vehicule savedVehicule = vehiculeService.saveVehicule(vehicule);
        return new ResponseEntity<>(savedVehicule, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Vehicule>> getAllVehicules() {
        return new ResponseEntity<>(vehiculeService.getAllVehicules(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicule> getVehiculeById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id)
                .map(vehicule -> new ResponseEntity<>(vehicule, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

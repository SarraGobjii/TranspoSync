package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Vehicule;
import com.example.modulemavenspring.service.IVehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicules")
public class VehiculeController {

    @Autowired
    private IVehiculeService vehiculeService;

    @PostMapping
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.saveVehicule(vehicule);
    }

    @GetMapping
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/{id}")
    public Vehicule getVehicleById(@PathVariable Long id) {
        return vehiculeService.getVehicleById(id);
    }

    @PutMapping("/{id}")
    public Vehicule updateVehicle(@PathVariable Long id, @RequestBody Vehicule vehicleDetails) {
        return vehiculeService.updateVehicle(id, vehicleDetails);
    }


    @DeleteMapping("/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }
}

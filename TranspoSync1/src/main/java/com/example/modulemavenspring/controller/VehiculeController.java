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

    @PostMapping("/addVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.saveVehicule(vehicule);
    }

    @GetMapping("/getAllVehicule")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/getVehicule/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @PutMapping("/updateVehicule/{id}")
    public Vehicule updateVehicle(@PathVariable Long id, @RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(id,vehicule);
    }


    @DeleteMapping("/deleteVehicule/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }
}

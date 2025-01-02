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

    @PostMapping("/addVehicule") //validée
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.saveVehicule(vehicule);
    }

    @GetMapping("/getAllVehicule") //validée
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/getVehicule/{idVehicule}") //non validée
    public Vehicule getVehicleById(@PathVariable Long idVehicule) {
        return vehiculeService.getVehiculeById(idVehicule);
    }

    @PutMapping("/updateVehicule/{idVehicule}") //ferghaa
    public Vehicule updateVehicle(@PathVariable Long idVehicule, @RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(idVehicule, vehicule);
    }


    @DeleteMapping("/deleteVehicule/{idVehicule}") //validée
    public void deleteVehicule(@PathVariable Long idVehicule) {
        vehiculeService.deleteVehicule(idVehicule);
    }
}

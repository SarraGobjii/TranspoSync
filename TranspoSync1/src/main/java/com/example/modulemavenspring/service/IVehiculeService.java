package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Vehicule;

import java.util.List;
import java.util.Optional;

public interface IVehiculeService {
    Vehicule saveVehicule(Vehicule vehicule);
    List<Vehicule> getAllVehicules();
    void deleteVehicule(Long id);
    Vehicule getVehicleById(Long id);

    Vehicule updateVehicle(Long id, Vehicule vehicleDetails);
}

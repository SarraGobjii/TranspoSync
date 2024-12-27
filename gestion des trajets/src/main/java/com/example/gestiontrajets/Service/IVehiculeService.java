package com.example.gestiontrajets.Service;

import com.example.gestiontrajets.Entities.Vehicule;

import java.util.List;
import java.util.Optional;

public interface IVehiculeService {
    Vehicule saveVehicule(Vehicule vehicule);
    List<Vehicule> getAllVehicules();
    Optional<Vehicule> getVehiculeById(Long id);
    void deleteVehicule(Long id);

    Vehicule save(Vehicule vehicule);
}


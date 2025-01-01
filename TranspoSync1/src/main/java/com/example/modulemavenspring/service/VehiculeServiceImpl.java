package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itineraire;
import com.example.modulemavenspring.entities.Vehicule;
import com.example.modulemavenspring.repository.IVehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehiculeServiceImpl implements IVehiculeService {

    @Autowired
    private IVehiculeRepository vehiculeRepository;

    @Override
    public Vehicule saveVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return (List<Vehicule>) vehiculeRepository.findAll();
    }


    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return (Vehicule) vehiculeRepository.findAll();
    }

    @Override
    public Vehicule updateVehicule(Long id, Vehicule vehicleDetails) {
        return vehiculeRepository.save(vehicleDetails);
    }


}



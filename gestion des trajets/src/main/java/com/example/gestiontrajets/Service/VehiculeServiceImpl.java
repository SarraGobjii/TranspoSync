package com.example.gestiontrajets.Service;

import com.example.gestiontrajets.Entities.Vehicule;
import com.example.gestiontrajets.Repository.IVehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Vehicule> getVehiculeById(Long id) {
        return vehiculeRepository.findById(id);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public Vehicule save(Vehicule vehicule) {
        return null;
    }
}

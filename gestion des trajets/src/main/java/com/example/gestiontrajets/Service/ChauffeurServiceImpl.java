package com.example.gestiontrajets.Service;

import com.example.gestiontrajets.Entities.Chauffeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChauffeurServiceImpl implements IChauffeurService {


    @Override
    public Chauffeur saveChauffeur(Chauffeur chauffeur) {
        return null;
    }

    @Override
    public List<Chauffeur> getAllChauffeurs() {
        return null;
    }

    @Override
    public Optional<Chauffeur> getChauffeurById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteChauffeur(Long id) {

    }
}

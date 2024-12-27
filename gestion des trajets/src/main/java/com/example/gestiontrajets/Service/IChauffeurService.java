package com.example.gestiontrajets.Service;

import com.example.gestiontrajets.Entities.Chauffeur;

import java.util.List;
import java.util.Optional;

public interface IChauffeurService {
    Chauffeur saveChauffeur(Chauffeur chauffeur);
    List<Chauffeur> getAllChauffeurs();
    Optional<Chauffeur> getChauffeurById(Long id);
    void deleteChauffeur(Long id);
}

package com.example.gestiontrajets.Service;

import com.example.gestiontrajets.Entities.Itineraire;

import java.util.List;
import java.util.Optional;

public interface IItineraireService {
    Itineraire saveItineraire(Itineraire itineraire);
    List<Itineraire> getAllItineraires();
    Optional<Itineraire> getItineraireById(Long id);
    void deleteItineraire(Long id);
}

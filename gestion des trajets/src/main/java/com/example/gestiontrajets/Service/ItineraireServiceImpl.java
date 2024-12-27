package com.example.gestiontrajets.Service;

import com.example.gestiontrajets.Entities.Itineraire;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItineraireServiceImpl implements IItineraireService {


    @Override
    public Itineraire saveItineraire(Itineraire itineraire) {
        return null;
    }

    @Override
    public List<Itineraire> getAllItineraires() {
        return null;
    }

    @Override
    public Optional<Itineraire> getItineraireById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteItineraire(Long id) {

    }
}

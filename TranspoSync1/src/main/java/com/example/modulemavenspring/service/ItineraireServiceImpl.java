package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itineraire;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItineraireServiceImpl implements IItineraireService {

    @Override
    public List<Itineraire> getAllItineraires() {
        return null;
    }

    @Override
    public Itineraire getItineraireById(Long id) {
        return null;
    }

    @Override
    public Itineraire createItineraire(Itineraire itineraire) {
        return null;
    }

    @Override
    public Itineraire updateItineraire(Long id, Itineraire updatedItineraire) {
        return null;
    }

    @Override
    public void deleteItineraire(Long id) {

    }
}


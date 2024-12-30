package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itineraire;

public interface IItineraireService {

    Itineraire getItineraireById(Long id);

    Itineraire createItineraire(Itineraire itineraire);

    Itineraire updateItineraire(Long id, Itineraire updatedItineraire);

    void deleteItineraire(Long id);
}

package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itineraire;

import java.util.List;

public interface IItineraireService {

    List<Itineraire> getAllItineraires();

    Itineraire getItineraireById(Long id);

    Itineraire createItineraire(Itineraire itineraire);

    Itineraire updateItineraire(Long id, Itineraire updatedItineraire);

    void deleteItineraire(Long id);
}

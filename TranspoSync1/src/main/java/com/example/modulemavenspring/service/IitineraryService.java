package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itinerary;

import java.util.List;
import java.util.Optional;

public interface IitineraryService {
    Itinerary saveItineraire(Itinerary itinerary);
    List<Itinerary> getAllItineraires();
    Optional<Itinerary> getItineraireById(Long id);
    void deleteItineraire(Long id);
}

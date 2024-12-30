package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itinerary;

import java.util.List;
import java.util.Optional;

public interface IitineraryService {
    Itinerary addItinerary(Itinerary itinerary);
    Itinerary saveItineraire(Itinerary itinerary);
    List<Itinerary> getAllItineraires();
    Optional<Itinerary> getItineraireById(Long id);
    void deleteItineraire(Long id);

    List<Itinerary> retrieveAllItineraries();

    Itinerary retrieveItinerary(Long iditinerary);

    void removeItinerary(Long iditinerary);

    Itinerary modifyItinerary(Itinerary itinerary);
}

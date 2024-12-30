package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itinerary;
import com.example.modulemavenspring.repository.Iitineraryrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class itineraryServiceImpl implements IitineraryService {
    @Autowired
    private Iitineraryrepository itineraryrepository;

    @Override
    public Itinerary addItinerary(Itinerary itinerary) {
        return itineraryrepository.save(itinerary);
    }

    @Override
    public Itinerary saveItineraire(Itinerary itinerary) {
        return null;
    }

    @Override
    public List<Itinerary> getAllItineraires() {
        return null;
    }

    @Override
    public Optional<Itinerary> getItineraireById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteItineraire(Long id) {

    }

    @Override
    public List<Itinerary> retrieveAllItineraries() {
        return null;
    }

    @Override
    public Itinerary retrieveItinerary(Long iditinerary) {
        return null;
    }

    @Override
    public void removeItinerary(Long iditinerary) {

    }

    @Override
    public Itinerary modifyItinerary(Itinerary itinerary) {
        return null;
    }
}

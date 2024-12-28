package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itinerary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class itineraryServiceImpl implements IitineraryService {
    @Autowired
    private CrudRepository itineraryrepository;

    @Override
    public Itinerary addItinerary(Itinerary itinerary) {
        return null;
    }
}

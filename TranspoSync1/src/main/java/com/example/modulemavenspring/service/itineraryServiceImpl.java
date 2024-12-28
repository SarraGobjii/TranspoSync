package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itinerary;
import com.example.modulemavenspring.repository.Iitineraryrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class itineraryServiceImpl implements IitineraryService {
    @Autowired
    private Iitineraryrepository itineraryrepository;

    @Override
    public Itinerary addItinerary(Itinerary itinerary) {
        return itineraryrepository.save(itinerary);
    }
}

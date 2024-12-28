package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itineraire;
import com.example.modulemavenspring.repository.IItineraireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItineraireServiceImpl implements IItineraireService {

    @Autowired
    private IItineraireRepository itineraireRepository;

    @Override
    public Itineraire saveItineraire(Itineraire itineraire) {
        return itineraireRepository.save(itineraire);
    }

    @Override
    public List<Itineraire> getAllItineraires() {
        return (List<Itineraire>) itineraireRepository.findAll();
    }

    @Override
    public Optional<Itineraire> getItineraireById(Long id) {
        return itineraireRepository.findById(id);
    }

    @Override
    public void deleteItineraire(Long id) {
        itineraireRepository.deleteById(id);
    }
}

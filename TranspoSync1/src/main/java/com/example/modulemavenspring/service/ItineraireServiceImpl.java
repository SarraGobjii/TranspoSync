package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itineraire;
import com.example.modulemavenspring.repository.IItinerairerepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItineraireServiceImpl implements IItineraireService {

    private final IItinerairerepository itineraireRepository;

    @Autowired
    public ItineraireServiceImpl(IItinerairerepository itineraireRepository) {
        this.itineraireRepository = itineraireRepository;
    }

    @Override
    public List<Itineraire> getAllItineraires() {
        return itineraireRepository.findAll();
    }

    @Override
    public Itineraire getItineraireById(Long id) {
        return itineraireRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Itinéraire non trouvé"));
    }

    @Override
    public Itineraire createItineraire(Itineraire itineraire) {
        return itineraireRepository.save(itineraire);
    }

    @Override
    public Itineraire updateItineraire(Long id, Itineraire updatedItineraire) {
        return itineraireRepository.save(existingItineraire);
    }

    @Override
    public void deleteItineraire(Long id) {
         return itineraireRepository.delete(Itineraire);
    }
}
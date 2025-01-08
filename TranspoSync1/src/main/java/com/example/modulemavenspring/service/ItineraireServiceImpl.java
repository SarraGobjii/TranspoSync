package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Itineraire;
import com.example.modulemavenspring.repository.IItinerairerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ItineraireServiceImpl implements IItineraireService {

    @Autowired
    private IItinerairerepository itineraireRepository;


    @Override
    public Itineraire createItineraire(Itineraire itineraire) {
        return itineraireRepository.save(itineraire);  // Sauvegarde l'itinéraire dans la bd
    }

    @Override
    public List<Itineraire> getAllItineraires() {
        return (List<Itineraire>) itineraireRepository.findAll();
    }

    @Override
    public Itineraire getItineraireById(Long id) {
        return itineraireRepository.findById(id).orElse(null);  // Retourne l'itinéraire ou null si non trouvé
    }

    @Override
    public void deleteItineraire(Long id) {
        itineraireRepository.deleteById(id);
    }

    @Override
    public Itineraire updateItineraire(Long id, Itineraire itineraireDetails) {
        return itineraireRepository.save(itineraireDetails);
}}

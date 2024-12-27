package com.example.gestiontrajets.Repository;

import com.example.gestiontrajets.Entities.Itineraire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItineraireRepository extends JpaRepository<Itineraire, Long> {
}


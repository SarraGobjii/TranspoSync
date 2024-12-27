package com.example.gestiontrajets.Repository;

import com.example.gestiontrajets.Entities.Chauffeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChauffeurRepository extends JpaRepository<Chauffeur, Long> {
}

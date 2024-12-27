package com.example.gestiontrajets.Repository;

import com.example.gestiontrajets.Entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculeRepository extends JpaRepository<Vehicule, Long> {
}
package com.example.gestiontrajets.Repository;

import com.example.gestiontrajets.Entities.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStationRepository extends JpaRepository<Station, Long> {
}

package com.example.modulemavenspring.repository;

import com.example.modulemavenspring.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Ireservationrepository extends CrudRepository<Reservation, Long> {
    List<Reservation> findByVehiculeId(Long vehiculeId);
}

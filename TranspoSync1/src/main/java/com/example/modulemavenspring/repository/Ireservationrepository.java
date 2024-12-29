package com.example.modulemavenspring.repository;

import com.example.modulemavenspring.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ireservationrepository extends CrudRepository<Reservation, Long> {
}

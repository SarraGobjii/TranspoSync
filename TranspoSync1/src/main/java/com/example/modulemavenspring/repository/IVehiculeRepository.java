package com.example.modulemavenspring.repository;

import com.example.modulemavenspring.entities.Vehicule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculeRepository extends CrudRepository<Vehicule, Long> {
}

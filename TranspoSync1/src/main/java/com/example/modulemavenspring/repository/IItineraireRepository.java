package com.example.modulemavenspring.repository;

import com.example.modulemavenspring.entities.Itineraire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItineraireRepository extends CrudRepository<Itineraire, Long> {
}

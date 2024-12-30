package com.example.modulemavenspring.repository;

import com.example.modulemavenspring.entities.Itineraire;
import org.springframework.data.repository.CrudRepository;

public interface IItinerairerepository extends CrudRepository<Itineraire, Long> {
}

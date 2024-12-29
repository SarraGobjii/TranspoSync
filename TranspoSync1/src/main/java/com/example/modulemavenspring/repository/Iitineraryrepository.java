package com.example.modulemavenspring.repository;

import com.example.modulemavenspring.entities.Itinerary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iitineraryrepository extends CrudRepository<Itinerary, Long > {
}

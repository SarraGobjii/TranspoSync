package com.example.modulemavenspring.repository;

import com.example.modulemavenspring.entities.Passenger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ipassengerrepository extends CrudRepository<Passenger, Long> {
}

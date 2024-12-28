package com.example.modulemavenspring.repository;

import com.example.modulemavenspring.entities.Station;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStationRepository extends CrudRepository<Station, Long> {
}

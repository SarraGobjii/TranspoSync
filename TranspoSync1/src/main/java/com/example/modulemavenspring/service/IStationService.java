package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Station;

import java.util.List;
import java.util.Optional;

public interface IStationService {
    Station saveStation(Station station);
    List<Station> getAllStations();
    Optional<Station> getStationById(Long id);
    void deleteStation(Long id);
}

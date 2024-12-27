package com.example.gestiontrajets.Service;

import com.example.gestiontrajets.Entities.Station;

import java.util.List;
import java.util.Optional;

public interface IStationService {
    Station saveStation(Station station);
    List<Station> getAllStations();
    Optional<Station> getStationById(Long id);
    void deleteStation(Long id);
}

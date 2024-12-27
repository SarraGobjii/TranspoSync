package com.example.gestiontrajets.Service;

import com.example.gestiontrajets.Entities.Station;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StationServiceImpl implements IStationService {


    @Override
    public Station saveStation(Station station) {
        return null;
    }

    @Override
    public List<Station> getAllStations() {
        return null;
    }

    @Override
    public Optional<Station> getStationById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteStation(Long id) {

    }
}

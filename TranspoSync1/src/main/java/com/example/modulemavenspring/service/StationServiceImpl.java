package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Station;
import com.example.modulemavenspring.repository.IStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StationServiceImpl implements IstationService {

    @Autowired
    private IStationRepository stationRepository;

    @Override
    public Station saveStation(Station station) {
        return stationRepository.save(station);
    }

    @Override
    public List<Station> getAllStations() {
        return (List<Station>) stationRepository.findAll();
    }

    @Override
    public Optional<Station> getStationById(Long id) {
        return stationRepository.findById(id);
    }

    @Override
    public void deleteStation(Long id) {
        stationRepository.deleteById(id);
    }

    @Override
    public Station updateStation(Long id, Station stationDetails) {
        return null;
    }
}

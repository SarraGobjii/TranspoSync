package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Station;
import com.example.modulemavenspring.service.IstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stations")
public class StationController {

    @Autowired
    private IstationService stationService;

    @PostMapping
    public Station addStation(@RequestBody Station station) {
        return stationService.saveStation(station);
    }

    @GetMapping
    public List<Station> getAllStations() {
        return stationService.getAllStations();
    }

    @GetMapping("/{id}")
    public Optional<Station> getStationById(@PathVariable Long id) {
        return stationService.getStationById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStation(@PathVariable Long id) {
        stationService.deleteStation(id);
    }
}

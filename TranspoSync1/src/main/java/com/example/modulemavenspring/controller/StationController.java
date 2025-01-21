package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Station;
import com.example.modulemavenspring.entities.Vehicule;
import com.example.modulemavenspring.service.IstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stations")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class StationController {

    @Autowired
    private IstationService stationService;

    @PostMapping("/addStation")
    public Station addStation(@RequestBody Station station) {
        return stationService.saveStation(station);
    }

    @GetMapping("/getAllStations")
    public List<Station> getAllStations() {
        return stationService.getAllStations();
    }

    @GetMapping("/getStation/{id}")
    public Optional<Station> getStationById(@PathVariable Long id) {
        return stationService.getStationById(id);
    }
    @PutMapping("/updateStation/{id}")
    public Station updateStation(@PathVariable Long id, @RequestBody Station station) {
        return stationService.updateStation(station);
    }

    @DeleteMapping("/deleteStation/{id}")
    public void deleteStation(@PathVariable Long id) {
        stationService.deleteStation(id);
    }

}

package com.example.gestiontrajets.Contoller;

import com.example.gestiontrajets.Entities.Station;
import com.example.gestiontrajets.Service.IStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stations")
public class StationController {

    @Autowired
    private IStationService stationService;

    @PostMapping
    public ResponseEntity<Station> createStation(@RequestBody Station station) {
        Station savedStation = stationService.saveStation(station);
        return new ResponseEntity<>(savedStation, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Station>> getAllStations() {
        return new ResponseEntity<>(stationService.getAllStations(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Station> getStationById(@PathVariable Long id) {
        return stationService.getStationById(id)
                .map(station -> new ResponseEntity<>(station, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStation(@PathVariable Long id) {
        stationService.deleteStation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

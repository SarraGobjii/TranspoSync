package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Passenger;
import com.example.modulemavenspring.service.IpassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PassengerController")
public class PassengerController {
    @Autowired
    private IpassengerService passengerService;
    @PostMapping("/addPassenger") //validée
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerService.addPassenger(passenger);
    }

    @GetMapping("/getPassenger/{id}") //validée
    public Passenger retrievePassenger(@PathVariable Long id) {
        return passengerService.retrievePassenger(id);
    }

    @GetMapping("/getAllPassengers") //validée
    public List<Passenger> retrieveAllPassengers() {
        return passengerService.retrieveAllPassengers();
    }

    @DeleteMapping("/deletePassenger/{id}") //validée
    public void removePassenger(@PathVariable Long id) {
        passengerService.removePassenger(id);
    }
    @PutMapping("/modifyPassenger/{id}") //validéé
    public Passenger modifyPassenger(@PathVariable Long id, @RequestBody Passenger passenger) {
        return passengerService.modifyPassenger(passenger);
    }
}

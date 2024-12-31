package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Reservation;
import com.example.modulemavenspring.service.IreservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ReservationController")
public class ReservationController {
    @Autowired
    IreservationService reservationService;
    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @GetMapping("/getReservation/{idR}")
    public Reservation retrieveReservation(@PathVariable Long idR) {
        return reservationService.retrieveReservation(idR);
    }

    @GetMapping("/getAllReservations")
    public List<Reservation> retrieveAllReservations() {
        return reservationService.retrieveAllReservations();
    }

    @DeleteMapping("/deleteReservation/{idR}")
    public void removeReservation(@PathVariable Long idR) {
        reservationService.removeReservation(idR);
    }

    @PutMapping("/modifyReservation/{idR}")
    public Reservation modifyReservation(@PathVariable Long idR, @RequestBody Reservation reservation) {
        return reservationService.modifyReservation(reservation);
    }
}

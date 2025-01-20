package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Reservation;
import com.example.modulemavenspring.entities.SeatStatus;
import com.example.modulemavenspring.service.IreservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/ReservationController")
public class ReservationController {


    @Autowired
    private IreservationService reservationService;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }


    @GetMapping("/getReservation/{idR}") //validée
    public Reservation retrieveReservation(@PathVariable Long idR) {
        return reservationService.retrieveReservation(idR);
    }

    @GetMapping("/getAllReservations") //validée
    public List<Reservation> retrieveAllReservations() {
        return reservationService.retrieveAllReservations();
    }

    @DeleteMapping("/deleteReservation/{idR}") //validée
    public void removeReservation(@PathVariable Long idR) {
        reservationService.removeReservation(idR);
    }

    @PutMapping("/modifyReservation/{idR}")
    public Reservation modifyReservation(@PathVariable Long idR, @RequestBody Reservation reservation) {
        return reservationService.modifyReservation(reservation);
    }
}

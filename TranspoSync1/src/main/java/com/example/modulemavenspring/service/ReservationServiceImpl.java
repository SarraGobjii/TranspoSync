package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Reservation;
import com.example.modulemavenspring.entities.SeatStatus;
import com.example.modulemavenspring.entities.Vehicule;
import com.example.modulemavenspring.repository.IVehiculeRepository;
import com.example.modulemavenspring.repository.Ireservationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ReservationServiceImpl implements IreservationService {
    @Autowired
    private Ireservationrepository reservationRepository;
    @Autowired
    private IVehiculeRepository vehiculeRepository;


    @Override
        public Reservation addReservation(Reservation reservation) {
            return reservationRepository.save(reservation);
        }

        @Override
        public List<Reservation> retrieveAllReservations() {
            return (List<Reservation>) reservationRepository.findAll();
        }

        @Override
        public Reservation retrieveReservation(Long idR) {
            return reservationRepository.findById(idR).orElse(null);
        }

        @Override
        public void removeReservation(Long idR) {
            reservationRepository.deleteById(idR);
        }

        @Override
        public Reservation modifyReservation(Reservation reservation) {
            return reservationRepository.save(reservation);
        }

}

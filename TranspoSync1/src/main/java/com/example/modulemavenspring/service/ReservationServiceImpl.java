package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Reservation;
import com.example.modulemavenspring.repository.Ireservationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements IreservationService {
    @Autowired
    private Ireservationrepository reservationRepository;

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

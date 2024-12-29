package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements IreservationService {
    @Override
    public Reservation addReservation(Reservation reservation) {
        return null;
    }

    @Override
    public List<Reservation> retrieveAllReservations() {
        return null;
    }

    @Override
    public Reservation retrieveReservation(Long idR) {
        return null;
    }

    @Override
    public void removeReservation(Long idR) {

    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return null;
    }
}

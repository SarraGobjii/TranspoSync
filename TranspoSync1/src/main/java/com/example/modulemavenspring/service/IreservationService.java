package com.example.modulemavenspring.service;


import com.example.modulemavenspring.entities.Notification;
import com.example.modulemavenspring.entities.Reservation;
import com.example.modulemavenspring.entities.SeatStatus;

import java.util.List;
import java.util.Map;

public interface IreservationService {
    Map<Integer, SeatStatus> getSeatStatuses(Long vehiculeId);

    Map<String, List<Integer>> getAvailableSeats(Long vehiculeId, Long stationId);

    public Reservation addReservation (Reservation reservation);
    public List<Reservation > retrieveAllReservations();
    public  Reservation retrieveReservation(Long  idR);
    public void removeReservation  (Long idR);
    public  Reservation   modifyReservation   (Reservation reservation);

}

package com.example.modulemavenspring.service;


import com.example.modulemavenspring.entities.Passenger;

import java.util.List;

public interface IpassengerService {
    public Passenger addPassenger (Passenger passenger);
    public List<Passenger> retrieveAllPassengers();
    public  Passenger retrieveNotification(Long  id);
    public void removePassenger   (Long id);
    public  Passenger   modifyPassenger   (Passenger passenger);
}

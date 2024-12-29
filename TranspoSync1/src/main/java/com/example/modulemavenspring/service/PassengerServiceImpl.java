package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Passenger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImpl implements IpassengerService {
    @Override
    public Passenger addPassenger(Passenger passenger) {
        return null;
    }

    @Override
    public List<Passenger> retrieveAllPassengers() {
        return null;
    }

    @Override
    public Passenger retrieveNotification(Long id) {
        return null;
    }

    @Override
    public void removePassenger(Long id) {

    }

    @Override
    public Passenger modifyPassenger(Passenger passenger) {
        return null;
    }
}

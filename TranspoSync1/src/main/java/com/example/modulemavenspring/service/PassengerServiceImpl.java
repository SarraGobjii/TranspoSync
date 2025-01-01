package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Passenger;
import com.example.modulemavenspring.repository.Ipassengerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImpl implements IpassengerService {
    @Autowired
    private Ipassengerrepository passengerRepository;

        @Override
        public Passenger addPassenger(Passenger passenger) {
            return passengerRepository.save(passenger);
        }

        @Override
        public List<Passenger> retrieveAllPassengers() {
            return (List<Passenger>) passengerRepository.findAll();
        }

        @Override
        public Passenger retrievePassenger(Long id) {
            return passengerRepository.findById(id).orElse(null);
        }

        @Override
        public void removePassenger(Long id) {
            passengerRepository.deleteById(id);
        }

        @Override
        public Passenger modifyPassenger(Passenger passenger) {
            return passengerRepository.save(passenger);
        }
    }

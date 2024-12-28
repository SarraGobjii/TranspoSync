package com.example.modulemavenspring.entities;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Notification implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private Long idN;
    private String message;
    @OneToOne
    private Passenger passenger;
    @OneToOne
    private Reservation reservationN;

}

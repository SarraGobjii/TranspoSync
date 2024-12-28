package com.example.modulemavenspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idR;
    private int seatNumber;
    private boolean accessibility;
    @ManyToOne
    private Passenger passenger;
    @OneToOne (mappedBy = "reservation")
    private Payment payment;
    @OneToOne(mappedBy = "resevationN")
    private Notification notification;

}

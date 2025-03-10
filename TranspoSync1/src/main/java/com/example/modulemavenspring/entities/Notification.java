package com.example.modulemavenspring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Notification implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private Long idN;

    private String title;
    private String message;
    @ManyToOne
    private Passenger passenger;
    @OneToOne
    private Reservation reservationN;

}

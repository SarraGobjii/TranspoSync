package com.example.modulemavenspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Itineraire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItineraire;
    private String route;
    private LocalDateTime heureDebut;
    private LocalDateTime heureFin;
    @OneToMany



}
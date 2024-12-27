package com.example.gestiontrajets.Entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Itineraire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItineraire;
    private String route;
    private LocalDateTime heureDebut;
    private LocalDateTime heureFin;

    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;

    // Getters and Setters
}

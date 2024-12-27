package com.example.gestiontrajets.Entities;

import jakarta.persistence.*;

@Entity
public class Chauffeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChauffeur;

    @OneToOne
    @JoinColumn(name = "vehicule_id", referencedColumnName = "idVehicle")
    private Vehicule vehicule;

    // Getters and Setters
}

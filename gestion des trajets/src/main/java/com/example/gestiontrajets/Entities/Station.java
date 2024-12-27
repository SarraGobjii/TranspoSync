package com.example.gestiontrajets.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStation;
    private String nom;
    private String adresse;

    @ManyToMany(mappedBy = "stations")
    private List<Vehicule> vehicules;

    // Getters and Setters
}

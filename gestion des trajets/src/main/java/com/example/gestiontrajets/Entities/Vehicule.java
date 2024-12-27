package com.example.gestiontrajets.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicle;
    private String localisation;
    private String type;

    @OneToOne(mappedBy = "vehicule", cascade = CascadeType.ALL)
    private Chauffeur chauffeur;

    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    private List<Itineraire> itineraires;

    @ManyToMany
    @JoinTable(
            name = "vehicule_station",
            joinColumns = @JoinColumn(name = "vehicule_id"),
            inverseJoinColumns = @JoinColumn(name = "station_id")
    )
    private List<Station> stations;

    // Getters and Setters
}

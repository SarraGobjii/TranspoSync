package com.example.modulemavenspring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Itineraire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalTime heureDebut;

    private LocalTime heureFin;
    @Transient
    private String duree;
    private String trajet;
    @OneToMany
    private List<Vehicule> vehicules;
}

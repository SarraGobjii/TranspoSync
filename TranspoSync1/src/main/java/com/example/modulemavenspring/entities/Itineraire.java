package com.example.modulemavenspring.entities;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Itineraire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Time heureDebut;

    private Time heureFin;
    private String trajet;

    @OneToMany
    private List<Vehicule> vehicules;
}

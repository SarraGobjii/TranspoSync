package com.example.modulemavenspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStation;

    private String nom;
    private String localisation;

    @OneToMany(mappedBy = "station", cascade = CascadeType.ALL)
    private List<Vehicule> vehicules;
    @OneToMany(mappedBy = "station",cascade = CascadeType.ALL)
    private List<Vehicule> vehicule;
    @ManyToMany
    private List<Vehicule> VehiculesPassantes;

 }

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
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    //for testing
    //private String Licence;
    private String localisation;
    private String type;

    @ManyToOne
    private Itineraire itineraire;
    @ManyToOne
    private Station stationDepart;
    @ManyToOne
    private Station stationArrivee;
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    private List<Reservation> reservations;
    @ManyToMany
    private List <Station> stations;


}

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
    private String localisation;
    private String type;

    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    private List<Itineraire> itineraries;

    @ManyToOne
    private Station station;


}

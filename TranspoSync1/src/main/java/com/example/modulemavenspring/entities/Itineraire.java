package com.example.modulemavenspring.entities;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Itineraire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalTime heureDebut;
<<<<<<<<< Temporary merge branch 1

    private LocalTime heureFin;
=========
    private LocalTime heureFin;

    //@Transient
    //private String duree;
>>>>>>>>> Temporary merge branch 2
    private String trajet;
    @JsonIgnore
    @OneToMany
    private List<Vehicule> vehicules;
}

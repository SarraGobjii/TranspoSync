package com.example.modulemavenspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Itinerary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iditinerary;
    private String road;
    private LocalDateTime startDate;
    private LocalDateTime EndDate;
    @ManyToOne
    private Vehicule vehicule;


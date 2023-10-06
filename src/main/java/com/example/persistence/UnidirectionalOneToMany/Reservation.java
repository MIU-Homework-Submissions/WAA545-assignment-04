package com.example.persistence.UnidirectionalOneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reservation {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}

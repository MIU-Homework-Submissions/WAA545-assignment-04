package com.example.persistence.UnidirectionalOneToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reservation> reservations;
}

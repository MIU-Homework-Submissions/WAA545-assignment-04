package com.example.persistence.UnidirectionalManyToOne2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "reservation_system_books")
public class Book {
    @Id
    private int id;

    @ManyToOne()
    private Reservation reservation;
}

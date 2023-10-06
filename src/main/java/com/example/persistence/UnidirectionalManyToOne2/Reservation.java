package com.example.persistence.UnidirectionalManyToOne2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity(name = "reservation_system_reservations")
public class Reservation {
    @Id
    private int id;

    @OneToMany(mappedBy = "reservation")
    private List<Book> books;
}

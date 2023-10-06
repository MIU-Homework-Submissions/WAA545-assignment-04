package com.example.persistence.UniDirectionalManyToOne;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String author;
    private String isbn;

    @ManyToOne
    private Publisher publisher;
}

package com.example.persistence.UniDirectionalManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "publishers")
public class Publisher {
    @Id
    private int id;
}

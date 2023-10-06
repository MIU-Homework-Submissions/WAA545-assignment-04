package com.example.persistence.BidirectionalOneToMany;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String email;

    // create one-to-one relationship with department
    @ManyToOne()
    @JoinColumn(name = "department_id")
    private Department department;
}

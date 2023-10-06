package com.example.persistence.BidirectionalManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "employee_office_employees")
public class Employee {
    @Id
    private int id;

    @ManyToOne
    private Office office;
}

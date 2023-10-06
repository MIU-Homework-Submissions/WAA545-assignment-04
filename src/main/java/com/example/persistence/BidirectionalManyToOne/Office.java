package com.example.persistence.BidirectionalManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity(name = "employee_office_offices")
public class Office {
    @Id
    private int id;

    @OneToMany(mappedBy = "office")
    private List<Employee> employees;
}

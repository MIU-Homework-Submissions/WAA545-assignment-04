package com.example.persistence.BidirectionalOneToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    private int id;
    private String name;
    private String location;
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;
}

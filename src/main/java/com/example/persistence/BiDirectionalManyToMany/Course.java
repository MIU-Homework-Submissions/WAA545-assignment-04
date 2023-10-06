package com.example.persistence.BiDirectionalManyToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Course {
    @Id
    private int id;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}

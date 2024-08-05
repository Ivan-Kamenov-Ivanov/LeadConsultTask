package com.leadconsult.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    List<Course> courses;
    List<Group> groups;

    public Student() {
    }

    public Student(long id) {
        this.id = id;
    }

}

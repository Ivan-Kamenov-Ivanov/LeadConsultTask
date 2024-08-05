package com.leadconsult.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    private List<Course> courses;
    private List<Group> groups;

    public Teacher() {
    }

    public Teacher(long id) {
        this.id = id;
    }

}

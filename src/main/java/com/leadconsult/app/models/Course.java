package com.leadconsult.app.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany
    private final Set<Group> groupSet = new HashSet<>();

    public long getId() {
        return id;
    }
}

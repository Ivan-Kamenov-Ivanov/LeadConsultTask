package com.leadconsult.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int groupNumber;

    public Group() {
    }

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public long getId() {
        return id;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
}

package com.leadconsult.app.models;

import jakarta.persistence.*;

@Entity
public class MainCourse implements Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "group_id")
    private Group group;

    public void setGroup(Group group) {
        this.group = group;
    }

    public MainCourse() {
    }

    public MainCourse(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public MainCourse(long id, String name, Group group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }
}

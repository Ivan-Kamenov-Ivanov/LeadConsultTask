package com.leadconsult.app.models;

import jakarta.persistence.*;

@Entity
public class SecondaryCourse implements Course {
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

    public SecondaryCourse() {
    }

    public SecondaryCourse(Group group, String name) {
        this.group = group;
        this.name = name;
    }

    public SecondaryCourse(long id, String name, Group group) {
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

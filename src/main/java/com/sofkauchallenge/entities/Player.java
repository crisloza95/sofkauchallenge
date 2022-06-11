package com.sofkauchallenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @Column(name = "user_name", nullable = false, length = 45)
    private String id;

    public String getId() {
        return id;
    }

    public Player setId(String id) {
        this.id = id;
        return this;
    }

//TODO [JPA Buddy] generate columns from DB
}
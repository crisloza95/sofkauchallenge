package com.sofkauchallenge.entities;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "difficulty", nullable = false, length = 45)
    private String difficulty;

    public Integer getId() {
        return id;
    }

    public Category setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public Category setDifficulty(String difficulty) {
        this.difficulty = difficulty;
        return this;
    }

}
package com.sofkauchallenge.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "date", nullable = false)
    private Instant date;

    @Column(name = "result", length = 45)
    private String result;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_name", nullable = false)
    private Player userName;

    @Column(name = "coins")
    private Integer coins;

    public Integer getId() {
        return id;
    }

    public Game setId(Integer id) {
        this.id = id;
        return this;
    }

    public Instant getDate() {
        return date;
    }

    public Game setDate(Instant date) {
        this.date = date;
        return this;
    }

    public String getResult() {
        return result;
    }

    public Game setResult(String result) {
        this.result = result;
        return this;
    }

    public Player getUserName() {
        return userName;
    }

    public Game setUserName(Player userName) {
        this.userName = userName;
        return this;
    }

    public Integer getCoins() {
        return coins;
    }

    public Game setCoins(Integer coins) {
        this.coins = coins;
        return this;
    }

}
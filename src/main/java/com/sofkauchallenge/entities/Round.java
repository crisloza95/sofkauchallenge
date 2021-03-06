package com.sofkauchallenge.entities;

import javax.persistence.*;

@Entity
@Table(name = "round")
public class Round {
    @EmbeddedId
    private RoundId id;

    @MapsId("gameId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    @MapsId("categoryId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(name = "price")
    private Integer price;

    public RoundId getId() {
        return id;
    }

    public Round setId(RoundId id) {
        this.id = id;
        return this;
    }

    public Game getGame() {
        return game;
    }

    public Round setGame(Game game) {
        this.game = game;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Round setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public Round setPrice(Integer price) {
        this.price = price;
        return this;
    }

}
package com.sofkauchallenge.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RoundId implements Serializable {
    private static final long serialVersionUID = -2776260068614627946L;
    @Column(name = "game_id", nullable = false)
    private Integer gameId;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RoundId entity = (RoundId) o;
        return Objects.equals(this.gameId, entity.gameId) &&
                Objects.equals(this.categoryId, entity.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, categoryId);
    }

}
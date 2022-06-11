package com.sofkauchallenge.repositories;

import com.sofkauchallenge.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
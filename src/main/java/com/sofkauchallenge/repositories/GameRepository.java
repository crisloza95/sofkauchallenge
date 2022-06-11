package com.sofkauchallenge.repositories;

import com.sofkauchallenge.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Integer> {

}
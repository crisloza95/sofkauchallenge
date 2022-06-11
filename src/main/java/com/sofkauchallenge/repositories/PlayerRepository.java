package com.sofkauchallenge.repositories;

import com.sofkauchallenge.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, String> {
}
package com.sofkauchallenge.repositories;

import com.sofkauchallenge.entities.Round;
import com.sofkauchallenge.entities.RoundId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoundRepository extends JpaRepository<Round, RoundId> {
}
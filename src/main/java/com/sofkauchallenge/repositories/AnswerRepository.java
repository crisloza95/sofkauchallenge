package com.sofkauchallenge.repositories;

import com.sofkauchallenge.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
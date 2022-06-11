package com.sofkauchallenge.repositories;

import com.sofkauchallenge.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
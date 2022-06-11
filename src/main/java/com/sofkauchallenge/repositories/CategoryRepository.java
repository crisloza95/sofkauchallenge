package com.sofkauchallenge.repositories;

import com.sofkauchallenge.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
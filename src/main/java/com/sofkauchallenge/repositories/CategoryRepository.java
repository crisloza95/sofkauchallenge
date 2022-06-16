package com.sofkauchallenge.repositories;

import com.sofkauchallenge.Dtos.CategoryDto;
import com.sofkauchallenge.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
package com.firstpixel.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstpixel.domain.Category;

@Repository

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	
	
	
}

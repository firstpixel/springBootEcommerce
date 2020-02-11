package com.firstpixel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstpixel.domain.Category;
import com.firstpixel.repositories.CategoryRepository;
import com.firstpixel.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService  {

	@Autowired
	private CategoryRepository repo;
	
	public Category find(Integer id) { 
		Optional<Category> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Type: " + Category.class.getName()));
	}
}

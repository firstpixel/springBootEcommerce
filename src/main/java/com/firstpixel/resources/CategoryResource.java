package com.firstpixel.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firstpixel.domain.Category;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Category> list() {
		
		Category category1 = new Category(1, "Frases de Amor");
		Category category2 = new Category(2, "Frases de Autoajuda");
		
		List<Category> list = new ArrayList<>();
		
		list.add(category1);
		list.add(category2);
		
		return list;
	}
	
	public Category find(Integer id) { 
		Optional<Category> obj = repo.findById(id); return obj.orElse(null);
	}
	
	
}

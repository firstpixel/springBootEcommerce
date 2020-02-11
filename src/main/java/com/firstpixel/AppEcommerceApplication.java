package com.firstpixel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.firstpixel.domain.Category;
import com.firstpixel.domain.City;
import com.firstpixel.domain.Product;
import com.firstpixel.domain.State;
import com.firstpixel.repositories.CategoryRepository;
import com.firstpixel.repositories.CityRepository;
import com.firstpixel.repositories.ProductRepository;
import com.firstpixel.repositories.StateRepository;

@SpringBootApplication
public class AppEcommerceApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(AppEcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		Product p1 = new Product(null, "Computador", 2000.00);
		Product p2 = new Product(null, "Impressora",  800.00);
		Product p3 = new Product(null, "Mouse",  80.00);
		
		cat1.getProducts().addAll(Arrays.asList(p1,p2,p3));
		
		List<Product> productList2 = new ArrayList<>();
		productList2.add(p2);
		cat2.setProducts(productList2);
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));
			
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		
		State state1 = new State(null, "Minas Gerais");
		State state2 = new State(null, "São Paulo");
		
		City c1 = new City(null, "Uberlândia", state1);
		City c2 = new City(null, "São Paulo", state2);
		City c3 = new City(null, "Campinas", state2);
		
		state1.getCities().addAll(Arrays.asList(c1));
		state2.getCities().addAll(Arrays.asList(c2, c3));
		
		stateRepository.saveAll(Arrays.asList(state1, state2));
		cityRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		
	}

}

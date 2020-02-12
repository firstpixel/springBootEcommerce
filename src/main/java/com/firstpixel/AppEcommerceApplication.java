package com.firstpixel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.firstpixel.domain.Address;
import com.firstpixel.domain.Category;
import com.firstpixel.domain.City;
import com.firstpixel.domain.Customer;
import com.firstpixel.domain.Product;
import com.firstpixel.domain.State;
import com.firstpixel.domain.enums.CustomerType;
import com.firstpixel.repositories.AddressRepository;
import com.firstpixel.repositories.CategoryRepository;
import com.firstpixel.repositories.CityRepository;
import com.firstpixel.repositories.CustomerRepository;
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
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	

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
		
		Customer client1 = new Customer(null, "Gil Beyruth", "gil@email.com", "25393364857", CustomerType.INDIVIDUAL);
		client1.getPhones().addAll(Arrays.asList("11991020046","1149120308"));
		
		Address address1 = new Address(null, "Rua Flores", "", "234", "apto120", "Parque Imperial", "02304020", client1, c1);
		Address address2 = new Address(null, "R Conego Vicente Miguel Marino", "", "91", "apto1710", "Barra Funda", "01135020", client1, c2);
		client1.getAddresses().addAll(Arrays.asList(address1, address2));
		
		
		Customer client2 = new Customer(null, "Maria Silva", "maria@gmail.com", "36378912377", CustomerType.INDIVIDUAL);
		client2.getPhones().addAll(Arrays.asList("11991010036","1149120308"));
		
		Address address3 = new Address(null, "Rua Augusta", "", "123", "apto120", "Bela Vista", "01135020", client2, c2);
		client2.getAddresses().addAll(Arrays.asList(address3));
		
		customerRepository.saveAll(Arrays.asList(client1, client2));
		addressRepository.saveAll(Arrays.asList(address1, address2, address3));
	}

}

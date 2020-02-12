package com.firstpixel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstpixel.domain.Customer;
import com.firstpixel.repositories.CustomerRepository;
import com.firstpixel.services.exceptions.ObjectNotFoundException;

@Service
public class CustomerService  {

	@Autowired
	private CustomerRepository repo;
	
	public Customer find(Integer id) { 
		Optional<Customer> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Type: " + Customer.class.getName()));
	}
}

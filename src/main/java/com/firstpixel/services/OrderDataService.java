package com.firstpixel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstpixel.domain.OrderData;
import com.firstpixel.repositories.OrderDataRepository;
import com.firstpixel.services.exceptions.ObjectNotFoundException;

@Service
public class OrderDataService  {

	@Autowired
	private OrderDataRepository repo;
	
	public OrderData find(Integer id) { 
		Optional<OrderData> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Type: " + OrderData.class.getName()));
	}
}

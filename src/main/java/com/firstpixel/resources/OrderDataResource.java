package com.firstpixel.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firstpixel.domain.OrderData;
import com.firstpixel.services.OrderDataService;

@RestController
@RequestMapping(value="/orders")
public class OrderDataResource {
	
	
	@Autowired
	private OrderDataService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<OrderData> find(@PathVariable Integer id) {
		
		OrderData obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	

	
}

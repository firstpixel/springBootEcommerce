package com.firstpixel.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstpixel.domain.CustomerOrder;

@Repository
public interface OrderRepository extends JpaRepository<CustomerOrder, Integer> {

	
	
	
}

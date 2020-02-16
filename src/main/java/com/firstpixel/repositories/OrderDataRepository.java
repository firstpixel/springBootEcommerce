package com.firstpixel.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstpixel.domain.OrderData;

@Repository
public interface OrderDataRepository extends JpaRepository<OrderData, Integer> {

	
	
	
}

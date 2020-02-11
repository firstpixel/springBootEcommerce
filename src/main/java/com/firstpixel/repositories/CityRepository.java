package com.firstpixel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstpixel.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}


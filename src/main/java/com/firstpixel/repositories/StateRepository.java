package com.firstpixel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstpixel.domain.State;


@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}


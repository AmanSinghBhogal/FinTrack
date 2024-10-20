package com.fintrack.FinTrack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fintrack.FinTrack.entity.Budget_alloc;

@Repository
public interface Budget_allocRepository extends CrudRepository<Budget_alloc, String>{
	

}

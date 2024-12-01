package com.fintrack.FinTrack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fintrack.FinTrack.entity.Expenses_desc;

@Repository
public interface ExpensesDescRepository extends CrudRepository<Expenses_desc, String> {
	

}

package com.fintrack.FinTrack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fintrack.FinTrack.entity.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, String> {

}

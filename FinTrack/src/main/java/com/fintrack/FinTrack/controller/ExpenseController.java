package com.fintrack.FinTrack.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Expense;
import com.fintrack.FinTrack.entity.ExpenseRequest;

@RestController
public interface ExpenseController {
	
	// Return all expenses of a particular user with uid
	ResponseEntity<List<ExpenseRequest>> getExpenseByUid(String uid);
	
	// Returns expense of an user for a particular date.
	ResponseEntity<Object> getExpenseByUidDate(String uid, String date);

	// Returns expenses of an user for a particular year.
	ResponseEntity<List<Expense>> getExpenseByUidYear(String uid, int year);
	
	// Returns expense of an user for a particular month of a year.
	ResponseEntity<List<Expense>> getExpenseByUidYearMonth(String uid, int year, int month);
	
	// Returns expenses of an user for a particular date range.
	ResponseEntity<List<Expense>> getExpenseByUidRange(String uid, String sDate, String eDate);
	
	// Post a new Expense
	ResponseEntity<Object> postExpense(ExpenseRequest request);
	
	// Delete an Expense
	ResponseEntity<Object> deteleExpense(Map<String, String> request);

}

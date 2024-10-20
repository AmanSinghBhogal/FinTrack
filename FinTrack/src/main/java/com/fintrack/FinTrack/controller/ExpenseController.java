package com.fintrack.FinTrack.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Expense;

@RestController
public interface ExpenseController {
	
	// Return all expenses of a particular user with uid
	ResponseEntity<List<Expense>> getExpenseByUid(String uid);
	
	// Returns expense of an user for a particular date.
	ResponseEntity<Expense> getExpenseByUidDate(String uid, Calendar date);

	// Returns expenses of an user for a particular year.
	ResponseEntity<List<Expense>> getExpenseByUidYear(String uid, int year);
	
	// Returns expense of an user for a particular month of a year.
	ResponseEntity<List<Expense>> getExpenseByUidYearMonth(String uid, int year, int month);
	
	// Returns expenses of an user for a particular date range.
	ResponseEntity<List<Expense>> getExpenseByUidRange(String uid, Calendar sDate, Calendar eDate);

}

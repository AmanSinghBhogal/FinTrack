package com.fintrack.FinTrack.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Expense;
import com.fintrack.FinTrack.entity.ExpenseRequest;

@Service
public interface ExpenseService {
	
	// Return all expenses of a particular user with uid
	List<ExpenseRequest> findExpenseByUid(String uid);
	
	// Returns expense of an user for a particular date.
	Object findExpenseByUidDate(String uid, String date);

	// Returns expenses of an user for a particular year.
	List<Expense> findExpenseByUidYear(String uid, int year);
	
	// Returns expense of an user for a particular month of a year.
	List<Expense> findExpenseByUidYearMonth(String uid, int year, int month);
	
	// Returns expenses of an user for a particular date range.
	List<Expense> findExpenseByUidRange(String uid, String sDate, String eDate);
	
	// Post a new Expense
	Expense postExpense(Expense expense);
	
	// Delete a Expense
	Object deleteExp(String eid);
	
}

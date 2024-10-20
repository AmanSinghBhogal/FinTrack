package com.fintrack.FinTrack.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Budget_alloc;
import com.fintrack.FinTrack.entity.Expense;
import com.fintrack.FinTrack.repository.ExpenseRepository;

@RestController
@RequestMapping("/expense")
public class ExpenseControllerImpl implements ExpenseController{

	@Autowired
	ExpenseRepository expenseRepository;
	
	@GetMapping("/{uid}")
	@Override
	public ResponseEntity<List<Expense>> getExpenseByUid(@PathVariable String uid) {
		List<Expense> resp = expenseRepository.findExpenseByUid(uid);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Expense> getExpenseByUidDate(String uid, Calendar date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Expense>> getExpenseByUidYear(String uid, int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Expense>> getExpenseByUidYearMonth(String uid, int year, int month) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Expense>> getExpenseByUidRange(String uid, Calendar sDate, Calendar eDate) {
		// TODO Auto-generated method stub
		return null;
	}

}

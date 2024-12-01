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

import com.fintrack.FinTrack.entity.Expense;
import com.fintrack.FinTrack.service.ExpenseService;

@RestController
@RequestMapping("/expense")
public class ExpenseControllerImpl implements ExpenseController{

	@Autowired
	ExpenseService expenseServive;
	
	@GetMapping("/{uid}")
	@Override
	public ResponseEntity<List<Expense>> getExpenseByUid(@PathVariable("uid") String uid) {
		List<Expense> resp = expenseServive.findExpenseByUid(uid);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@GetMapping("/{uid}/{date}")
	@Override
	public ResponseEntity<Expense> getExpenseByUidDate(@PathVariable("uid") String uid, @PathVariable("date") String date) {
		System.out.println(date);
		Expense resp = expenseServive.findExpenseByUidDate(uid, date);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@GetMapping("/{uid}/year/{year}")
	@Override
	public ResponseEntity<List<Expense>> getExpenseByUidYear(@PathVariable("uid") String uid,@PathVariable("year")  int year) {
		List<Expense> resp = expenseServive.findExpenseByUidYear(uid, year);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@GetMapping("/{uid}/{year}/{month}")
	@Override
	public ResponseEntity<List<Expense>> getExpenseByUidYearMonth(@PathVariable("uid") String uid, @PathVariable("year") int year, @PathVariable("month") int month) {
		List<Expense> resp = expenseServive.findExpenseByUidYearMonth(uid, year, month);
		System.out.println("year -> month function called.");
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@GetMapping("/{uid}/range/{sdate}/{edate}")
	@Override
	public ResponseEntity<List<Expense>> getExpenseByUidRange(@PathVariable("uid") String uid, @PathVariable("sdate") String sDate, @PathVariable("edate") String eDate) {
		// Date should be in the format of YYYY-MM-DD
		
		List<Expense> resp = expenseServive.findExpenseByUidRange(uid, sDate,eDate);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

}

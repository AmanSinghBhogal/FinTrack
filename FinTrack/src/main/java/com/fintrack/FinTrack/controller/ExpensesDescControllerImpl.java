package com.fintrack.FinTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Expenses_desc;
import com.fintrack.FinTrack.service.ExpensesDescService;

@RestController
@RequestMapping("/expenses_desc")
public class ExpensesDescControllerImpl implements ExpensesDescController{
	
	@Autowired
	ExpensesDescService expensesDescService;

	@GetMapping("/{uid}")
	@Override
	public ResponseEntity<Object> getExpenseByUid(@PathVariable("uid") String uid) {
		Object resp = expensesDescService.findByUid(uid);
		if(resp != null) {
			return new ResponseEntity<>(resp, HttpStatus.OK);	
		}
		return new ResponseEntity<>("No Expense Description Found", HttpStatus.NOT_FOUND);	
	}
	

}

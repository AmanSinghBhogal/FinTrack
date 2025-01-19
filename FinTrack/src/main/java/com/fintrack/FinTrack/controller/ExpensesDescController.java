package com.fintrack.FinTrack.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Expenses_desc;

@RestController
public interface ExpensesDescController {
	
		// Return all expenses description of a particular expense with uid
		ResponseEntity<Object> getExpenseByUid(String uid);

}

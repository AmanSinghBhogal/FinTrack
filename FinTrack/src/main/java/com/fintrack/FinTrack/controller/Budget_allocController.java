package com.fintrack.FinTrack.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Budget_alloc;

@RestController
public interface Budget_allocController {
		
	ResponseEntity<List<Budget_alloc>> getAllBudgetsByUid(String uid);
	
	ResponseEntity<List<Budget_alloc>> getAllBudgetByUidYear(String uid, int year);
	
	ResponseEntity<List<Budget_alloc>> getAllBudgetByUidYearMonth(String uid, int year, String month);
}

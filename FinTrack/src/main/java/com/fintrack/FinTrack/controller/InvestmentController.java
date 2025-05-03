package com.fintrack.FinTrack.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Investment;

@RestController
public interface InvestmentController {
	
	// Returns all Investments of a particular user with uid
	ResponseEntity<List<Investment>> getAllInvestmentsByUid(String uid);
	
	// Returns all Investments of a particular user with uid and year
	ResponseEntity<List<Investment>> getAllInvestmentsByUidandYear(String uid, String year);
	
	// Returns all Investments of a particular user with uid and year and month
	ResponseEntity<List<Investment>> getAllInvestmentsByUidYearandMonth(String uid, String year, String month);
	
	// Post a investement
	ResponseEntity<Object> postInvestment(Investment investment);
	
	// Delete 
	ResponseEntity<Object> deleteinvestment(Map<String, String> request);
	
	//Patch
	ResponseEntity<Object> patchInvestment(Map<String, Object> request);

}

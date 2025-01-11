package com.fintrack.FinTrack.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Fixed_charges;

@RestController
public interface Fixed_chargesController {

	// Returns all Fixed Charges of a particular user with uid
	ResponseEntity<List<Fixed_charges>> getFixedChargesByUid(String uid);
	
	// Returns all Fixed Charges of a particular user with uid and year
	ResponseEntity<List<Fixed_charges>> getFixedChargesByUidandYear(String uid, String year);
	
	// Returns all Fixed Charges of a particular user with uid, year and month
	ResponseEntity<List<Fixed_charges>> getFixedChargesByUidYearandMonth(String uid, String year, String month);
	
}

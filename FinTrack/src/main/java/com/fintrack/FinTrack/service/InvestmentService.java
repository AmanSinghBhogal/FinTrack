package com.fintrack.FinTrack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Investment;

@Service
public interface InvestmentService {
	
	// Get Investments for a particular user with uid
	List<Investment> getByUid(String uid);
	
	// Get investments for a particular user  with uid and year
	List<Investment> getByUidandYear(String uid, int year);
	
	// Get Investments for a particular user with uid, year and month
	List<Investment> getByUidYearandMonth(String uid, int year, int month);
	

}

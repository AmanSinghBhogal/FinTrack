package com.fintrack.FinTrack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Fixed_charges;

@Service
public interface Fixed_chargesService {

	// Get Fixed Charges based on uid
	List<Fixed_charges> getByUid(String uid);
	
	// Get Fixed Charges based on uid and year
	List<Fixed_charges> getByUidandYear(String uid, int year);
	
	// Get Fixed Charges based on uid and year and month
	List<Fixed_charges> getByUidYearandMonth(String uid, int year, int month);
	
	//Post Fixed Charges
	Fixed_charges postFixedCharge(Fixed_charges request);
	
	//Delete Fixed Charges
	Fixed_charges deleteFc(String fid);
	
	
} 

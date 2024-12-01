package com.fintrack.FinTrack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Expenses_desc;

@Service
public interface ExpensesDescService {
	
	//Return expenses description of a particular expense with eid
	Expenses_desc findByEdid(String eid);

}

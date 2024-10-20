package com.fintrack.FinTrack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Budget_alloc;
import com.fintrack.FinTrack.repository.Budget_allocRepository;

@Service
public class Budget_allocServiceImpl implements Budget_allocService{

	@Autowired
	Budget_allocRepository budget_allocRepository;
	
	@Override
	public List<Budget_alloc> findBudgetByUid(String uid) {
		/*
		 * Logic:
		 * Step 1: Fetch All records from Budget_alloc Table
		 * Step 2: Iterate over all the records.
		 * Step 3: If a particular record's UID matches our required UID then store it in a list.
		 * Step 4: If our maintained response list is not empty then return
		 * Step 5: Else throw an error of records not found 
		 */
		List<Budget_alloc> resp = new ArrayList<Budget_alloc>();
		Iterable<Budget_alloc> budgets= budget_allocRepository.findAll();
		
		for(Budget_alloc b: budgets) {
			if(b.getUid().equals(uid)) {
				resp.add(b);
			}
		}
		
		if(resp.size() != 0) {
			return resp;
		}
		else {
			System.out.println("No Budget Allocation found with the given uid: "+ uid);
			return new ArrayList<Budget_alloc>();
		}
		
	}

	@Override
	public List<Budget_alloc> findBudgetByUidYear(String uid, int year) {
		List<Budget_alloc> resp = new ArrayList<Budget_alloc>();
		Iterable<Budget_alloc> budgets = budget_allocRepository.findAll();
		
		for(Budget_alloc b: budgets) {
			if(b.getUid().equals(uid) && b.getYear()==year) {
				resp.add(b);
			}
		}
		if(resp.size() != 0) {
			return resp;
		}
		else {
			System.out.println("No Budget Allocation found with the given uid: "+ uid+ " and year: "+year);
			return new ArrayList<Budget_alloc>();
		}
	}

	@Override
	public List<Budget_alloc> findBudgetByUidYearMonth(String uid, int year, String month) {
		List<Budget_alloc> resp = new ArrayList<Budget_alloc>();
		Iterable<Budget_alloc> budgets = budget_allocRepository.findAll();
		
		for(Budget_alloc b: budgets) {
			if(b.getUid().equals(uid) && b.getYear()==year && b.getMonth().equals(month)) {
				resp.add(b);
			}
		}
		if(resp.size() != 0) {
			return resp;
		}
		else {
			System.out.println("No Budget Allocation found with the given uid: "+ uid+ ", year: "+year+" and month: "+month);
			return new ArrayList<Budget_alloc>();
		}
	}
	
	

}

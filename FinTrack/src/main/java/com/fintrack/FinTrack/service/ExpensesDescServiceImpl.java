package com.fintrack.FinTrack.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Expenses_desc;
import com.fintrack.FinTrack.repository.ExpensesDescRepository;

@Service
public class ExpensesDescServiceImpl implements ExpensesDescService{

	@Autowired 
	ExpensesDescRepository expensesDescRepository;

	@Override
	public Expenses_desc findByEdid(String eid) {
		Expenses_desc resp = new Expenses_desc();
		boolean flag  = false;
		
		try {
			Iterable<Expenses_desc> expenses_desc = expensesDescRepository.findAll();
			for(Expenses_desc e: expenses_desc) {
				if(e.getEdid().equals(eid)) {
					resp = e;
					flag = true;
				}
			}
		}catch(Exception e) {
			System.out.println("Exception occured while fetching response");
			System.out.println(e);
		}
		
		
		if(flag) {
			return resp;
		}
		else {
			System.out.println("No expense description found for edid : "+eid);
			return resp;
		}
	}
	

}

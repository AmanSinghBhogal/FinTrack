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
	public Object findByUid(String uid) {
		Expenses_desc resp = new Expenses_desc();
		boolean flag  = false;
		
		try {
			Iterable<Expenses_desc> expenses_desc = expensesDescRepository.findAll();
			for(Expenses_desc e: expenses_desc) {
				if(e.getUid().equals(uid)) {
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
			System.out.println("No expense description found for Uid : "+uid);
			return null;
		}
	}

	@Override
	public Expenses_desc postExpenseDesc(Expenses_desc expenseDesc) {
		System.out.println("Printing Expense Description...");
		System.out.println(expenseDesc.getUid());
		System.out.println(expenseDesc.getDate());
		return expensesDescRepository.save(expenseDesc);
	}
	

}

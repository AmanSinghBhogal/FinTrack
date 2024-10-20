package com.fintrack.FinTrack.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Expense;
import com.fintrack.FinTrack.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;

	@Override
	public List<Expense> findExpenseByUid(String uid) {
		List<Expense> resp = new ArrayList<Expense>();
		Iterable<Expense> expenses = expenseRepository.findAll();
		
		for(Expense e: expenses) {
			if(e.getUid().equals(uid))
				resp.add(e);
		}
		
		if(!resp.isEmpty()) {
			return resp;
		}
		else {
			System.out.println("No expense found for user with uid: "+uid);
			return resp;
		}
	}

	@Override
	public Expense findExpenseByUidDate(String uid, Calendar date) {
		
		Expense resp = new Expense();
		Iterable<Expense> expenses = expenseRepository.findAll();
		boolean flag  = false;
		
		for(Expense e: expenses) {
			if(e.getUid().equals(uid) && e.getDate().equals(date)) {
				resp = e;
				flag = true;
			}
		}
		
		if(flag) {
			return resp;
		}
		else {
			System.out.println("No expense found for user with uid: "+uid);
			return resp;
		}
		
	}

	@Override
	public List<Expense> findExpenseByUidYear(String uid, int year) {
		List<Expense> resp = new ArrayList<Expense>();
		Iterable<Expense> expenses = expenseRepository.findAll();
		
		for(Expense e: expenses) {
			if(e.getUid().equals(uid) && e.getDate().get(Calendar.YEAR) == year)
				resp.add(e);
		}
		
		if(!resp.isEmpty()) {
			return resp;
		}
		else {
			System.out.println("No expense found for user with uid: "+uid);
			return resp;
		}
	}

	@Override
	public List<Expense> findExpenseByUidYearMonth(String uid, int year, int month) {
		List<Expense> resp = new ArrayList<Expense>();
		Iterable<Expense> expenses = expenseRepository.findAll();
		
		for(Expense e: expenses) {
			if(e.getUid().equals(uid) && e.getDate().get(Calendar.YEAR) == year && e.getDate().get(Calendar.MONTH) == month)
				resp.add(e);
		}
		
		if(!resp.isEmpty()) {
			return resp;
		}
		else {
			System.out.println("No expense found for user with uid: "+uid);
			return resp;
		}
	}

	@Override
	public List<Expense> findExpenseByUidRange(String uid, Calendar sDate, Calendar eDate) {
		List<Expense> resp = new ArrayList<Expense>();
		Iterable<Expense> expenses = expenseRepository.findAll();
		
		for(Expense e: expenses) {
			if(e.getUid().equals(uid) && e.getDate().get(Calendar.DAY_OF_MONTH) >= sDate.get(Calendar.DAY_OF_MONTH) && 
					e.getDate().get(Calendar.MONTH) >= sDate.get(Calendar.MONTH) && e.getDate().get(Calendar.YEAR) >= sDate.get(Calendar.YEAR)
					&& e.getDate().get(Calendar.DAY_OF_MONTH) <= eDate.get(Calendar.DAY_OF_MONTH) && e.getDate().get(Calendar.MONTH) <= eDate.get(Calendar.MONTH)
					&& e.getDate().get(Calendar.YEAR) <= eDate.get(Calendar.YEAR))
				resp.add(e);
		}
		
		if(!resp.isEmpty()) {
			return resp;
		}
		else {
			System.out.println("No expense found for user with uid: "+uid);
			return resp;
		}
	}

}

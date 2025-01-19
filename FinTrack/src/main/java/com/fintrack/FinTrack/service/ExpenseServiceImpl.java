package com.fintrack.FinTrack.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Expense;
import com.fintrack.FinTrack.entity.ExpenseRequest;
import com.fintrack.FinTrack.entity.Expenses_desc;
import com.fintrack.FinTrack.repository.ExpenseRepository;
import com.fintrack.FinTrack.repository.ExpensesDescRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;
	
	@Autowired
	ExpensesDescRepository descRepo;

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
	public Object findExpenseByUidDate(String uid, String date) {
		
		Expense resp = new Expense();
		Iterable<Expense> expenses = expenseRepository.findAll();
		boolean flag  = false;
		System.out.println("Param date is: "+ date);
		
		for(Expense e: expenses) {
			if(e.getUid().equals(uid) && (e.getDate().compareTo(date) == 0? true: false)) {
				resp = e;
				flag = true;
			}
		}
		
		if(flag) {
			// Once I have found the expense I need to fetch its coresponding description...
			Expenses_desc description = descRepo.findById(resp.getEdid()).get();
			ExpenseRequest response = new ExpenseRequest(resp, description);
			return response;
		}
		else {
			System.out.println("No expense found for user with uid: "+uid+" and Date: "+date);
			return null;
		}
		
	}

	@Override
	public List<Expense> findExpenseByUidYear(String uid, int year) {
		List<Expense> resp = new ArrayList<Expense>();
		Iterable<Expense> expenses = expenseRepository.findAll();
		
		for(Expense e: expenses) {
			String d = e.getDate();
			System.out.println(String.valueOf(year));
			if(e.getUid().equals(uid) && d.substring(0, 4).equals(String.valueOf(year)))
				resp.add(e);
		}
		
		if(!resp.isEmpty()) {
			return resp;
		}
		else {
			System.out.println("No expense found for user with uid: "+uid+" and year: "+year );
			return resp;
		}
	}

	@Override
	public List<Expense> findExpenseByUidYearMonth(String uid, int year, int month) {
		List<Expense> resp = new ArrayList<Expense>();
		Iterable<Expense> expenses = expenseRepository.findAll();
		
		for(Expense e: expenses) {
			String d = e.getDate();
			if(e.getUid().equals(uid) && d.substring(0, 4).equals(String.valueOf(year)) && Integer.parseInt(d.substring(5, 7)) == month)
				resp.add(e);
		}
		
		if(!resp.isEmpty()) {
			return resp;
		}
		else {
			System.out.println("No expense found for user with uid: "+uid+", year: "+year+" and month: "+month);
			return resp;
		}
	}

	@Override
	public List<Expense> findExpenseByUidRange(String uid, String sDate,String eDate) {
		List<Expense> resp = new ArrayList<Expense>();
		Iterable<Expense> expenses = expenseRepository.findAll();
		
		Date sd = new Date(Integer.parseInt(sDate.substring(0, 4)), Integer.parseInt(sDate.substring(5, 7)), Integer.parseInt(sDate.substring(8, 10)));
		Date ed = new Date(Integer.parseInt(eDate.substring(0, 4)), Integer.parseInt(eDate.substring(5, 7)), Integer.parseInt(eDate.substring(8, 10)));
		
		for(Expense e: expenses) {
			Date cd = new Date(Integer.parseInt(e.getDate().substring(0, 4)), Integer.parseInt(e.getDate().substring(5, 7)), Integer.parseInt(e.getDate().substring(8, 10)));
			if(e.getUid().equals(uid) && (cd.after(sd) || (cd.compareTo(sd)==0?true:false)) && (cd.before(ed) || (cd.compareTo(ed)==0?true:false)))
				resp.add(e);
			else if (e.getUid().equals(uid))
				System.out.println("sdate: "+sDate + " edate: " + eDate + " check date: " + e.getDate() + " -> false");
		}
		
		if(!resp.isEmpty()) {
			return resp;
		}
		else {
			System.out.println("No expense found for user with uid: "+uid+" start Date: "+sDate+" end Date: "+eDate);
			return resp;
		}
	}

	@Override
	public Expense postExpense(Expense expense) {
		System.out.println("Printing Expense to be posted...");
		System.out.println(expense.getUid());
		System.out.println(expense.getDate());
		return expenseRepository.save(expense);
	}
	
}

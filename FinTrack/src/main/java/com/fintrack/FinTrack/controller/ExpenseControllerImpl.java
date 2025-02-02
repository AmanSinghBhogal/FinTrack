package com.fintrack.FinTrack.controller;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Expense;
import com.fintrack.FinTrack.entity.ExpenseRequest;
import com.fintrack.FinTrack.entity.Expenses_desc;
import com.fintrack.FinTrack.service.ExpenseService;
import com.fintrack.FinTrack.service.ExpensesDescService;

@RestController
@RequestMapping("/expense")
public class ExpenseControllerImpl implements ExpenseController{

	@Autowired
	ExpenseService expenseService;
	
	@Autowired
	ExpensesDescService expensesDescService;
	
	@GetMapping("/{uid}")
	@Override
	public ResponseEntity<List<ExpenseRequest>> getExpenseByUid(@PathVariable("uid") String uid) {
		List<ExpenseRequest> resp = expenseService.findExpenseByUid(uid);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@GetMapping("/{uid}/{date}")
	@Override
	public ResponseEntity<Object> getExpenseByUidDate(@PathVariable("uid") String uid, @PathVariable("date") String date) {
		System.out.println(date);
		Object resp = expenseService.findExpenseByUidDate(uid, date);
		if(resp != null) {
			return new ResponseEntity<>(resp, HttpStatus.OK);	
		}
		return new ResponseEntity<>("No Expense Found", HttpStatus.NOT_FOUND);	
	}

	@GetMapping("/{uid}/year/{year}")
	@Override
	public ResponseEntity<List<Expense>> getExpenseByUidYear(@PathVariable("uid") String uid,@PathVariable("year")  int year) {
		List<Expense> resp = expenseService.findExpenseByUidYear(uid, year);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@GetMapping("/{uid}/{year}/{month}")
	@Override
	public ResponseEntity<List<Expense>> getExpenseByUidYearMonth(@PathVariable("uid") String uid, @PathVariable("year") int year, @PathVariable("month") int month) {
		List<Expense> resp = expenseService.findExpenseByUidYearMonth(uid, year, month);
		System.out.println("year -> month function called.");
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@GetMapping("/{uid}/range/{sdate}/{edate}")
	@Override
	public ResponseEntity<List<Expense>> getExpenseByUidRange(@PathVariable("uid") String uid, @PathVariable("sdate") String sDate, @PathVariable("edate") String eDate) {
		// Date should be in the format of YYYY-MM-DD
		
		List<Expense> resp = expenseService.findExpenseByUidRange(uid, sDate,eDate);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@PostMapping
	@Override
	public ResponseEntity<Object> postExpense(@RequestBody ExpenseRequest request) {
		System.out.println("You have reached expense Creation endpoint");
		
		Expenses_desc description = expensesDescService.postExpenseDesc(request.extractExpenseDesc());
		Expense expense = request.extractExpense();
		expense.setEdid(description.getEdid());
		expenseService.postExpense(expense);
		
		

		return new ResponseEntity<>("Successfully hit postExpense", HttpStatus.OK);
	}

	@DeleteMapping
	@Override
	public ResponseEntity<Object> deteleExpense(@RequestBody Map<String, String> request) {
		String eid;
		eid = request.get("eid");
		System.out.println("Deleting object for eid: " +eid);
		String result = (String) expenseService.deleteExp(eid);
		if(result == null)
			return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>("Successfully Deleted expense: "+eid, HttpStatus.OK);
	}

	

	
}

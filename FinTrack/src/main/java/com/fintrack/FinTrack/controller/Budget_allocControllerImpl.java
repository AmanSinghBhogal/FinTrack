package com.fintrack.FinTrack.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Budget_alloc;
import com.fintrack.FinTrack.entity.Users;
import com.fintrack.FinTrack.service.Budget_allocService;

@RestController
@RequestMapping("/budget_alloc")
public class Budget_allocControllerImpl implements Budget_allocController{
	
	@Autowired
	Budget_allocService budget_allocService;

	@GetMapping("/{uid}")
	@Override
	public ResponseEntity<List<Budget_alloc>> getAllBudgetsByUid(@PathVariable String uid) {
		List<Budget_alloc> resp = budget_allocService.findBudgetByUid(uid);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@GetMapping("/{uid}/{year}")
	@Override
	public ResponseEntity<List<Budget_alloc>> getAllBudgetByUidYear(@PathVariable String uid,@PathVariable int year) {
		List<Budget_alloc> resp = budget_allocService.findBudgetByUidYear(uid, year);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@GetMapping("/{uid}/{year}/{month}")
	@Override
	public ResponseEntity<List<Budget_alloc>> getAllBudgetByUidYearMonth(@PathVariable String uid, @PathVariable int year, @PathVariable String month) {
		List<Budget_alloc> resp = budget_allocService.findBudgetByUidYearMonth(uid, year, month);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@PostMapping()
	@Override
	public ResponseEntity<Budget_alloc> postBudgetAlloc(@RequestBody Budget_alloc budget_alloc) {
		Budget_alloc resp = budget_allocService.postBudgetAlloc(budget_alloc);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@PatchMapping()
	@Override
	public ResponseEntity<Object> patchBudgetAlloc(@RequestBody Map<String, Object> request) {
		try {
			Budget_alloc response  = budget_allocService.patchBudgetAlloc(request);
			if(response != null)
				return new ResponseEntity(response, HttpStatus.OK);
			else
				return new ResponseEntity("Product Not Found", HttpStatus.NOT_FOUND);
		}catch(Exception e){
			return new ResponseEntity(e.toString(), HttpStatus.BAD_REQUEST);
		}
		
	}
	
	

}

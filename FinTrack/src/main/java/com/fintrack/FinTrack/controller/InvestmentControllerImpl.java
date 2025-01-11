package com.fintrack.FinTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Expenses_desc;
import com.fintrack.FinTrack.entity.Investment;
import com.fintrack.FinTrack.service.InvestmentService;

@RestController
@RequestMapping("/investments")
public class InvestmentControllerImpl implements InvestmentController {

	@Autowired
	InvestmentService investmentService;

	@GetMapping("/{uid}")
	@Override
	public ResponseEntity<List<Investment>> getAllInvestmentsByUid(@PathVariable("uid") String uid) {
		List<Investment> resp = investmentService.getByUid(uid);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@GetMapping("/{uid}/{year}")
	@Override
	public ResponseEntity<List<Investment>> getAllInvestmentsByUidandYear(@PathVariable("uid") String uid,@PathVariable("year") String year) {
		List<Investment> resp = investmentService.getByUidandYear(uid, Integer.parseInt(year));
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@GetMapping("/{uid}/{year}/{month}")
	@Override
	public ResponseEntity<List<Investment>> getAllInvestmentsByUidYearandMonth(@PathVariable("uid") String uid, @PathVariable("year") String year, @PathVariable("month") String month) {
		List<Investment> resp = investmentService.getByUidYearandMonth(uid, Integer.parseInt(year), Integer.parseInt(month));
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	
	
}

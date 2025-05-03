package com.fintrack.FinTrack.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping
	@Override
	public ResponseEntity<Object> postInvestment(@RequestBody Investment investment) {
		try {
			Investment resp = investmentService.postInvestment(investment);
			return new ResponseEntity<>(resp, HttpStatus.OK);
		}
		catch(Exception e) {
			if(e.getMessage().toString().equals("could not execute statement [Data truncated for column 'category' at row 1] [insert into investment (category,date,description,name,uid,iid) values (?,?,?,?,?,?)]"))
			{
				String errMsg = "Pls select Category from the list: ['Real Estate','Gold','Digital Gold','Cryptocurrency','Bonds','Stocks','Funds']";
				return new ResponseEntity<>(errMsg, HttpStatus.BAD_REQUEST);
			}
			
		}
		return new ResponseEntity<>("Something is wrong with this request", HttpStatus.BAD_REQUEST);
	}
	
	@Override
	@DeleteMapping
	public ResponseEntity<Object> deleteinvestment(@RequestBody Map<String, String> request) {
		try {
			Object resp = investmentService.deleteInvestment(request.get("iid"));
			return new ResponseEntity<>(resp,  HttpStatus.OK);
		} catch (Exception e) {
				System.out.println(e.getMessage());
				return new ResponseEntity<>("Cannot find given Id",  HttpStatus.BAD_REQUEST);
		}
	}
	
	@PatchMapping
	@Override
	public ResponseEntity<Object> patchInvestment(@RequestBody Map<String, Object> request) {
		
		try {
			Investment response = investmentService.patchInvestment(request);
			if(response != null)
				return new ResponseEntity(response, HttpStatus.OK);
			else
				return new ResponseEntity("Product Not Found", HttpStatus.NOT_FOUND);
		}
		catch(Exception e) {
			return new ResponseEntity(e.toString(), HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	
	
	
}

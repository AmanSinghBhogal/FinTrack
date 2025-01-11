package com.fintrack.FinTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Fixed_charges;
import com.fintrack.FinTrack.service.Fixed_chargesService;

@RestController
@RequestMapping("/fixed_charges")
public class Fixed_chargesControllerImpl implements Fixed_chargesController {
	
	@Autowired
	Fixed_chargesService fixed_chargesService;

	@Override
	@GetMapping("/{uid}")
	public ResponseEntity<List<Fixed_charges>> getFixedChargesByUid(@PathVariable("uid") String uid) {
		List<Fixed_charges> resp = fixed_chargesService.getByUid(uid);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@Override
	@GetMapping("/{uid}/{year}")
	public ResponseEntity<List<Fixed_charges>> getFixedChargesByUidandYear(@PathVariable("uid") String uid,@PathVariable("year") String year) {
		List<Fixed_charges> resp = fixed_chargesService.getByUidandYear(uid, Integer.parseInt(year));
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@Override
	@GetMapping("/{uid}/{year}/{month}")
	public ResponseEntity<List<Fixed_charges>> getFixedChargesByUidYearandMonth(@PathVariable("uid") String uid,@PathVariable("year") String year,@PathVariable("month") String month) {
		List<Fixed_charges> resp = fixed_chargesService.getByUidYearandMonth(uid, Integer.parseInt(year), Integer.parseInt(month));
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	

}

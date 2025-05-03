package com.fintrack.FinTrack.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Fixed_charges;
import com.fintrack.FinTrack.repository.Fixed_chargesRepository;

@Service
public class Fixed_chargesServiceImpl implements Fixed_chargesService {
	
	@Autowired
	Fixed_chargesRepository fixed_chargesRepository;

	@Override
	public List<Fixed_charges> getByUid(String uid) {
		List<Fixed_charges> resp = new ArrayList<Fixed_charges>();
		Iterable<Fixed_charges> fixed_charges= fixed_chargesRepository.findAll();
		
		for(Fixed_charges f: fixed_charges) {
			if(f.getUid().equals(uid)) {
				resp.add(f);
			}
		}
		
		if(resp.size() != 0) {
			return resp;
		}
		else {
			System.out.println("No Fixed Charges found with the given uid: "+ uid);
			return new ArrayList<Fixed_charges>();
		}
	}

	@Override
	public List<Fixed_charges> getByUidandYear(String uid, int year) {
		List<Fixed_charges> resp = new ArrayList<Fixed_charges>();
		Iterable<Fixed_charges> fixed_charges = fixed_chargesRepository.findAll();
		
		for(Fixed_charges f: fixed_charges) {
			if(f.getUid().equals(uid) && Integer.parseInt(f.getDate().substring(0,4))==year) {
				resp.add(f);
			}
		}
		if(resp.size() != 0) {
			return resp;
		}
		else {
			System.out.println("No Fixed Charges found with the given uid: "+ uid+ " and year: "+year);
			return new ArrayList<Fixed_charges>();
		}
	}

	@Override
	public List<Fixed_charges> getByUidYearandMonth(String uid, int year, int month) {
		List<Fixed_charges> resp = new ArrayList<Fixed_charges>();
		Iterable<Fixed_charges> fixed_charges = fixed_chargesRepository.findAll();
		
		for(Fixed_charges f: fixed_charges) {
			if(f.getUid().equals(uid) && Integer.parseInt(f.getDate().substring(0,4))==year && Integer.parseInt(f.getDate().substring(5,7))==month) {
				resp.add(f);
			}
		}
		if(resp.size() != 0) {
			return resp;
		}
		else {
			System.out.println("No Fixed Charges found with the given uid: "+ uid+ " and year: "+year+" and month: "+month);
			return new ArrayList<Fixed_charges>();
		}
	}

	@Override
	public Fixed_charges postFixedCharge(Fixed_charges request) {
		try {
			Fixed_charges resp = fixed_chargesRepository.save(request);
			return resp;
		}
		catch(Exception e){
			System.out.println("Excpetion while saving Fixed Charge --> "+e);
			return null;
		}
		
	}

	@Override
	public Fixed_charges deleteFc(String fid) {
		try {
			System.out.println("fid: "+fid);
			Fixed_charges resp = fixed_chargesRepository.findById(fid).get();
			fixed_chargesRepository.deleteById(fid);
			return resp;
			
		}
		catch(Exception e) {
			
			return null;
		}
		
	}

}

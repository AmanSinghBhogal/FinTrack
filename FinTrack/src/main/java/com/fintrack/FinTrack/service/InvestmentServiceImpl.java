package com.fintrack.FinTrack.service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.ReflectionUtils;
import org.hibernate.annotations.DialectOverride.OverridesAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Investment;
import com.fintrack.FinTrack.repository.InvestmentRepository;

@Service
public class InvestmentServiceImpl implements InvestmentService{
	
	@Autowired
	InvestmentRepository investmentRepository;

	@Override
	public List<Investment> getByUid(String uid) {
		List<Investment> resp = new ArrayList<Investment>();
		Iterable<Investment> investment= investmentRepository.findAll();
		
		for(Investment i: investment) {
			if(i.getUid().equals(uid)) {
				resp.add(i);
			}
		}
		
		if(resp.size() != 0) {
			return resp;
		}
		else {
			System.out.println("No Investments found with the given uid: "+ uid);
			return new ArrayList<Investment>();
		}
	}

	@Override
	public List<Investment> getByUidandYear(String uid, int year) {
		List<Investment> resp = new ArrayList<Investment>();
		Iterable<Investment> investment= investmentRepository.findAll();
		
		for(Investment i: investment) {
			if(i.getUid().equals(uid) && Integer.parseInt(i.getDate().substring(0, 4))==year) {
				resp.add(i);
			}
		}
		
		if(resp.size() != 0) {
			return resp;
		}
		else {
			System.out.println("No Investments found with the given uid: "+ uid+ " and year: "+year);
			return new ArrayList<Investment>();
		}
	}

	@Override
	public List<Investment> getByUidYearandMonth(String uid, int year, int month) {
		List<Investment> resp = new ArrayList<Investment>();
		Iterable<Investment> investment= investmentRepository.findAll();
		
		for(Investment i: investment) {
			if(i.getUid().equals(uid) && Integer.parseInt(i.getDate().substring(0, 4))==year && Integer.parseInt(i.getDate().substring(5, 7))==month) {
				resp.add(i);
			}
		}
		
		if(resp.size() != 0) {
			return resp;
		}
		else {
			System.out.println("No Investments found with the given uid: "+ uid+ " and year: "+year+ " and month: "+month);
			return new ArrayList<Investment>();
		}
	}

	@Override
	public Investment postInvestment(Investment investment) {
		Investment resp = investmentRepository.save(investment);
		return resp;
	}
	
	@Override
	public Investment deleteInvestment(String iid) {
		Investment resp = investmentRepository.findById(iid).get();
		investmentRepository.deleteById(iid);
		return resp;
	}
	
	@Override
	public Investment patchInvestment(Map<String, Object> feilds) {
		String iid = (String) feilds.get("iid");
		boolean flag = investmentRepository.existsById(iid);
		
		if(flag) {
			Investment invest = investmentRepository.findById(iid).get();
			feilds.forEach((key, value) -> {
				Field field = ReflectionUtils.findField(Investment.class, key);
				field.setAccessible(true);
				ReflectionUtils.setField(field, invest, value);
				
			});
			return investmentRepository.save(invest);
			
			
			
		}
		return null;
		
	}

}

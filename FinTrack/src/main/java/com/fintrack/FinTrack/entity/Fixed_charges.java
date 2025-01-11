package com.fintrack.FinTrack.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
@Table(name="fixed_charges")
public class Fixed_charges {

	@Id
	private String fid;
	
	@Column (name="uid")
	private String uid;
	
	@Column (name="date")
	private String date;
	
	@Column (name="rent")
	private double rent;
	
	@Column (name="water")
	private double water;
	
	@Column (name="electricity")
	private double electricity;
	
	@Column (name="internet")
	private double internet;
	
	@Column (name="investment")
	private double investment;
	
	@Column (name="savings") 
	private double savings;
	
	@Column (name="debt")
	private double debt;
	
	@Column (name="gas")
	private double gas;

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public double getWater() {
		return water;
	}

	public void setWater(double water) {
		this.water = water;
	}

	public double getElectricity() {
		return electricity;
	}

	public void setElectricity(double electricity) {
		this.electricity = electricity;
	}

	public double getInternet() {
		return internet;
	}

	public void setInternet(double internet) {
		this.internet = internet;
	}

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public double getGas() {
		return gas;
	}

	public void setGas(double gas) {
		this.gas = gas;
	}
	
}

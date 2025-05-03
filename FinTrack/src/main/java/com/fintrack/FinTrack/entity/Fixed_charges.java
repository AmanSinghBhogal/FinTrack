package com.fintrack.FinTrack.entity;

import org.hibernate.annotations.UuidGenerator;
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
	@UuidGenerator
	private String fid;
	
	@Column (name="uid")
	private String uid;
	
	@Column (name="date")
	private String date;
	
	@Column (name="rent")
	private String rent;
	
	@Column (name="water")
	private String water;
	
	@Column (name="electricity")
	private String electricity;
	
	@Column (name="internet")
	private String internet;
	
	@Column (name="investment")
	private String investment;
	
	@Column (name="savings") 
	private String savings;
	
	@Column (name="debt")
	private String debt;
	
	@Column (name="gas")
	private String gas;

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

	public String getRent() {
		return rent;
	}

	public void setRent(String rent) {
		this.rent = rent;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public String getElectricity() {
		return electricity;
	}

	public void setElectricity(String electricity) {
		this.electricity = electricity;
	}

	public String getInternet() {
		return internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
	}

	public String getInvestment() {
		return investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

	public String getSavings() {
		return savings;
	}

	public void setSavings(String savings) {
		this.savings = savings;
	}

	public String getDebt() {
		return debt;
	}

	public void setDebt(String debt) {
		this.debt = debt;
	}

	public String getGas() {
		return gas;
	}

	public void setGas(String gas) {
		this.gas = gas;
	}
	
}

package com.fintrack.FinTrack.entity;

import org.hibernate.annotations.UuidGenerator;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Budget_alloc {

	@Id
	@UuidGenerator
	private String bid;
	
	@Column(name="uid")
	private String uid;
	
	@Column(name="year")
	private int year;
	
	@Column(name="month", length=3)
	private String month;
	
	@Column(name="rent")
	private String rent;
	
	@Column(name="water")
	private String water;
	
	@Column(name="electricity")
	private String electricity;
	
	@Column(name="travel")
	private String travel;
	
	@Column(name="entertainment")
	private String entertainment;
	
	@Column(name="medical")
	private String medical;
	
	@Column(name="debt")
	private String debt;
	
	@Column(name="food")
	private String food;
	
	@Column(name="savings")
	private String savings;
	
	@Column(name="investment")
	private String investment;
	
	@Column(name="mob_internet")
	private String mod_internet;
	
	@Column(name="shopping")
	private String shopping;
	
	@Column(name="income")
	private String income;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
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

	public String getTravel() {
		return travel;
	}

	public void setTravel(String travel) {
		this.travel = travel;
	}

	public String getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(String entertainment) {
		this.entertainment = entertainment;
	}

	public String getMedical() {
		return medical;
	}

	public void setMedical(String medical) {
		this.medical = medical;
	}

	public String getDebt() {
		return debt;
	}

	public void setDebt(String debt) {
		this.debt = debt;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getSavings() {
		return savings;
	}

	public void setSavings(String savings) {
		this.savings = savings;
	}

	public String getInvestment() {
		return investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

	public String getMod_internet() {
		return mod_internet;
	}

	public void setMod_internet(String mod_internet) {
		this.mod_internet = mod_internet;
	}

	public String getShopping() {
		return shopping;
	}

	public void setShopping(String shopping) {
		this.shopping = shopping;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}
	
	
	
	
	
	
	
}

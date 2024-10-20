package com.fintrack.FinTrack.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Budget_alloc {

	@Id
	private String uid;
	
	@Column(name="year")
	private int year;
	
	@Column(name="month", length=3)
	private String month;
	
	@Column(name="rent")
	private double rent;
	
	@Column(name="water")
	private double water;
	
	@Column(name="electricity")
	private double electricity;
	
	@Column(name="travel")
	private double travel;
	
	@Column(name="entertainment")
	private double entertainment;
	
	@Column(name="medical")
	private double medical;
	
	@Column(name="debt")
	private double debt;
	
	@Column(name="food")
	private double food;
	
	@Column(name="savings")
	private double savings;
	
	@Column(name="investment")
	private double investment;
	
	@Column(name="mob_internet")
	private double mod_internet;
	
	@Column(name="shopping")
	private double shopping;
	
	@Column(name="income")
	private double income;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
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

	public double getTravel() {
		return travel;
	}

	public void setTravel(double travel) {
		this.travel = travel;
	}

	public double getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(double entertainment) {
		this.entertainment = entertainment;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public double getFood() {
		return food;
	}

	public void setFood(double food) {
		this.food = food;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public double getMod_internet() {
		return mod_internet;
	}

	public void setMod_internet(double mod_internet) {
		this.mod_internet = mod_internet;
	}

	public double getShopping() {
		return shopping;
	}

	public void setShopping(double shopping) {
		this.shopping = shopping;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	
	
	
	
	
	
	
}

package com.fintrack.FinTrack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


public class ExpenseRequest {

	private String eid;
	
	private String edid;
	
	private String uid;

	private String date;
	
	private double dineout;
	
	private String dineout_desc;
	
	private double vegetable;
	
	private String vegetable_desc;
	
	private double dairy;
	
	private String dairy_desc;
	
	private double fruits;
	
	private String fruits_desc;
	
	private double meat;
	
	private String meat_desc;
	
	private double travel;
	
	private String travel_desc;
	
	private double personal;
	
	private String personal_desc;
	
	private double entertainment;
	
	private String entertainment_desc;
	
	private double cloths;
	
	private String cloths_desc;
	
	private double furniture;
	
	private String furniture_desc;
	
	private double electronics;
	
	private String electronics_desc;
	
	private double grooming;
	
	private String grooming_desc;
	
	private double other;
	
	private String other_desc;
	
	public ExpenseRequest() {
		
	}

	public ExpenseRequest(Expense expense, Expenses_desc description) {
		this.eid = expense.getEid();
		this.edid = expense.getEdid();
		this.uid = expense.getUid();
		this.date = expense.getDate();
		this.dineout = expense.getDineout();
		this.dineout_desc = description.getDineout_desc();
		this.vegetable = expense.getVegetable();
		this.vegetable_desc = description.getVegetable_desc();
		this.dairy = expense.getDairy();
		this.dairy_desc = description.getDairy_desc();
		this.fruits = expense.getFruits();
		this.fruits_desc = description.getFruits_desc();
		this.meat = expense.getMeat();
		this.meat_desc = description.getMeat_desc();
		this.travel = expense.getTravel();
		this.travel_desc = description.getTravel_desc();
		this.personal = expense.getPersonal();
		this.personal_desc = description.getPersonal_desc();
		this.entertainment = expense.getEntertainment();
		this.entertainment_desc = description.getEntertainment_desc();
		this.cloths = expense.getCloths();
		this.cloths_desc = description.getCloths_desc();
		this.furniture = expense.getFurniture();
		this.furniture_desc = description.getFurniture_desc();
		this.electronics = expense.getElectronics();
		this.electronics_desc = description.getElectronics_desc();
		this.grooming = expense.getGrooming();
		this.grooming_desc = description.getGrooming_desc();
		this.other = expense.getOther();
		this.other_desc = description.getOther_desc();
	}
	
	public Expense extractExpense() {
		Expense ob = new Expense();
		ob.setUid(this.uid);
		ob.setDate(this.date);
		ob.setDineout(this.dineout);
		ob.setVegetable(this.vegetable);
		ob.setDairy(this.dairy);
		ob.setFruits(this.fruits);
		ob.setMeat(this.meat);
		ob.setTravel(this.travel);
		ob.setPersonal(this.personal);
		ob.setEntertainment(this.entertainment);
		ob.setCloths(this.cloths);
		ob.setFurniture(this.furniture);
		ob.setElectronics(this.electronics);
		ob.setGrooming(this.grooming);
		ob.setOther(this.other);
		return ob;
	}

	public Expenses_desc extractExpenseDesc() {
		Expenses_desc ob2 = new Expenses_desc();
		ob2.setUid(this.uid);
		ob2.setDate(this.date);
		ob2.setDineout_desc(this.dineout_desc);
		ob2.setVegetable_desc(this.vegetable_desc);
		ob2.setDairy_desc(this.dairy_desc);
		ob2.setFruits_desc(this.fruits_desc);
		ob2.setMeat_desc(this.meat_desc);
		ob2.setTravel_desc(this.travel_desc);
		ob2.setPersonal_desc(this.personal_desc);
		ob2.setEntertainment_desc(this.entertainment_desc);
		ob2.setCloths_desc(this.cloths_desc);
		ob2.setFurniture_desc(this.furniture_desc);
		ob2.setElectronics_desc(this.electronics_desc);
		ob2.setGrooming_desc(this.grooming_desc);
		ob2.setOther_desc(this.other_desc);
		return ob2;
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

	public double getDineout() {
		return dineout;
	}

	public void setDineout(double dineout) {
		this.dineout = dineout;
	}

	public String getDineout_desc() {
		return dineout_desc;
	}

	public void setDineout_desc(String dineout_desc) {
		this.dineout_desc = dineout_desc;
	}

	public double getVegetable() {
		return vegetable;
	}

	public void setVegetable(double vegetable) {
		this.vegetable = vegetable;
	}

	public String getVegetable_desc() {
		return vegetable_desc;
	}

	public void setVegetable_desc(String vegetable_desc) {
		this.vegetable_desc = vegetable_desc;
	}

	public double getDairy() {
		return dairy;
	}

	public void setDairy(double dairy) {
		this.dairy = dairy;
	}

	public String getDairy_desc() {
		return dairy_desc;
	}

	public void setDairy_desc(String dairy_desc) {
		this.dairy_desc = dairy_desc;
	}

	public double getFruits() {
		return fruits;
	}

	public void setFruits(double fruits) {
		this.fruits = fruits;
	}

	public String getFruits_desc() {
		return fruits_desc;
	}

	public void setFruits_desc(String fruits_desc) {
		this.fruits_desc = fruits_desc;
	}

	public double getMeat() {
		return meat;
	}

	public void setMeat(double meat) {
		this.meat = meat;
	}

	public String getMeat_desc() {
		return meat_desc;
	}

	public void setMeat_desc(String meat_desc) {
		this.meat_desc = meat_desc;
	}

	public double getTravel() {
		return travel;
	}

	public void setTravel(double travel) {
		this.travel = travel;
	}

	public String getTravel_desc() {
		return travel_desc;
	}

	public void setTravel_desc(String travel_desc) {
		this.travel_desc = travel_desc;
	}

	public double getPersonal() {
		return personal;
	}

	public void setPersonal(double personal) {
		this.personal = personal;
	}

	public String getPersonal_desc() {
		return personal_desc;
	}

	public void setPersonal_desc(String personal_desc) {
		this.personal_desc = personal_desc;
	}

	public double getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(double entertainment) {
		this.entertainment = entertainment;
	}

	public String getEntertainment_desc() {
		return entertainment_desc;
	}

	public void setEntertainment_desc(String entertainment_desc) {
		this.entertainment_desc = entertainment_desc;
	}

	public double getCloths() {
		return cloths;
	}

	public void setCloths(double cloths) {
		this.cloths = cloths;
	}

	public String getCloths_desc() {
		return cloths_desc;
	}

	public void setCloths_desc(String cloths_desc) {
		this.cloths_desc = cloths_desc;
	}

	public double getFurniture() {
		return furniture;
	}

	public void setFurniture(double furniture) {
		this.furniture = furniture;
	}

	public String getFurniture_desc() {
		return furniture_desc;
	}

	public void setFurniture_desc(String furniture_desc) {
		this.furniture_desc = furniture_desc;
	}

	public double getElectronics() {
		return electronics;
	}

	public void setElectronics(double electronics) {
		this.electronics = electronics;
	}

	public String getElectronics_desc() {
		return electronics_desc;
	}

	public void setElectronics_desc(String electronics_desc) {
		this.electronics_desc = electronics_desc;
	}

	public double getGrooming() {
		return grooming;
	}

	public void setGrooming(double grooming) {
		this.grooming = grooming;
	}

	public String getGrooming_desc() {
		return grooming_desc;
	}

	public void setGrooming_desc(String grooming_desc) {
		this.grooming_desc = grooming_desc;
	}

	public double getOther() {
		return other;
	}

	public void setOther(double other) {
		this.other = other;
	}

	public String getOther_desc() {
		return other_desc;
	}

	public void setOther_desc(String other_desc) {
		this.other_desc = other_desc;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEdid() {
		return edid;
	}

	public void setEdid(String edid) {
		this.edid = edid;
	}
	
	
}

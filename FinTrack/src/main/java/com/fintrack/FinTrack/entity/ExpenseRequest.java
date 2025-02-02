package com.fintrack.FinTrack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


public class ExpenseRequest {

	private String eid;
	
	private String edid;
	
	private String uid;

	private String date;
	
	private String dineout;
	
	private String dineout_desc;
	
	private String vegetable;
	
	private String vegetable_desc;
	
	private String dairy;
	
	private String dairy_desc;
	
	private String fruits;
	
	private String fruits_desc;
	
	private String meat;
	
	private String meat_desc;
	
	private String travel;
	
	private String travel_desc;
	
	private String personal;
	
	private String personal_desc;
	
	private String entertainment;
	
	private String entertainment_desc;
	
	private String cloths;
	
	private String cloths_desc;
	
	private String furniture;
	
	private String furniture_desc;
	
	private String electronics;
	
	private String electronics_desc;
	
	private String grooming;
	
	private String grooming_desc;
	
	private String other;
	
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
	
	public void setExpense(Expense ob) {
		this.uid=ob.getUid();
		this.eid=ob.getEid();
		this.date=ob.getDate();
		this.dineout=ob.getDineout();
		this.vegetable=ob.getVegetable();
		this.dairy = ob.getDairy();
		this.fruits=ob.getFruits();
		this.meat=ob.getMeat();
		this.travel=ob.getTravel();
		this.personal=ob.getPersonal();
		this.entertainment=ob.getEntertainment();
		this.cloths=ob.getCloths();
		this.furniture=ob.getFurniture();
		this.electronics=ob.getElectronics();
		this.grooming=ob.getGrooming();
		this.other=ob.getOther();
	}

	public void setExpenseDesc(Expenses_desc ob) {
		this.uid=ob.getUid();
		this.edid = ob.getEdid();
		this.date=ob.getDate();
		this.dineout_desc=ob.getDineout_desc();
		this.vegetable_desc=ob.getVegetable_desc();
		this.dairy_desc=ob.getDairy_desc();
		this.fruits_desc=ob.getFruits_desc();
		this.meat_desc=ob.getMeat_desc();
		this.travel_desc=ob.getTravel_desc();
		this.personal_desc=ob.getPersonal_desc();
		this.entertainment_desc=ob.getEntertainment_desc();
		this.cloths_desc=ob.getCloths_desc();
		this.furniture_desc=ob.getFurniture_desc();
		this.electronics_desc=ob.getElectronics_desc();
		this.grooming_desc=ob.getGrooming_desc();
		this.other_desc=ob.getOther_desc();
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

	public String getDineout() {
		return dineout;
	}

	public void setDineout(String dineout) {
		this.dineout = dineout;
	}

	public String getDineout_desc() {
		return dineout_desc;
	}

	public void setDineout_desc(String dineout_desc) {
		this.dineout_desc = dineout_desc;
	}

	public String getVegetable() {
		return vegetable;
	}

	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}

	public String getVegetable_desc() {
		return vegetable_desc;
	}

	public void setVegetable_desc(String vegetable_desc) {
		this.vegetable_desc = vegetable_desc;
	}

	public String getDairy() {
		return dairy;
	}

	public void setDairy(String dairy) {
		this.dairy = dairy;
	}

	public String getDairy_desc() {
		return dairy_desc;
	}

	public void setDairy_desc(String dairy_desc) {
		this.dairy_desc = dairy_desc;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public String getFruits_desc() {
		return fruits_desc;
	}

	public void setFruits_desc(String fruits_desc) {
		this.fruits_desc = fruits_desc;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getMeat_desc() {
		return meat_desc;
	}

	public void setMeat_desc(String meat_desc) {
		this.meat_desc = meat_desc;
	}

	public String getTravel() {
		return travel;
	}

	public void setTravel(String travel) {
		this.travel = travel;
	}

	public String getTravel_desc() {
		return travel_desc;
	}

	public void setTravel_desc(String travel_desc) {
		this.travel_desc = travel_desc;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public String getPersonal_desc() {
		return personal_desc;
	}

	public void setPersonal_desc(String personal_desc) {
		this.personal_desc = personal_desc;
	}

	public String getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(String entertainment) {
		this.entertainment = entertainment;
	}

	public String getEntertainment_desc() {
		return entertainment_desc;
	}

	public void setEntertainment_desc(String entertainment_desc) {
		this.entertainment_desc = entertainment_desc;
	}

	public String getCloths() {
		return cloths;
	}

	public void setCloths(String cloths) {
		this.cloths = cloths;
	}

	public String getCloths_desc() {
		return cloths_desc;
	}

	public void setCloths_desc(String cloths_desc) {
		this.cloths_desc = cloths_desc;
	}

	public String getFurniture() {
		return furniture;
	}

	public void setFurniture(String furniture) {
		this.furniture = furniture;
	}

	public String getFurniture_desc() {
		return furniture_desc;
	}

	public void setFurniture_desc(String furniture_desc) {
		this.furniture_desc = furniture_desc;
	}

	public String getElectronics() {
		return electronics;
	}

	public void setElectronics(String electronics) {
		this.electronics = electronics;
	}

	public String getElectronics_desc() {
		return electronics_desc;
	}

	public void setElectronics_desc(String electronics_desc) {
		this.electronics_desc = electronics_desc;
	}

	public String getGrooming() {
		return grooming;
	}

	public void setGrooming(String grooming) {
		this.grooming = grooming;
	}

	public String getGrooming_desc() {
		return grooming_desc;
	}

	public void setGrooming_desc(String grooming_desc) {
		this.grooming_desc = grooming_desc;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
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

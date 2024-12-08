package com.fintrack.FinTrack.entity;


import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Component
@Entity
public class Expense {
	
	@Id
	private String eid;

	@Column
	private String uid;
	
	//@Temporal(TemporalType.DATE)
	@Column(name="date")
	private String date;
	
	@Column(name="dineout")
	private double dineout;
	
	@Column(name="vegetable")
	private double vegetable;
	
	@Column(name="dairy")
	private double dairy;
	
	@Column(name="fruits")
	private double fruits;
	
	@Column(name="meat")
	private double meat;
	
	@Column(name="travel")
	private double travel;
	
	@Column(name="personal")
	private double personal;
	
	@Column(name="entertainment")
	private double entertainment;
	
	@Column(name="cloths")
	private double cloths;
	
	@Column(name="furniture")
	private double furniture;
	
	@Column(name="electronics")
	private double electronics;
	
	@Column(name="grooming")
	private double grooming;
	
	@Column(name="other")
	private double other;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
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

	public double getVegetable() {
		return vegetable;
	}

	public void setVegetable(double vegetable) {
		this.vegetable = vegetable;
	}

	public double getDairy() {
		return dairy;
	}

	public void setDairy(double dairy) {
		this.dairy = dairy;
	}

	public double getFruits() {
		return fruits;
	}

	public void setFruits(double fruits) {
		this.fruits = fruits;
	}

	public double getMeat() {
		return meat;
	}

	public void setMeat(double meat) {
		this.meat = meat;
	}

	public double getTravel() {
		return travel;
	}

	public void setTravel(double travel) {
		this.travel = travel;
	}

	public double getPersonal() {
		return personal;
	}

	public void setPersonal(double personal) {
		this.personal = personal;
	}

	public double getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(double entertainment) {
		this.entertainment = entertainment;
	}

	public double getCloths() {
		return cloths;
	}

	public void setCloths(double cloths) {
		this.cloths = cloths;
	}

	public double getFurniture() {
		return furniture;
	}

	public void setFurniture(double furniture) {
		this.furniture = furniture;
	}

	public double getElectronics() {
		return electronics;
	}

	public void setElectronics(double electronics) {
		this.electronics = electronics;
	}

	public double getGrooming() {
		return grooming;
	}

	public void setGrooming(double grooming) {
		this.grooming = grooming;
	}

	public double getOther() {
		return other;
	}

	public void setOther(double other) {
		this.other = other;
	}
	
}

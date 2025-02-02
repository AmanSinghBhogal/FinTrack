package com.fintrack.FinTrack.entity;


import org.hibernate.annotations.UuidGenerator;
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
	@UuidGenerator
	private String eid;

	@Column
	private String uid;
	
	//@Temporal(TemporalType.DATE)
	@Column(name="date")
	private String date;
	
	@Column(name="dineout")
	private String dineout;
	
	@Column(name="vegetable")
	private String vegetable;
	
	@Column(name="dairy")
	private String dairy;
	
	@Column(name="fruits")
	private String fruits;
	
	@Column(name="meat")
	private String meat;
	
	@Column(name="travel")
	private String travel;
	
	@Column(name="personal")
	private String personal;
	
	@Column(name="entertainment")
	private String entertainment;
	
	@Column(name="cloths")
	private String cloths;
	
	@Column(name="furniture")
	private String furniture;
	
	@Column(name="electronics")
	private String electronics;
	
	@Column(name="grooming")
	private String grooming;
	
	@Column(name="other")
	private String other;
	
	@Column(name="edid")
	private String edid;

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

	public String getDineout() {
		return dineout;
	}

	public void setDineout(String dineout) {
		this.dineout = dineout;
	}

	public String getVegetable() {
		return vegetable;
	}

	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}

	public String getDairy() {
		return dairy;
	}

	public void setDairy(String dairy) {
		this.dairy = dairy;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getTravel() {
		return travel;
	}

	public void setTravel(String travel) {
		this.travel = travel;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public String getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(String entertainment) {
		this.entertainment = entertainment;
	}

	public String getCloths() {
		return cloths;
	}

	public void setCloths(String cloths) {
		this.cloths = cloths;
	}

	public String getFurniture() {
		return furniture;
	}

	public void setFurniture(String furniture) {
		this.furniture = furniture;
	}

	public String getElectronics() {
		return electronics;
	}

	public void setElectronics(String electronics) {
		this.electronics = electronics;
	}

	public String getGrooming() {
		return grooming;
	}

	public void setGrooming(String grooming) {
		this.grooming = grooming;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getEdid() {
		return edid;
	}
	
	public void setEdid(String edid) {
		this.edid = edid;
	}
	
}

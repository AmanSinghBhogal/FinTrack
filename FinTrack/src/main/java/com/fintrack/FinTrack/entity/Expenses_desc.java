package com.fintrack.FinTrack.entity;

import org.hibernate.annotations.UuidGenerator;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "expenses_desc")
public class Expenses_desc {
	
	@Id
	@UuidGenerator
	private String edid;
	
	@Column(name="uid")
	private String uid;
	
	@Column(name="date")
	private String date;
	
	@Column(name="dineout_desc")
	private String dineout_desc;
	
	@Column(name="vegetable_desc")
	private String vegetable_desc;
	
	@Column(name="dairy_desc")
	private String dairy_desc;
	
	@Column(name="fruits_desc")
	private String fruits_desc;
	
	@Column(name="meat_desc")
	private String meat_desc;
	
	@Column(name="travel_desc")
	private String travel_desc;
	
	@Column(name="personal_desc")
	private String personal_desc;
	
	@Column(name="entertainment_desc")
	private String entertainment_desc;
	
	@Column(name="cloths_desc")
	private String cloths_desc;
	
	@Column(name="furniture_desc")
	private String furniture_desc;
	
	@Column(name="electronics_desc")
	private String electronics_desc;
	
	@Column(name="grooming_desc")
	private String grooming_desc;
	
	@Column(name="other_desc")
	private String other_desc;

	public String getEdid() {
		return edid;
	}

	public void setEdid(String edid) {
		this.edid = edid;
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

	public String getDineout_desc() {
		return dineout_desc;
	}

	public void setDineout_desc(String dineout_desc) {
		this.dineout_desc = dineout_desc;
	}

	public String getVegetable_desc() {
		return vegetable_desc;
	}

	public void setVegetable_desc(String vegetable_desc) {
		this.vegetable_desc = vegetable_desc;
	}

	public String getDairy_desc() {
		return dairy_desc;
	}

	public void setDairy_desc(String dairy_desc) {
		this.dairy_desc = dairy_desc;
	}

	public String getFruits_desc() {
		return fruits_desc;
	}

	public void setFruits_desc(String fruits_desc) {
		this.fruits_desc = fruits_desc;
	}

	public String getMeat_desc() {
		return meat_desc;
	}

	public void setMeat_desc(String meat_desc) {
		this.meat_desc = meat_desc;
	}

	public String getTravel_desc() {
		return travel_desc;
	}

	public void setTravel_desc(String travel_desc) {
		this.travel_desc = travel_desc;
	}

	public String getPersonal_desc() {
		return personal_desc;
	}

	public void setPersonal_desc(String personal_desc) {
		this.personal_desc = personal_desc;
	}

	public String getEntertainment_desc() {
		return entertainment_desc;
	}

	public void setEntertainment_desc(String entertainment_desc) {
		this.entertainment_desc = entertainment_desc;
	}

	public String getCloths_desc() {
		return cloths_desc;
	}

	public void setCloths_desc(String cloths_desc) {
		this.cloths_desc = cloths_desc;
	}

	public String getFurniture_desc() {
		return furniture_desc;
	}

	public void setFurniture_desc(String furniture_desc) {
		this.furniture_desc = furniture_desc;
	}

	public String getElectronics_desc() {
		return electronics_desc;
	}

	public void setElectronics_desc(String electronics_desc) {
		this.electronics_desc = electronics_desc;
	}

	public String getGrooming_desc() {
		return grooming_desc;
	}

	public void setGrooming_desc(String grooming_desc) {
		this.grooming_desc = grooming_desc;
	}

	public String getOther_desc() {
		return other_desc;
	}

	public void setOther_desc(String other_desc) {
		this.other_desc = other_desc;
	}

}

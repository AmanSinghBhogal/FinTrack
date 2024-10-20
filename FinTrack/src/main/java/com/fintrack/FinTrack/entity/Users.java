// This is layer 2: Model / Data Layer
package com.fintrack.FinTrack.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Component
@Entity
public class Users {
	
	@Id
	private String uid;
	
	@Column(name="name", length=36)
	private String name;
	
	@Column(name="password", length=100)
	private String password;
	
	@Column(name="age", length=256)
	private int age;
	
	@Column(name="gender", length=1)
	private char gender;
	
	@Column (name="wallet")
	private double wallet;
	
	@Column (name="email", length=50)
	private String email;
	
	@Column (name="mob", length=14)
	private String mob;
	
	@Column (name="cur", length=10)
	private String cur;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getCur() {
		return cur;
	}
	public void setCur(String cur) {
		this.cur = cur;
	}
}

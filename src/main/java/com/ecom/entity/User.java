package com.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="user")
public class User {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	int uid;
	String username;
	String city;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String username, String city) {
		super();
		this.uid = uid;
		this.username = username;
		this.city = city;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}

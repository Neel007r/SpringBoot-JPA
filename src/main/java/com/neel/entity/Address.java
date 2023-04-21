package com.neel.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

//@Embeddable
public class Address {
	
	private String street;
	private String city;
	private String province_state;
	private String country;
	
	public Address() {
	}

	public Address(String street, String city, String province_state, String country) {
		this.street = street;
		this.city = city;
		this.province_state = province_state;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince_state() {
		return province_state;
	}

	public void setProvince_state(String province_state) {
		this.province_state = province_state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
	
	
	

}

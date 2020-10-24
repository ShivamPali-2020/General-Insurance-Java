package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="demo-address")
public class Address {
	@Id
	long addressId;
	
	@Column(name="houseNo")
	int houseNo;
	
	@Column(name="street")
	String street;
	
	@Column(name="landmark")
	String landmark;
	
	@Column(name="district")
	String district;
	
	@Column(name="state")
	String state;
	
	@Column(name="pincode")
	Number pincode;

	@OneToOne(mappedBy="address",cascade=CascadeType.ALL)
	User user;
	
	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Number getPincode() {
		return pincode;
	}

	public void setPincode(Number pincode) {
		this.pincode = pincode;
	}
	
}

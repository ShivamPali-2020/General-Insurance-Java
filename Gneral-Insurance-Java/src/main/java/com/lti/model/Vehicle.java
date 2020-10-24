package com.lti.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "demo-Vehicle")
public class Vehicle {
	@Id
	long vehicleId;
	String type;
	String manufacturer;
	String model;
	String drivingLicense;
	LocalDate purchaseDate;
	long registrationNo;
	long engineNo;
	long chassisNo;

	@OneToOne(mappedBy = "vehicle", cascade = CascadeType.ALL)
	BuyInsurance buyInsurance;

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public long getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(long registrationNo) {
		this.registrationNo = registrationNo;
	}

	public long getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(long engineNo) {
		this.engineNo = engineNo;
	}

	public long getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(long chassisNo) {
		this.chassisNo = chassisNo;
	}

	public BuyInsurance getBuyInsurance() {
		return buyInsurance;
	}

	public void setBuyInsurance(BuyInsurance buyInsurance) {
		this.buyInsurance = buyInsurance;
	}

}

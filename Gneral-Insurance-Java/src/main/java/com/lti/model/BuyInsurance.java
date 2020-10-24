package com.lti.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "demo-BuyInsurance")
public class BuyInsurance {
	@Id
	long policyNo;
	PolicyCategory policyCategory;
	Status status;
	LocalDate timeFrom;
	LocalDate timeValidTill;
	int years;

	@ManyToOne
	@JoinColumn(name = "userId")
	User user;

	@ManyToOne
	@JoinColumn(name = "policyPlanId")
	PolicyPlan policyPlan;

	@OneToOne
	@JoinColumn(name = "vehicleId")
	Vehicle vehicle;

	@ManyToOne
	@JoinColumn(name = "adminId")
	Admin admin;

	@OneToMany(mappedBy = "buyInsurance", cascade = CascadeType.ALL)
	ClaimInsurance claimInsurance;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public ClaimInsurance getClaimInsurance() {
		return claimInsurance;
	}

	public void setClaimInsurance(ClaimInsurance claimInsurance) {
		this.claimInsurance = claimInsurance;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDate getTimeFrom() {
		return timeFrom;
	}

	public void setTimeFrom(LocalDate timeFrom) {
		this.timeFrom = timeFrom;
	}

	public LocalDate getTimeValidTill() {
		return timeValidTill;
	}

	public void setTimeValidTill(LocalDate timeValidTill) {
		this.timeValidTill = timeValidTill;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public long getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(long policyNo) {
		this.policyNo = policyNo;
	}

	public PolicyCategory getPolicyCategory() {
		return policyCategory;
	}

	public void setPolicyCategory(PolicyCategory policyCategory) {
		this.policyCategory = policyCategory;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PolicyPlan getPolicyPlan() {
		return policyPlan;
	}

	public void setPolicyPlan(PolicyPlan policyPlan) {
		this.policyPlan = policyPlan;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}

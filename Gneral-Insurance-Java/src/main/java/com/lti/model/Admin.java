package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "demo-Admin")
public class Admin {
	@Id
	long adminId;
	String name;
	String email;
	String password;

	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
	PolicyPlan policyPlan;

	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
	BuyInsurance buyInsurance;
	
	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
	ClaimInsurance claimInsurance;

	public BuyInsurance getBuyInsurance() {
		return buyInsurance;
	}

	public void setBuyInsurance(BuyInsurance buyInsurance) {
		this.buyInsurance = buyInsurance;
	}

	public ClaimInsurance getClaimInsurance() {
		return claimInsurance;
	}

	public void setClaimInsurance(ClaimInsurance claimInsurance) {
		this.claimInsurance = claimInsurance;
	}

	public PolicyPlan getPolicyPlan() {
		return policyPlan;
	}

	public void setPolicyPlan(PolicyPlan policyPlan) {
		this.policyPlan = policyPlan;
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

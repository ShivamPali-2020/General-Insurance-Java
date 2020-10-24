package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "demo-PolicyPlan")
public class PolicyPlan {
	@Id
	long policyplanId;
	String policyName;
	PolicyCategory policyCategory;
	int policyAmount;

	@ManyToOne
	@JoinColumn(name = "adminId")
	Admin admin;

	@OneToMany(mappedBy = "policyPlan", cascade = CascadeType.ALL)
	BuyInsurance buyInsurance;

	public long getPolicyplanId() {
		return policyplanId;
	}

	public void setPolicyplanId(long policyplanId) {
		this.policyplanId = policyplanId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public PolicyCategory getPolicyCategory() {
		return policyCategory;
	}

	public void setPolicyCategory(PolicyCategory policyCategory) {
		this.policyCategory = policyCategory;
	}

	public BuyInsurance getBuyInsurance() {
		return buyInsurance;
	}

	public void setBuyInsurance(BuyInsurance buyInsurance) {
		this.buyInsurance = buyInsurance;
	}

	public int getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}

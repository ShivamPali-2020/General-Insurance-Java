package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "demo-ClaimInsurance")
public class ClaimInsurance {
	@Id
	long claimId;
	String reason;
	LocalDate date;
	double amount;
	Status status;

	@ManyToOne
	@JoinColumn(name = "adminId")
	Admin admin;

	@ManyToOne
	@JoinColumn(name = "policyNo")
	BuyInsurance buyInsurance;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public BuyInsurance getBuyInsurance() {
		return buyInsurance;
	}

	public void setBuyInsurance(BuyInsurance buyInsurance) {
		this.buyInsurance = buyInsurance;
	}

	public long getClaimId() {
		return claimId;
	}

	public void setClaimId(long claimId) {
		this.claimId = claimId;
	}
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}

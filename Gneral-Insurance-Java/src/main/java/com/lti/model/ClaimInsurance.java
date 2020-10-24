package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="demo_claim_insurance")
public class ClaimInsurance {
	@Column(name="claim_id")
long claimId;
	@Column(name="policy_no")
	long policyNo;
	@Column(name="reason")   //--------------------------------???
	String reason;
	@Column(name="claim_date")
	LocalDate date;
	@Column(name="claim_amount")
	double amount;
	@Column(name="claim_status")
	String status;
	public long getClaimId() {
		return claimId;
	}
	public void setClaimId(long claimId) {
		this.claimId = claimId;
	}
	public long getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(long policyNo) {
		this.policyNo = policyNo;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

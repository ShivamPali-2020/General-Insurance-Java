package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="demo_tbl_user")
public class User {
@Id
@Column(name="user_id")
long userId;
@Column(name="user_name")
String name;
@Column(name="user_email")
String email;
@Column(name="user_dob")
LocalDate DOB;
@Column(name="user_mobno")
String mobileNo;


@OneToOne
@JoinColumn(name="address_id")
Address address;


@Column(name="user_pass")
String password;
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
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
public LocalDate getDOB() {
	return DOB;
}
public void setDOB(LocalDate dOB) {
	DOB = dOB;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}







}

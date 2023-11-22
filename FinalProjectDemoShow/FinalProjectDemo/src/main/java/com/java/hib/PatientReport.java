package com.java.hib;

import java.util.Date;

public class PatientReport {
	
	private String uhId;
	private String firstName;
	private String lastName;
	private Date dob;
	private Gender gender;
	private String userName;
	private String phoneNo;
	private String email;
	private String status;
	private String cause;
	private String address;
	private String medHistory;
	
	public String getUhId() {
		return uhId;
	}
	public void setUhId(String uhId) {
		this.uhId = uhId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMedHistory() {
		return medHistory;
	}
	public void setMedHistory(String medHistory) {
		this.medHistory = medHistory;
	}
	@Override
	public String toString() {
		return "PatientReport [uhId=" + uhId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", userName=" + userName + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", status=" + status + ", cause=" + cause + ", address=" + address + ", medHistory=" + medHistory
				+ "]";
	}
	public PatientReport(String uhId, String firstName, String lastName, Date dob, Gender gender, String userName,
			String phoneNo, String email, String status, String cause, String address, String medHistory) {
		super();
		this.uhId = uhId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.status = status;
		this.cause = cause;
		this.address = address;
		this.medHistory = medHistory;
	}
	public PatientReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

package com.java.bank;

import java.sql.Date;

import com.java.realtime.Gender;

public class Bank {
	private int accountno;
	private String firstname;
	private String lastname;
	private String city;
	private String state;
	private int amount;
	private String cheqFacil;
	private String accountType;
	private String status;
	private Date dateOfOpen;
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCheqFacil() {
		return cheqFacil;
	}
	public void setCheqFacil(String cheqFacil) {
		this.cheqFacil = cheqFacil;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateOfOpen() {
		return dateOfOpen;
	}
	public void setDateOfOpen(Date dateOfOpen) {
		this.dateOfOpen = dateOfOpen;
	}
	@Override
	public String toString() {
		return "Bank [accountno=" + accountno + ", firstname=" + firstname + ", lastname=" + lastname + ", city=" + city
				+ ", state=" + state + ", amount=" + amount + ", cheqFacil=" + cheqFacil + ", accountType="
				+ accountType + ", status=" + status + ", dateOfOpen=" + dateOfOpen + "]";
	}
	public Bank(int accountno, String firstname, String lastname, String city, String state, int amount,
			String cheqFacil, String accountType, String status, Date dateOfOpen) {
		super();
		this.accountno = accountno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.state = state;
		this.amount = amount;
		this.cheqFacil = cheqFacil;
		this.accountType = accountType;
		this.status = status;
		this.dateOfOpen = dateOfOpen;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

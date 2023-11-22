package com.java.ejb;

 

import java.io.Serializable;

 

public class Patient implements Serializable{

	private String pid;

	private String name;

	private int age;

	private int weight;

	private String gender;

	private String address;

	private String phoneno;

	private String disease;

	private String doctorid;

	private String email;

	private String password;

	private String otp;

	private String status;

	public String getPid() {

		return pid;

	}

	public void setPid(String pid) {

		this.pid = pid;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getAge() {

		return age;

	}

	public void setAge(int age) {

		this.age = age;

	}

	public int getWeight() {

		return weight;

	}

	public void setWeight(int weight) {

		this.weight = weight;

	}

	public String getGender() {

		return gender;

	}

	public void setGender(String gender) {

		this.gender = gender;

	}

	public String getAddress() {

		return address;

	}

	public void setAddress(String address) {

		this.address = address;

	}

	public String getPhoneno() {

		return phoneno;

	}

	public void setPhoneno(String phoneno) {

		this.phoneno = phoneno;

	}

	public String getDisease() {

		return disease;

	}

	public void setDisease(String disease) {

		this.disease = disease;

	}

	public String getDoctorid() {

		return doctorid;

	}

	public void setDoctorid(String doctorid) {

		this.doctorid = doctorid;

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

	public String getOtp() {

		return otp;

	}

	public void setOtp(String otp) {

		this.otp = otp;

	}

	public String getStatus() {

		return status;

	}

	public void setStatus(String status) {

		this.status = status;

	}
	

}
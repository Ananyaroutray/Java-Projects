package com.java.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor_Master")
public class Doctor implements Serializable {

	@Id
	@GeneratedValue
	
	@Column(name="dr_Id")
	private String doctorId;
	
	@Column(name="dr_name")
	private String drName;
	
	@Column(name="dept")
	private String dept;
	
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDrName() {
		return drName;
	}
	public void setDrName(String drName) {
		this.drName = drName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Doctor(String doctorId, String drName, String dept) {
		super();
		this.doctorId = doctorId;
		this.drName = drName;
		this.dept = dept;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", drName=" + drName + ", dept=" + dept + "]";
	}
	
	
	
}

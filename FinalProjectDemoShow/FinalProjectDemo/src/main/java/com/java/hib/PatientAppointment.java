package com.java.hib;

import java.util.Date;

public class PatientAppointment {
	private String appointmentId;
	private String providerid;
	private String uhId;
	private String department;
	private String firstName;
	private String lastName;
	private Date appointmentDate;
	private String appointmentTime;
	private String reason;
	private String status;
	
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getProviderid() {
		return providerid;
	}
	public void setProviderid(String providerid) {
		this.providerid = providerid;
	}
	public String getUhId() {
		return uhId;
	}
	public void setUhId(String uhId) {
		this.uhId = uhId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
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
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

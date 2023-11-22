package com.java.Complaint;

import java.util.Date;

public class Complaint {
	private String complaintId;
	private String complaintType;
	private String cDescription;
	private Date complaintDate;
	private String severity;
	private Status status;
	
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(String complaintId, String complaintType, String cDescription, Date compalintDate, String severity,
			Status status) {
		super();
		this.complaintId = complaintId;
		this.complaintType = complaintType;
		this.cDescription = cDescription;
		complaintDate = compalintDate;
		this.severity = severity;
		this.status = status;
	}
	public String getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}
	public String getComplaintType() {
		return complaintType;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	public String getcDescription() {
		return cDescription;
	}
	public void setcDescription(String cDescription) {
		this.cDescription = cDescription;
	}
	public Date getCompalintDate() {
		return complaintDate;
	}
	public void setCompalintDate(Date compalintDate) {
		complaintDate = compalintDate;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Complaint [complaintId=");
		builder.append(complaintId);
		builder.append(", complaintType=");
		builder.append(complaintType);
		builder.append(", cDescription=");
		builder.append(cDescription);
		builder.append(", CompalintDate=");
		builder.append(complaintDate);
		builder.append(", severity=");
		builder.append(severity);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
	
}

package com.java.Complaint;

import java.util.Date;

public class Resolve {
	private String resolveId;
	private String complaintId;
	private Date complaintDate;
	private Date resolvedDate;
	private String resolvedBy;
	private String comment;
	public Resolve() {
		super();
	}
	public Resolve(String resolveId, String complaintId, Date complaintDate, Date resolvedDate, String resolvedBy,
			String comment) {
		super();
		this.resolveId = resolveId;
		this.complaintId = complaintId;
		this.complaintDate = complaintDate;
		this.resolvedDate = resolvedDate;
		this.resolvedBy = resolvedBy;
		this.comment = comment;
	}
	public String getResolveId() {
		return resolveId;
	}
	public void setResolveId(String resolveId) {
		this.resolveId = resolveId;
	}
	public String getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}
	public Date getComplaintDate() {
		return complaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		this.complaintDate = complaintDate;
	}
	public Date getResolvedDate() {
		return resolvedDate;
	}
	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}
	public String getResolvedBy() {
		return resolvedBy;
	}
	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resolve [resolveId=");
		builder.append(resolveId);
		builder.append(", complaintId=");
		builder.append(complaintId);
		builder.append(", complaintDate=");
		builder.append(complaintDate);
		builder.append(", resolvedDate=");
		builder.append(resolvedDate);
		builder.append(", resolvedBy=");
		builder.append(resolvedBy);
		builder.append(", comment=");
		builder.append(comment);
		builder.append("]");
		return builder.toString();
	}
	
	
}

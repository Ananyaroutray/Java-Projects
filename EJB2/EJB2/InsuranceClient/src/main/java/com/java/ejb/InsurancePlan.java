package com.java.ejb;

public class InsurancePlan {
	private int planId;
	private String insuranceId;
	private Double premiumAmount;
	private Double covAmount;
	
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}
	public Double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public Double getCovAmount() {
		return covAmount;
	}
	public void setCovAmount(Double covAmount) {
		this.covAmount = covAmount;
	}
	@Override
	public String toString() {
		return "InsurancePlan [planId=" + planId + ", insuranceId=" + insuranceId + ", premiumAmount=" + premiumAmount
				+ ", covAmount=" + covAmount + "]";
	}
	public InsurancePlan(int planId, String insuranceId, Double premiumAmount, Double covAmount) {
		super();
		this.planId = planId;
		this.insuranceId = insuranceId;
		this.premiumAmount = premiumAmount;
		this.covAmount = covAmount;
	}
	public InsurancePlan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

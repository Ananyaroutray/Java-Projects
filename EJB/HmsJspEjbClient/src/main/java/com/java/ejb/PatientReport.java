package com.java.ejb;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Session Bean implementation class PatientReport
 */
@Entity
@Table(name="Patient_report")
public class PatientReport implements Serializable{
    /**
     * Default constructor. 
     */
    public PatientReport() {
    	super();
       
    }
    @Id	
	@Column(name="Report_Id")
    private int reportId;
    
    @Column(name="pid")
    private int pId;
    
    @Column(name="TestCode")
    private String testCode;
    
    @Column(name="TestName")
    private String testName;
    
    @Column(name="TestDescription")
    private String testDescription;
    
    @Column(name="Cost")
    private double cost;
    
    @Column(name="Comments")
    private double comments;

	public int getReportId() {
		return reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getTestCode() {
		return testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestDescription() {
		return testDescription;
	}

	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getComments() {
		return comments;
	}

	public void setComments(double comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "PatientReport [reportId=" + reportId + ", pId=" + pId + ", testCode=" + testCode + ", testName="
				+ testName + ", testDescription=" + testDescription + ", cost=" + cost + ", comments=" + comments + "]";
	}

	public PatientReport(int reportId, int pId, String testCode, String testName, String testDescription, double cost,
			double comments) {
		super();
		this.reportId = reportId;
		this.pId = pId;
		this.testCode = testCode;
		this.testName = testName;
		this.testDescription = testDescription;
		this.cost = cost;
		this.comments = comments;
	}
    

}

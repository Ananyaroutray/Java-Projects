package com.java.ejb;

import javax.ejb.Remote;

@Remote
public interface PatientReportRemote {
	String addreport(PatientReport patientreport);

}

package com.java.ejb;

import java.sql.SQLException;

public interface PatientReportDAO {
	
	String addPatientReport(PatientReport patientReport) throws ClassNotFoundException, SQLException;

}

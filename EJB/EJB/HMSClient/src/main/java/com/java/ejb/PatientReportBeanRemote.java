package com.java.ejb;

import java.sql.SQLException;

import javax.ejb.Remote;

@Remote
public interface PatientReportBeanRemote {
    String addPatientReport(PatientReport patientReport) throws ClassNotFoundException, SQLException;
   
}


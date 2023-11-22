package com.java.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientReportDaoImpl implements PatientReportDAO{
	
	    Connection connection;
	    PreparedStatement pst;

	    public String incrementReportId() throws ClassNotFoundException, SQLException {
	        connection = ConnectionHelper.getConnection();
	        String cmd = "SELECT MAX(Report_Id) AS Report_Id FROM Patient_Report";
	        pst = connection.prepareStatement(cmd);
	        pst.executeQuery();
	        return "R0001";  // You can implement the actual logic to generate report IDs.
	    }

	@Override
	public String addPatientReport(PatientReport patientReport) throws ClassNotFoundException, SQLException {
	        String reportId = incrementReportId();
	        connection = ConnectionHelper.getConnection();
	        String cmd = "INSERT INTO Patient_Report(Report_Id, pid, TestCode, TestName, TestDescription, Cost, Comments) " +
	                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
	        pst = connection.prepareStatement(cmd);
	        pst.setString(1, reportId);
	        pst.setString(2, patientReport.getPid());
	        pst.setString(3, patientReport.getTestCode());
	        pst.setString(4, patientReport.getTestName());
	        pst.setString(5, patientReport.getTestDescription());
	        pst.setDouble(6, patientReport.getCost());
	        pst.setString(7, patientReport.getComments());
	        
	        pst.executeUpdate();
	        return "Data Inserted into the Table";
	}

}

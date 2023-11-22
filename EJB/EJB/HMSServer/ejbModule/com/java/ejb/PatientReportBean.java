package com.java.ejb;

import java.sql.SQLException;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class PatientReportBean
 */
@Stateless
@Remote(PatientReportBeanRemote.class)
public class PatientReportBean implements PatientReportBeanRemote {
	static PatientReportDAO patientReportDao;

    static {
        patientReportDao = new PatientReportDaoImpl();
    }


    /**
     * Default constructor. 
     */
    public PatientReportBean() {
        // TODO Auto-generated constructor stub
    }


	@Override
	public String addPatientReport(PatientReport patientReport) throws ClassNotFoundException, SQLException {	
		return patientReportDao.addPatientReport(patientReport);
	}

}

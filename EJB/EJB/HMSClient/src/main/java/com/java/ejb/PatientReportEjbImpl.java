package com.java.ejb;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class PatientReportEjbImpl {
	
	public String redirectAddReportEjb(String pid) throws NamingException, ClassNotFoundException, SQLException {
        Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        sessionMap.put("pid", pid); // Assuming "pid" is the patient's ID
        return "addPatientReport.jsp?faces-redirect=true";
    }

    public String addPatientReportEjb(PatientReport patientReport) throws NamingException, ClassNotFoundException, SQLException {
        PatientReportBeanRemote remote = PatientReportRemoteHelper.lookupRemoteStatelessPatient();
        remote.addPatientReport(patientReport);
        return "addReportSuccess.jsp?faces-redirect=true";
    }

}

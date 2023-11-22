package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class PatientReportDAOImpl implements PatientReportDAO {
	SessionFactory sf ;
	Session session;
	@Override
	public List<PatientReport> showPatientReportDAO() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(PatientReport.class);
		return cr.list();
	}	

}

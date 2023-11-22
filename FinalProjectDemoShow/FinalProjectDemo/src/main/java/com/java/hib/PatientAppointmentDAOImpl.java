package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PatientAppointmentDAOImpl implements PatientAppointmentDAO {
	
	SessionFactory sf ;
	Session session;


	@Override
	public List<PatientAppointment> showPatientAppointmenDAO() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(PatientAppointment.class);
		return cr.list();
	}	
}
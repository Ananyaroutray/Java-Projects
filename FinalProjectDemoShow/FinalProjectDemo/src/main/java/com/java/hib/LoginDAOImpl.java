package com.java.hib;



import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class LoginDAOImpl implements LoginDAO {
	
	SessionFactory sf ;
	Session session;



	@Override
	public String loginDao(Login login) {
		 Map<String, Object> sessionMap =
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		String encPass = EncryptPassword.getCode(login.getPassword());
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eqOrIsNull("userName", login.getUserName()));
		cr.add(Restrictions.eqOrIsNull("password", encPass.trim()));
		System.out.println(encPass.trim());
		cr.setProjection(Projections.rowCount());
		long count = (long)cr.uniqueResult();
		session.close();
		sf.close();

		if(count==1) {
			sessionMap.put("loggedCustomer",  login.getUserName());
			System.out.println(login.getUserName());
//			sessionMap.put("uhid", login.getUhId());
			
			System.out.println(sessionMap.put("uhid", login.getUhId()));
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			cr = session.createCriteria(Login.class);
			cr.add(Restrictions.eqOrIsNull("userName", login.getUserName()));
			Login customerFound = (Login) cr.uniqueResult();
			sessionMap.put("customerFound", customerFound);
			sessionMap.put("uhid", customerFound.getUhId());
			System.out.println("Sessionfactory");
			System.out.println(sessionMap.put("uhid", customerFound.getUhId()));
			return "DashBoard.jsp?faces-redirect=true";
		}else {
			sessionMap.put("errorMessage", "Invalid Credentials....");
			return "DashBoard.jsp?faces-redirect=true";
		}
	}
	


	@Override
	public List<Login> showLogin() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Login.class);
		return cr.list();
	}

	@Override
	public String addMember(Login login) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(login);
		trans.commit();
		return "PatientAppointment.xhtml?faces-redirect=true";
	}

	    
		    
	
	
	public String searchCustomerDetailsDao() {
		Map<String, Object> sessionMap =
						FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		 String customerLoggined = (String)sessionMap.get("loggedCustomer");
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			Criteria criteria = session.createCriteria(PatientAppointment.class);
			
			criteria.add(Restrictions.eq("uhId", customerLoggined));
			PatientAppointment customerData = (PatientAppointment) criteria.uniqueResult();
		//	sessionMap.put("customerFound", customerData);
			sessionMap.put("customerId", customerData.getUhId());
			return "CustomerInfo.jsp?faces-redirect=true";
		}
	

	
	public String showAppointmentVisited() {
	    System.out.println("Inside show appointment");
	    Map<String, Object> sessionMap =
	            FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	    sf = SessionHelper.getConnection();
	    session = sf.openSession();
	    String uhid = (String) sessionMap.get("uhid");
	    System.out.println("uhid from show : " + uhid);
	    // Get today's date
	    Date today = new Date();
	 
	    Criteria criteria = session.createCriteria(PatientAppointment.class);
	    criteria.add(Restrictions.eq("uhId", uhid));
	    // Adding a restriction for appointments on or before today's date
	    criteria.add(Restrictions.le("appointmentDate", today));
	    criteria.add(Restrictions.eq("status", "VISITED"));

	 
	    List<PatientAppointment> patientList = criteria.list();
	    sessionMap.put("patientList", patientList);
	    return "ShowPatientList.jsp?faces-redirect=true";
	}

	
	public String showAppointmentConfirmed() {
	System.out.println("Inside show confirmed appointments");
    Map<String, Object> sessionMap =
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
    sf = SessionHelper.getConnection();
    session = sf.openSession();
    String uhid = (String) sessionMap.get("uhid");
    System.out.println("uhid from show : " + uhid);
    
    // Get today's date
    Date today = new Date();
 
    Criteria criteria = session.createCriteria(PatientAppointment.class);
    criteria.add(Restrictions.eq("uhId", uhid));
    criteria.add(Restrictions.eq("status", "CONFIRMED"));
    // Adding a restriction for appointments after today's date
    criteria.add(Restrictions.gt("appointmentDate", today));
 
    List<PatientAppointment> patientList = criteria.list();
    sessionMap.put("patientList", patientList);
    return "ShowPatientListConfirm.jsp?faces-redirect=true";
}


	public List<PatientAppointment> getPatientAppointmentList(int firstRow, int rowsPerPage) {
		System.out.println("Rows per page"+ rowsPerPage);
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		List<PatientAppointment> ptList = null;
			session.beginTransaction();
			Criteria criteria = session.createCriteria(PatientAppointment.class);
			criteria.add(Restrictions.eq("status", "VISITED"));
//			criteria.add(Restrictions.eq("status", "CONFIRMED"));
			criteria.setFirstResult(firstRow);
			criteria.setMaxResults(rowsPerPage);
		return criteria.list();
	}


	public int countRows() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(PatientAppointment.class);
			if (criteria != null) {
				criteria.add(Restrictions.eq("status", "VISITED"));
				return criteria.list().size();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	}



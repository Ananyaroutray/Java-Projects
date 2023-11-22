package com.java.ejb;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class EmployEjbImpl {
	public List<Employ> showEmployEjb() throws NamingException, ClassNotFoundException, SQLException {
		EmployEjbBeanRemote remote = 
				RemoteHelper.lookupRemoteStatelessEmploy();
		 return remote.showEmploy();
		}
	
	public String searchEmployEjb(int empno) throws NamingException, ClassNotFoundException, SQLException {
		EmployEjbBeanRemote remote = 
				RemoteHelper.lookupRemoteStatelessEmploy();
		Employ employ = remote.searchEmploy(empno);
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		 sessionMap.put("editEmploy", employ);
		 return "UpdateEmploy.jsp?faces-redirect=true";
	}
	public String updateEmployEjb(Employ employ) throws ClassNotFoundException, SQLException, NamingException {
		EmployEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		remote.updateEmploy(employ);
		return "EmployDaoTable.jsp?faces-redirect=true";
	}
	public String deleteEmployEjb(int empno) throws NamingException, ClassNotFoundException, SQLException {
		EmployEjbBeanRemote remote = 
				RemoteHelper.lookupRemoteStatelessEmploy();
		remote.deleteEmploy(empno);
		return "EmployDaoTable.jsp?faces-redirect=true";		
	}
	public String addEmployEjb(Employ employ) throws NamingException, ClassNotFoundException, SQLException {	
	EmployEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
	remote.addEmploy(employ);
	return "EmployDaoTable.jsp?faces-redirect=true";
	}
}

package com.java.ejb;

import java.util.List;

import javax.naming.NamingException;

public class EjbImpl {
	public List<Patient> showPatientEjb() throws NamingException {
		PatientBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showPatient();
	}

}

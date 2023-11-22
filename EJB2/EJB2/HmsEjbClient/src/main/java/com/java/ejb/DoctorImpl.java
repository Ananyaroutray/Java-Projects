package com.java.ejb;

import java.util.List;

import javax.naming.NamingException;

public class DoctorImpl {
	
	public List<Doctor> showDoctorEjb() throws NamingException{
		HmsBeanRemote remote = RemoteHelper.lookupRemoteStatelessHms();
		return remote.showDoctor();
	}

}

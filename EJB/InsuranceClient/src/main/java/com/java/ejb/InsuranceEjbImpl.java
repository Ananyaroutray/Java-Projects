package com.java.ejb;

import java.util.List;

import javax.naming.NamingException;

public class InsuranceEjbImpl {

	public List<InsuranceDetails> showInsuranceEjb() throws NamingException{
		InsuranceBeanRemote remote = RemoteHelper.lookupRemoteStatelessInsurance();
		return remote.showInsurance();
	}
}
package com.java.ejb;

import java.util.List;

public interface PatientDAO {
	
	List<Patient> showPatient();

	String addPatient(Patient patient);
}

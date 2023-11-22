package com.java.Complaint;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public interface ComplaintDAO {
	List<Complaint> showAllComplaint() throws ClassNotFoundException, ParseException, SQLException;
	Complaint searchComplaint(String compId) throws ClassNotFoundException, SQLException, ParseException;
	String addComplaint(Complaint complaint) throws ClassNotFoundException, SQLException;
	String deleteComplaint(String ComplaintId) throws ClassNotFoundException, SQLException, ParseException;
}

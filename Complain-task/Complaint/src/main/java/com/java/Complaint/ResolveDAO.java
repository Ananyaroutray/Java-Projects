package com.java.Complaint;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public interface ResolveDAO {
	List<Resolve> showResolvedData() throws SQLException, ClassNotFoundException;
	String AddResolve(Resolve resolve) throws ClassNotFoundException, SQLException, ParseException;
	String deleteResolvedComplaint(String Complaint);
}

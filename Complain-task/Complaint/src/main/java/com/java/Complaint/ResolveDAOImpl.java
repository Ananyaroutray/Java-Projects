package com.java.Complaint;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResolveDAOImpl implements ResolveDAO{
	Connection connection;
	PreparedStatement pst;
	
	public String generateReOrderId() throws ClassNotFoundException, SQLException {
		connection=ConnectionHelper.getConnection();
		String cmd="select max(resolvedId) max from Resolve";
		pst=connection.prepareStatement(cmd);
		ResultSet rs= pst.executeQuery();
		rs.next();
		String orderId = rs.getString("max");

		if(orderId==null) {
			return "R001";
		}else {
			int id=Integer.parseInt(orderId.substring(2));
			return String.format("R0%02d",++id );
			
		}
	}
	
	@Override
	public List<Resolve> showResolvedData() throws SQLException, ClassNotFoundException {
		connection=ConnectionHelper.getConnection();
		String cmd="Select * from resolve";
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		Resolve resolve=null;
		List<Resolve> resolveList=new ArrayList<Resolve>();
		if(rs.next()) {
			resolve=new Resolve();
			resolve.setResolveId(rs.getString("ResolveID"));
			resolve.setComplaintId(rs.getString("ComplaintID"));
			resolve.setComplaintDate(rs.getDate("ComplaintDate"));
			resolve.setResolvedDate(rs.getDate("ResolveDate"));
			resolve.setResolvedBy(rs.getString("ResolvedBy"));
			resolve.setComment(rs.getString("Comments"));
			resolveList.add(resolve);
		}
		return resolveList;
	}


	@Override
	public String AddResolve(Resolve resolve) throws ClassNotFoundException, SQLException, ParseException {
		connection=ConnectionHelper.getConnection();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String cmd1="select Complaintdate from complaint where ComplaintID=?";
		pst=connection.prepareStatement(cmd1);
		pst.setString(1, resolve.getComplaintId());
		ResultSet rs=pst.executeQuery();
		rs.next();
		String  ComplainD=rs.getString("Complaintdate");
		java.util.Date cDate = sdf.parse(ComplainD);
		java.sql.Date sqlCDate = new java.sql.Date(cDate.getTime());
		pst.close();
		String resolveid=generateReOrderId();
		String cmd2="Insert into resolve(ResolveID,ComplaintID,ComplaintDate,ResolvedBy,Comments) values(?,?,?,?,?) ";
		pst=connection.prepareStatement(cmd2);
	    pst.setString(1,resolveid);
	    pst.setString(2, resolve.getComplaintId());
	    pst.setDate(3, sqlCDate );
	    pst.setString(4, resolve.getResolvedBy());
	    pst.setString(5, resolve.getComment());
	    pst.executeUpdate();
		return "The Complaint has been resolved, Your Resolve Id: "+ resolve.getResolveId();
	}

	@Override
	public String deleteResolvedComplaint(String Complaint) {
		return null;
	}

}

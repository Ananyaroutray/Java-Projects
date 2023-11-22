package com.java.Complaint;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class ComplainDAOImpl implements ComplaintDAO {
	Connection connection;
	PreparedStatement pst;
	
	public String generateOrderId() throws ClassNotFoundException, SQLException {
		connection=ConnectionHelper.getConnection();
		String cmd="select max(ComplaintId) max from Complaint";
		pst=connection.prepareStatement(cmd);
		ResultSet rs= pst.executeQuery();
		rs.next();
		String orderId = rs.getString("max");

		if(orderId==null) {
			return "C001";
		}else {
			int id=Integer.parseInt(orderId.substring(2));
			return String.format("C0%02d",++id );
			
		}
	}
	
	public int tatCalculate(Date startDate) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		long endDate=System.currentTimeMillis();  
		long ms = endDate - startDate.getTime();
		int diff = (int)(ms/(1000 * 60 * 60 * 24));
		diff++;
		return diff;
	}

	@Override
	public List<Complaint> showAllComplaint() throws ClassNotFoundException, ParseException, SQLException {
		connection=ConnectionHelper.getConnection();
	    String cmd1="select * from Complaint";
	    pst=connection.prepareStatement(cmd1);
	    ResultSet rs=pst.executeQuery();
	    
	    Complaint complaint= null;
	    List<Complaint> comList=new ArrayList<Complaint>();
	    while(rs.next()) {
	    	complaint=new Complaint();
	    	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	    	java.util.Date cdate= sdf.parse(rs.getString("ComplaintDate"));
	    	complaint.setComplaintId(rs.getString("ComplaintID"));
	    	complaint.setComplaintType(rs.getString("ComplaintType"));
	    	complaint.setcDescription(rs.getString("CDescription"));
	    	complaint.setCompalintDate(cdate);
	    	complaint.setSeverity(rs.getString("Severity"));
	    	complaint.setStatus(Status.valueOf(rs.getString("Status")));
	    	comList.add(complaint);
	    	
	    }
		
		return comList;
	}

	@Override
	public Complaint searchComplaint(String compId) throws ClassNotFoundException, SQLException, ParseException {
		connection=ConnectionHelper.getConnection();
		String cmd="select * from complaint where complaintId=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, compId);
		ResultSet rs=pst.executeQuery();
		Complaint complaint=new  Complaint();
		if(rs.next()) {
			complaint=new Complaint();
	    	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	    	java.util.Date cdate= sdf.parse(rs.getString("ComplaintDate"));
	    	complaint.setComplaintId(rs.getString("ComplaintID"));
	    	complaint.setComplaintType(rs.getString("ComplaintType"));
	    	complaint.setcDescription(rs.getString("CDescription"));
	    	complaint.setCompalintDate(cdate);
	    	complaint.setSeverity(rs.getString("Severity"));
	    	complaint.setStatus(Status.valueOf(rs.getString("Status")));
		}
		return complaint;
	}

	@Override
	public String addComplaint(Complaint complaint) throws ClassNotFoundException, SQLException {
		connection=ConnectionHelper.getConnection();
		String id=generateOrderId();
		String cmd="Insert into Complaint(ComplaintId, ComplaintType,CDescription,Severity) values(?,?,?,?)";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, id);
		pst.setString(2, complaint.getComplaintType());
		pst.setString(3, complaint.getcDescription());
		pst.setString(4, complaint.getSeverity());
		pst.executeUpdate();
		
		return "Complaint Registered with Complaint Id" +complaint.getComplaintId();
	}

	@Override
	public String deleteComplaint(String ComplaintId) throws ClassNotFoundException, SQLException, ParseException {
		Complaint complaint=searchComplaint(ComplaintId);
		if(complaint!=null) {
			connection=ConnectionHelper.getConnection();
			String cmd="delete from complaint where complaintId=?";
			pst=connection.prepareStatement(cmd);
			pst.setString(1, ComplaintId);
			pst.executeUpdate();
			return "Complaint resolved ";
		}
		return "No Compliant found";
	}

}
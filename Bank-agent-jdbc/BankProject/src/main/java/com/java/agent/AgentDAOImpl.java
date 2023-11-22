package com.java.agent;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class AgentDAOImpl implements AgentDAO {
	
	Connection connection;
	PreparedStatement pst;
	
//	public int generateAgentID() throws ClassNotFoundException, SQLException {
//		connection = AgentConnectionHelper.getConnection();
//		String cmd = "select case when max(AgentID) IS NULL THEN 1 else max(AgentID)+1 end Demo from Agent";
//		pst = connection.prepareStatement(cmd);
//		ResultSet rs = pst.executeQuery();
//		rs.next();
//		int Demo = rs.getInt("Demo");
//		return Demo;
//	}

	@Override
	public List<Agent> showAgentDao() throws ClassNotFoundException, SQLException {
		connection = AgentConnectionHelper.getConnection();
		String cmd = "Select *  Agent ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs= pst.executeQuery();
		
		List<Agent> agentList = new ArrayList<Agent>();
		Agent agent = null;
		if(rs.next()) {
			agent = new Agent();
			agent.setAgentID(rs.getInt("AgentID"));
			agent.setName(rs.getString("Name"));
			agent.setCity(rs.getString("City"));
			agent.setGender(Gender.valueOf(rs.getString("gender")));
			agent.setMaritalStatus(rs.getInt("MaritalStatus"));
			agent.setPremium(rs.getInt("Primium"));
			agentList.add(agent);
			
		}

		return agentList;
	}

	@Override
	public String addAgentDao(Agent agent) throws ClassNotFoundException, SQLException {
	connection = AgentConnectionHelper.getConnection();
		String cmd = "Insert into Agent(Name, City, Gender, MaritalStatus, Premium) values(?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
//	pst.setInt(1, agent.getAgentID());
		pst.setString(1, agent.getName());
		pst.setString(2, agent.getCity());
		pst.setString(3, agent.getGender().toString());
		pst.setInt(4,agent.getMaritalStatus());
		pst.setDouble(5, agent.getPremium());
		pst.executeUpdate();
		System.out.println("***Record Insert****");

		
		return "Agent record/inserted";
	}

	@Override
	public String updateAgentDao(Agent newagent) throws ClassNotFoundException, SQLException {
		Agent agentFound = searchAgentDao(newagent.getAgentID());
		if (agentFound!=null) {
			connection = AgentConnectionHelper.getConnection();
			String cmd = "Update Agent set Name=?, Gender=?, Cityt=?, GENDER=?, MaritalStatus=?, Premium=? Where "
					+ " AgentId=?";
//			pst.setInt(1, agentFound.getAgentID());
			pst.setString(2, agentFound.getName());
			pst.setString(3, agentFound.getCity());
			pst.setString(3, agentFound.getGender().toString());
			pst.setInt(5,agentFound.getMaritalStatus());
			pst.setInt(6, agentFound.getPremium());
			pst.executeUpdate();
			return "Agent Record Updated...";
		}
		return "Agent Record Not Found...";	
	}

	@Override
	public Agent searchAgentDao(int AgentID) throws SQLException, ClassNotFoundException {
		
		connection = AgentConnectionHelper.getConnection();
		String cmd = "select * from Agent where AgentID=?";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Agent agent = null;
		if(rs.next()) {
			agent = new Agent();
//			pst.setInt(1, agent.getAgentID());
			pst.setString(2, agent.getName());
			pst.setString(3, agent.getCity());
			pst.setString(3, agent.getGender().toString());
			pst.setInt(5,agent.getMaritalStatus());
			pst.setInt(6, agent.getPremium());
			pst.executeUpdate();
		}
		// TODO Auto-generated method stub
		return agent;

	}

	@Override
	public String deleteAgentDao(int AgentID) throws ClassNotFoundException, SQLException {
		Agent agent = searchAgentDao(AgentID);
		if(agent!=null) {
			connection = AgentConnectionHelper.getConnection();
			String cmd = "Delete from Agent where AgentID=?";
			pst = connection.prepareStatement(cmd);
			pst.executeUpdate();
			return "Agent Record Deleted....";

			}
		return "record not found";
	}

	
}

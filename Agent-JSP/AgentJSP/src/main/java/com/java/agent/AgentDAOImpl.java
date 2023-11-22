package com.java.agent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

public class AgentDAOImpl implements AgentDAO{
	
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Agent> showAgentDao()  throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Agent";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Agent> agentList = new ArrayList<Agent>();
		Agent agent = null;
		while(rs.next()) {
			agent = new Agent();
			agent.setAgentId(rs.getInt("agentid"));
			agent.setName(rs.getString("name"));
			agent.setGender(Gender.valueOf(rs.getString("gender")));
			agent.setCity(rs.getString("city"));
			agent.setMaritalStatus(rs.getString("maritalStatus"));
			agent.setPremium(rs.getDouble("premium"));
			agentList.add(agent);
		}
		return agentList;
	}

	@Override
	public Agent searchAgentDao(int agentId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Agent where agentid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,agentId);
		ResultSet rs = pst.executeQuery();
		Agent agent = null;
		if (rs.next()) {
			agent = new Agent();
			agent.setAgentId(rs.getInt("agentid"));
			agent.setName(rs.getString("name"));
			agent.setGender(Gender.valueOf(rs.getString("gender")));
			agent.setCity(rs.getString("city"));
			agent.setMaritalStatus(rs.getString("maritalStatus"));
			agent.setPremium(rs.getDouble("premium"));
			
		}
		return agent;
	}

	@Override
	public String addAgentDao(Agent agent) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
        String cmd = "Insert into Agent(agentId,name,city,gender,maritalStatus,premium) "
         		+ " values(?,?,?,?,?,?)";
         PreparedStatement pst = connection.prepareStatement(cmd);
         pst.setInt(1, agent.getAgentId());
         pst.setString(2, agent.getName());
         pst.setString(3, agent.getCity());
         pst.setString(4, agent.getGender().toString());
         pst.setString(5, agent.getMaritalStatus());
         pst.setDouble(6, agent.getPremium());
         pst.executeUpdate();
         return "Agent Record Inserted...";
		
	}

	@Override
	public String deleteAgentDao(int agentId) throws ClassNotFoundException, SQLException {
		Agent agent = searchAgentDao(agentId);
		if (agent!=null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "Delete from Agent where agentId=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, agentId);
			pst.executeUpdate();
			return "Agent Record Deleted...";
		}
		return "Agent Id Not Found...";
	}

	@Override
	public String updateAgentDao(Agent agentNew)  throws ClassNotFoundException, SQLException {
		Agent agentFound = searchAgentDao(agentNew.getAgentId());
		if (agentFound!=null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "Update Agent set agentId=?, Name=?, City=?, Gender=?, maritalStatus=?, Premium=? Where "
					+ " agentId=?";
			 pst = connection.prepareStatement(cmd);
		     pst.setInt(1, agentNew.getAgentId());
	         pst.setString(2, agentNew.getName());
	         pst.setString(3, agentNew.getCity());
	         pst.setString(4, agentNew.getGender().toString());
	         pst.setString(5, agentNew.getMaritalStatus());
	         pst.setDouble(6, agentNew.getPremium());
			pst.executeUpdate();
			return "Agent Record is Updated...";
		}
		return "Agent Record Not Found...";
	}

		
	
}
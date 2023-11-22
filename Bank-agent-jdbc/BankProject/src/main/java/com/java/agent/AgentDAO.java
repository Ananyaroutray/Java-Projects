package com.java.agent;

import java.sql.SQLException;

import java.util.List;



public interface AgentDAO {
	
	List<Agent> showAgentDao() throws ClassNotFoundException, SQLException;
	String addAgentDao(Agent agent) throws ClassNotFoundException, SQLException;
	Agent searchAgentDao(int AgentID) throws SQLException, ClassNotFoundException;
	String deleteAgentDao(int AgentID) throws ClassNotFoundException, SQLException;
	String updateAgentDao(Agent newagent) throws ClassNotFoundException, SQLException;
}

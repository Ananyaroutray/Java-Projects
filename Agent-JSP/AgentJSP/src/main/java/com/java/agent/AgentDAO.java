package com.java.agent;

import java.sql.SQLException;
import java.util.List;

public interface AgentDAO {
	List<Agent> showAgentDao() throws SQLException, ClassNotFoundException;
	Agent searchAgentDao(int agentId) throws ClassNotFoundException, SQLException;
	String addAgentDao(Agent agent) throws ClassNotFoundException, SQLException;
	String deleteAgentDao(int agentId) throws ClassNotFoundException, SQLException;
	String updateAgentDao(Agent agentNew) throws ClassNotFoundException, SQLException;
}

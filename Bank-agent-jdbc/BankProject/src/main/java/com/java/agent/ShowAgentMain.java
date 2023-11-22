package com.java.agent;

import java.sql.SQLException;
import java.util.List;

public class ShowAgentMain {
	
	public static void main(String[] args) {
		AgentDAO dao = new AgentDAOImpl();
		
		try {
			List<Agent> agentList = dao.showAgentDao();
			for(Agent agent : agentList) {
				System.out.println(agent);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAgentMain {
	
	public static void main(String[] args) {
		int AgentID;
		Scanner sc = new Scanner(System.in);
		AgentID =  sc.nextInt();
		AgentDAO dao = new AgentDAOImpl();
		
		try {
			Agent agent = dao.searchAgentDao(AgentID);
			if(agent!=null) {
				System.out.println(agent);
			}else {
				System.out.println("***Record Not Found***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

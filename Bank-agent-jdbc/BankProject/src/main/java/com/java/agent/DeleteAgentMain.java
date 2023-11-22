package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteAgentMain {
	
	public static void main(String[] args) {
		int AgentID;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter AgentId ");
		AgentID = sc.nextInt();
		AgentDAO dao = new AgentDAOImpl();
		try {
			System.out.println(dao.deleteAgentDao(AgentID));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class UpdateAgentMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agent agent = new Agent();
		System.out.println("enter AgentID: ");
		agent.setAgentID(sc.nextInt());
		System.out.println("Enter agent Name: ");
		agent.setName(sc.next());
		System.out.println("Enter agent City: ");
		agent.setCity(sc.next());
		System.out.println(" Enter gender(MALE/FEMALE)");
		agent.setGender(Gender.valueOf(sc.next()));
		System.out.println("enter MaritalStatus: ");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println("Enter Premium: ");
		agent.setPremium(sc.nextInt());
		AgentDAO dao = new AgentDAOImpl();
		
		try {
			System.out.println(dao.updateAgentDao(agent));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.java.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter first name:");
		 bank.setFirstname(sc.next());
		 
		 System.out.println("Enter last name:");
		 bank.setLastname(sc.next());
		 
		 System.out.println("Enter city:");
		 bank.setCity(sc.next());
		 
		 System.out.println("Enter state:");
		 bank.setState(sc.next());
		 
		 System.out.println("Enter amount:");
		 bank.setAmount(sc.nextInt());
		 
		 System.out.println("Enter CheqFacil (yes/no)");
		 bank.setCheqFacil(sc.next());
		 
		 System.out.println("Enter account type:");
		 bank.setAccountType(sc.next());
		 
		 BankDAO dao = new BankDAOImpl();
		 try {
			System.out.println(dao.createAccountDao(bank));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}

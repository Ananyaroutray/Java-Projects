package com.java.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class DepositAccountMain {
	
	public static void main(String[] args) {
		int accountNo, depositAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account no ");
		accountNo = sc.nextInt();
		System.out.println("Enter Deposit amount  ");
		depositAmount=sc.nextInt();
		BankDAO dao = new BankDAOImpl();
		try {
			System.out.println(dao.depositAccountDao(accountNo,depositAmount));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.java.realtime;

import java.util.Scanner;

public class EmployInsertMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter employ number:");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name:");
		employ.setName(sc.next());
		System.out.println("Enter Gender:");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department:");
		employ.setDept(sc.next());
		System.out.println("Enter Degignation:");
		employ.setDesig(sc.next());
		System.out.println("Enter basic:");
		employ.setBasic(sc.nextDouble());
		
		EmployDAO dao = new EmployDAOImpl();
		
			try {
				System.out.println(dao.addEmployDao(employ));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}

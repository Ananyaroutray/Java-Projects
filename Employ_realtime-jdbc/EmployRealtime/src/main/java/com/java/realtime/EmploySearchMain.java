package com.java.realtime;

import java.util.Scanner;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employ number:");
		empno = sc.nextInt();
		EmployDAO dao = new EmployDAOImpl();
		try {
			Employ employ = dao.searchEmployDao(empno);
			if(employ != null) {
				System.out.println(employ);
			}else {
				System.out.println("***Record Not Found***");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

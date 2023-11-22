package infinite.Employrealtime;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsertMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter employ number: ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter employ name: ");
		employ.setName(sc.next());
		System.out.println("Enter gender(MALE/FEMALE)");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter department: ");
		employ.setDept(sc.next());
		System.out.println("Enter designation: ");
		employ.setDesig(sc.next());
		System.out.println("Enter basic: ");
		employ.setBasic(sc.nextDouble());
		EmployDAO dao = new EmployDAOImpl();
		try {
			System.out.println(dao.addEmployDao(employ));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

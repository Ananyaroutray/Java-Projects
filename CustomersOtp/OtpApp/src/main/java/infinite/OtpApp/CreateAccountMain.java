package infinite.OtpApp;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username");
		String username = sc.next();
		OtpAppDAO dao = new OtpAppDaoImpl();
		try {
			System.out.println(dao.searchCustomerDao(username));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

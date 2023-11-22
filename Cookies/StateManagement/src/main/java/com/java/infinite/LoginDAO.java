package com.java.infinite;

import java.sql.SQLException;

public interface LoginDAO {
	String createUser(Login login) throws ClassNotFoundException, SQLException;

}

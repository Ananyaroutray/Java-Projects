package com.java.bankservlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BankDAOImpl implements BankDAO{
	Connection connection;
	PreparedStatement pst;
	
	public int generateAccountNo() throws ClassNotFoundException,SQLException{
		connection=BankConnectionHelper.getConnection();
		String cmd = "select case when max(accountNo) IS NULL THEN 1\r\n"
				+ "else max(accountNo)+1 end accno from bank";
		pst=connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno =rs.getInt("accno");
		return accno;
		
	}

	@Override
	public String createAccountDao(Bank bank) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int id = generateAccountNo();
		bank.setAccountNo(id);
		connection = BankConnectionHelper.getConnection();
		String cmd = "Insert into bank(accountno, firstName, lastName, city, state, amount, cheqFacil, accountType) "
				+ "values(?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, bank.getAccountNo());
		pst.setString(2, bank.getFirstName());
		pst.setString(3, bank.getLastName());
		pst.setString(4, bank.getCity());
		pst.setString(5, bank.getState());
		pst.setDouble(6, bank.getAmount());
		pst.setString(7, bank.getCheqFacil());
		pst.setString(8, bank.getAccountType());
		pst.executeUpdate();
		return "Account created with account no"+id;
	}

	@Override
	public Bank searchAccountDao(int accountNo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		connection = BankConnectionHelper.getConnection();
		String cmd = "select * from Bank where accountNo=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		Bank bank = null;
		if (rs.next()) {
			bank = new Bank();
			bank.setAccountNo(rs.getInt("accountNo"));
			bank.setFirstName(rs.getString("firstName"));
			bank.setLastName(rs.getString("lastName"));
			bank.setCity(rs.getString("city"));
			bank.setState(rs.getString("state"));
			bank.setAmount(rs.getInt("amount"));
			bank.setCheqFacil(rs.getString("cheqFacil"));
			bank.setAccountType(rs.getString("accountType"));
			bank.setDateOfOpen(rs.getDate("dateOfOpen"));
			bank.setStatus(rs.getString("status"));
		}
		return bank;
	}

	@Override
	public String closeAccountDao(int accountNo)  throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		Bank bank=searchAccountDao(accountNo);
		if(bank!=null) {
			connection=BankConnectionHelper.getConnection();
			String cmd="update bank set status='inactive' where accountNo=?";
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			return "Account closed...";
			
		}
		return "Account No not Found..";
		}

	@Override
	public String depositAccountDao(int accountNo, int depositAmount) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Bank bank=searchAccountDao(accountNo);
		if(bank!=null) {
			connection=BankConnectionHelper.getConnection();
			String cmd="update bank set Amount = Amount + ? where accountNo=?";
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, depositAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			
			cmd= "Insert into Trans(AccountNo,TransAmount,TransType) Values(?,?,?)";
			
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.setInt(2, depositAmount);
			pst.setString(3,"C");
			pst.executeUpdate();
			return "Amount Credited......";
	}
		return "Account No Not Found.....";
	}

	@Override
	public String withdrawAccountDao(int accountNo, int withdrawAmount) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Bank bank = searchAccountDao(accountNo);
		if(bank!=null) {
			int amount=bank.getAmount();
			
			if(amount-withdrawAmount>=1000){
	        connection=BankConnectionHelper.getConnection();
			String cmd="update bank set Amount = Amount - ? where accountNo=?";
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, withdrawAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			
			cmd= "Insert into Trans(AccountNo,TransAmount,TransType) Values(?,?,?)";
			
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.setInt(2, withdrawAmount);
			pst.setString(3,"D");
			pst.executeUpdate();
			return "Amount debited......";
		
		
	}
			

}
		return "Account No Not Found...";
	}
}

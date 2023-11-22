package com.java.ejb;

public class CustomerAuthorization {

	private int authId;
	private String userName;
	private String passWord;
	private int custId;
	private String otp;
	private String status;
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public CustomerAuthorization(int authId, String userName, String passWord, int custId, String otp, String status) {
		super();
		this.authId = authId;
		this.userName = userName;
		this.passWord = passWord;
		this.custId = custId;
		this.otp = otp;
		this.status = status;
	}
	public CustomerAuthorization() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerAuthorization [authId=" + authId + ", userName=" + userName + ", passWord=" + passWord
				+ ", custId=" + custId + ", otp=" + otp + ", status=" + status + "]";
	}
	
	
}
package com.java.hib;

public class Login {
	private int authId;
	private String uhId;
	private String userName;
	private String password;
	private String email;
	private String otp;
	
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getUhId() {
		return uhId;
	}
	public void setUhId(String uhId) {
		this.uhId = uhId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public Login(int authId, String uhId, String userName, String password, String email, String otp) {
		super();
		this.authId = authId;
		this.uhId = uhId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.otp = otp;
	}
	@Override
	public String toString() {
		return "Login [authId=" + authId + ", uhId=" + uhId + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + ", otp=" + otp + "]";
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}

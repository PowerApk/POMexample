package com.newtours.Model;

public class LoginModel {
	
	public static final String LOGIN_PAGE ="loginNewtours";
	public static final String FIELD_USER = "userName";
	public static final String FIELD_PASSWORD = "password";
	
	String userName;
	String password;
	
	public LoginModel(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public LoginModel() {
		//solo para usar los metodos
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
}

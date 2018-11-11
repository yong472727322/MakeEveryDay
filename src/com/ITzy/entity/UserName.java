package com.ITzy.entity;

public class UserName {
       
	private String userName;

	public UserName(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserName [userName=" + userName + "]";
	}
	
}

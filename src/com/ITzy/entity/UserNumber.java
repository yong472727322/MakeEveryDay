package com.ITzy.entity;

public class UserNumber {
   
	private String userNumber;

	public UserNumber(String userNumber) {
		super();
		this.userNumber = userNumber;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "UserNumber [userNumber=" + userNumber + "]";
	}
	
}

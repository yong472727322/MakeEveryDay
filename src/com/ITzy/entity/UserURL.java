package com.ITzy.entity;

public class UserURL {
    
	private String userURL;

	public UserURL(String userURL) {
		super();
		this.userURL = userURL;
	}

	public String getUserURL() {
		return userURL;
	}

	public void setUserURL(String userURL) {
		this.userURL = userURL;
	}

	@Override
	public String toString() {
		return "UserURL [userURL=" + userURL + "]";
	}
	
}

package com.ITzy.entity;

public class BigCookies {
   
	private String username;
	private String password;
	private String cookies;
	public BigCookies(String username, String password, String cookies) {
		super();
		this.username = username;
		this.password = password;
		this.cookies = cookies;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCookies() {
		return cookies;
	}
	public void setCookies(String cookies) {
		this.cookies = cookies;
	}
	@Override
	public String toString() {
		return "BigCookies [username=" + username + ", password=" + password + ", cookies=" + cookies + "]";
	}
	
}

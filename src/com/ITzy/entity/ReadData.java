package com.ITzy.entity;

public class ReadData {
	
	
	private String UserName;
	private String PassWord;
	private String Cookies;
	private String NewUserName;
	private String NewPassWord;
	public ReadData(String userName, String passWord, String cookies, String newUserName, String newPassWord) {
		super();
		UserName = userName;
		PassWord = passWord;
		Cookies = cookies;
		NewUserName = newUserName;
		NewPassWord = newPassWord;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getCookies() {
		return Cookies;
	}
	public void setCookies(String cookies) {
		Cookies = cookies;
	}
	public String getNewUserName() {
		return NewUserName;
	}
	public void setNewUserName(String newUserName) {
		NewUserName = newUserName;
	}
	public String getNewPassWord() {
		return NewPassWord;
	}
	public void setNewPassWord(String newPassWord) {
		NewPassWord = newPassWord;
	}
	@Override
	public String toString() {
		return "ReadData [UserName=" + UserName + ", PassWord=" + PassWord + ", Cookies=" + Cookies + ", NewUserName="
				+ NewUserName + ", NewPassWord=" + NewPassWord + "]";
	}
	
	
}

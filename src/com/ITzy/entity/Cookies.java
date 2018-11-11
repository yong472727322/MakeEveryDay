package com.ITzy.entity;

public class Cookies {
     
	private String Cookie;

	public Cookies(String cookie) {
		super();
		Cookie = cookie;
	}

	public String getCookie() {
		return Cookie;
	}

	public void setCookie(String cookie) {
		Cookie = cookie;
	}

	@Override
	public String toString() {
		return "Cookies [Cookie=" + Cookie + "]";
	}
	
}

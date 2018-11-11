package com.ITzy.entity;

public class FirefoxCookies {
        
	private String domain;
	private String isSecure;
	private String path;
	private String isHttpOnly;	
	private String expiry;
	private String name;
	private String value;
	public FirefoxCookies(String domain, String isSecure, String path, String isHttpOnly, String expiry, String name,
			String value) {
		super();
		this.domain = domain;
		this.isSecure = isSecure;
		this.path = path;
		this.isHttpOnly = isHttpOnly;
		this.expiry = expiry;
		this.name = name;
		this.value = value;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getIsSecure() {
		return isSecure;
	}
	public void setIsSecure(String isSecure) {
		this.isSecure = isSecure;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getIsHttpOnly() {
		return isHttpOnly;
	}
	public void setIsHttpOnly(String isHttpOnly) {
		this.isHttpOnly = isHttpOnly;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "FirefoxCookies [domain=" + domain + ", isSecure=" + isSecure + ", path=" + path + ", isHttpOnly="
				+ isHttpOnly + ", expiry=" + expiry + ", name=" + name + ", value=" + value + "]";
	}
	
	
	
	
	
}

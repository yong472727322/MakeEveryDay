package com.ITzy.entity;

public class JSONING {
    
	private String domain; 
	private Long expirationDate; 
	private boolean hostOnly; 
	private boolean httpOnly; 
	private String name; 
	private String path; 
	private boolean secure; 
	private boolean session; 
	private String storeId; 	
	private String value; 
	private String id;
	public JSONING(String domain, Long expirationDate, boolean hostOnly, boolean httpOnly, String name, String path,
			boolean secure, boolean session, String storeId, String value, String id) {
		super();
		this.domain = domain;
		this.expirationDate = expirationDate;
		this.hostOnly = hostOnly;
		this.httpOnly = httpOnly;
		this.name = name;
		this.path = path;
		this.secure = secure;
		this.session = session;
		this.storeId = storeId;
		this.value = value;
		this.id = id;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Long getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Long expirationDate) {
		this.expirationDate = expirationDate;
	}
	public boolean isHostOnly() {
		return hostOnly;
	}
	public void setHostOnly(boolean hostOnly) {
		this.hostOnly = hostOnly;
	}
	public boolean isHttpOnly() {
		return httpOnly;
	}
	public void setHttpOnly(boolean httpOnly) {
		this.httpOnly = httpOnly;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isSecure() {
		return secure;
	}
	public void setSecure(boolean secure) {
		this.secure = secure;
	}
	public boolean isSession() {
		return session;
	}
	public void setSession(boolean session) {
		this.session = session;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "JSON [domain=" + domain + ", expirationDate=" + expirationDate + ", hostOnly=" + hostOnly
				+ ", httpOnly=" + httpOnly + ", name=" + name + ", path=" + path + ", secure=" + secure + ", session="
				+ session + ", storeId=" + storeId + ", value=" + value + ", id=" + id + "]";
	}
	
	
}

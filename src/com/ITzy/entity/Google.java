package com.ITzy.entity;

public class Google {
      
	private  String domain;
	private  String expirationDate;
	private  String hostOnly;	
	private  String httpOnly;
	private  String name;
	private  String path;
	private  String secure;
	private  String session;
	private  String storeId;
	private  String value;	
	private  String id;
	public Google(String domain, String expirationDate, String hostOnly, String httpOnly, String name, String path,
			String secure, String session, String storeId, String value, String id) {
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
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getHostOnly() {
		return hostOnly;
	}
	public void setHostOnly(String hostOnly) {
		this.hostOnly = hostOnly;
	}
	public String getHttpOnly() {
		return httpOnly;
	}
	public void setHttpOnly(String httpOnly) {
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
	public String getSecure() {
		return secure;
	}
	public void setSecure(String secure) {
		this.secure = secure;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
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
		return "Google [domain=" + domain + ", expirationDate=" + expirationDate + ", hostOnly=" + hostOnly
				+ ", httpOnly=" + httpOnly + ", name=" + name + ", path=" + path + ", secure=" + secure + ", session="
				+ session + ", storeId=" + storeId + ", value=" + value + ", id=" + id + "]";
	}
}

package com.ITzy.entity;

public class IP {
         
	private String IP;
	private String  PortNumber;
	
	
	public IP(String iP, String portNumber) {
		super();
		IP = iP;
		PortNumber = portNumber;
	}
	
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getPortNumber() {
		return PortNumber;
	}
	public void setPortNumber(String portNumber) {
		PortNumber = portNumber;
	}

	@Override
	public String toString() {
		return "IP [IP=" + IP + ", PortNumber=" + PortNumber + "]";
	}	
}

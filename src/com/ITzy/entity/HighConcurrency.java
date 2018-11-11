package com.ITzy.entity;

public class HighConcurrency {
       
	private String URL;
	private String Brands1;
	private String Brands2;
	private String Brands3;
	private String Brands4;
	private String Brands5;
	private String Brands6;
	
	public HighConcurrency(String uRL, String brands1, String brands2, String brands3, String brands4, String brands5,String brands6) {
		super();
		URL = uRL;
		Brands1 = brands1;
		Brands2 = brands2;
		Brands3 = brands3;
		Brands4 = brands4;
		Brands5 = brands5;
		Brands6 = brands6;
	}
	public HighConcurrency(String uRL, String brands1, String brands2, String brands3, String brands4, String brands5) {
		super();
		URL = uRL;
		Brands1 = brands1;
		Brands2 = brands2;
		Brands3 = brands3;
		Brands4 = brands4;
		Brands5 = brands5;
	
	}
	public HighConcurrency(String uRL, String brands1, String brands2, String brands3, String brands4) {
		super();
		URL = uRL;
		Brands1 = brands1;
		Brands2 = brands2;
		Brands3 = brands3;
		Brands4 = brands4;
	}
	public HighConcurrency(String uRL, String brands1, String brands2, String brands3) {
		super();
		URL = uRL;
		Brands1 = brands1;
		Brands2 = brands2;
		Brands3 = brands3;
	}
	public HighConcurrency(String uRL, String brands1, String brands2) {
		super();
		URL = uRL;
		Brands1 = brands1;
		Brands2 = brands2;
	}
	public HighConcurrency(String uRL, String brands1) {
		super();
		URL = uRL;
		Brands1 = brands1;
	}
	

	
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getBrands1() {
		return Brands1;
	}
	public void setBrands1(String brands1) {
		Brands1 = brands1;
	}
	public String getBrands2() {
		return Brands2;
	}
	public void setBrands2(String brands2) {
		Brands2 = brands2;
	}
	public String getBrands3() {
		return Brands3;
	}
	public void setBrands3(String brands3) {
		Brands3 = brands3;
	}
	public String getBrands4() {
		return Brands4;
	}
	public void setBrands4(String brands4) {
		Brands4 = brands4;
	}
	public String getBrands5() {
		return Brands5;
	}
	public void setBrands5(String brands5) {
		Brands5 = brands5;
	}
	public String getBrands6() {
		return Brands6;
	}
	public void setBrands6(String brands6) {
		Brands6 = brands6;
	}
	
	
	
	
}

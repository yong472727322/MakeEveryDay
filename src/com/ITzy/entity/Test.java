package com.ITzy.entity;

import java.util.List;

public class Test {
     
	private List<JSONING> json;

	public Test(List<JSONING> json) {
		super();
		this.json = json;
	}

	public List<JSONING> getJson() {
		return json;
	}

	public void setJson(List<JSONING> json) {
		this.json = json;
	}

	@Override
	public String toString() {
		return "Test [json=" + json + "]";
	}
	
}

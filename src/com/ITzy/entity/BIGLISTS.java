package com.ITzy.entity;

import java.util.List;

public class BIGLISTS {
    
	private List<JSONING> BIGLIS;

	public BIGLISTS(List<JSONING> bIGLIS) {
		super();
		BIGLIS = bIGLIS;
	}

	public List<JSONING> getBIGLIS() {
		return BIGLIS;
	}

	public void setBIGLIS(List<JSONING> bIGLIS) {
		BIGLIS = bIGLIS;
	}

	@Override
	public String toString() {
		return "BIGLISTS [BIGLIS=" + BIGLIS + "]";
	}
	
}

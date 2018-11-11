package com.ITzy.entity;

import java.util.List;

public class GoogleCookies {
   
	private List<NameAndValue> FUCKS;

	public GoogleCookies(List<NameAndValue> fUCKS) {
		super();
		FUCKS = fUCKS;
	}

	public List<NameAndValue> getFUCKS() {
		return FUCKS;
	}

	public void setFUCKS(List<NameAndValue> fUCKS) {
		FUCKS = fUCKS;
	}

	@Override
	public String toString() {
		return "GoogleCookies [FUCKS=" + FUCKS + "]";
	}
	
}

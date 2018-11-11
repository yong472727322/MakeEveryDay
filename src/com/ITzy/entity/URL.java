package com.ITzy.entity;

public class URL {
     
	private String  URLS;
  
	public URL(String uRLS) {
		super();
		URLS = uRLS;
	}

	public String getURLS() {
		return URLS;
	}

	public void setURLS(String uRLS) {
		URLS = uRLS;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((URLS == null) ? 0 : URLS.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		URL other = (URL) obj;
		if (URLS == null) {
			if (other.URLS != null)
				return false;
		} else if (!URLS.equals(other.URLS))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "URL [URLS=" + URLS + "]";
	}
	
}

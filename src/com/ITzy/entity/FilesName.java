package com.ITzy.entity;

public class FilesName {
         
	 private String Files;

	public FilesName(String files) {
		super();
		Files = files;
	}

	public String getFiles() {
		return Files;
	}

	public void setFiles(String files) {
		Files = files;
	}

	@Override
	public String toString() {
		return "FilesName [Files=" + Files + "]";
	}
	 
	 
}

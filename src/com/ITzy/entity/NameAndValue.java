package com.ITzy.entity;

public class NameAndValue {
    
	private String Name;
	private String Value;
	public NameAndValue(String name, String value) {
		super();
		Name = name;
		Value = value;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	@Override
	public String toString() {
		return "NameAndValue [Name=" + Name + ", Value=" + Value + "]";
	}
	
}

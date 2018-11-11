package com.ITzy.entity;

public class AddCart {
   
	private String addCart;

	public AddCart(String addCart) {
		super();
		this.addCart = addCart;
	}

	public String getAddCart() {
		return addCart;
	}

	public void setAddCart(String addCart) {
		this.addCart = addCart;
	}

	@Override
	public String toString() {
		return "AddCart [addCart=" + addCart + "]";
	}
	
}

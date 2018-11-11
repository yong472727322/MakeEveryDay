package com.ITzy.entity;

public class WishCart {
     
	private String wishCart;

	public WishCart(String wishCart) {
		super();
		this.wishCart = wishCart;
	}

	public String getWishCart() {
		return wishCart;
	}

	public void setWishCart(String wishCart) {
		this.wishCart = wishCart;
	}

	@Override
	public String toString() {
		return "WishCart [wishCart=" + wishCart + "]";
	}
	
}

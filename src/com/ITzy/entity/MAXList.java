package com.ITzy.entity;

import java.util.List;

public class MAXList {
     
	private List<UserName> UserName;
	private List<UserURL> UserURL;
	private List<UserNumber> UserNumber;
	private List<AddCart> AddCart;
	private List<WishCart> WishCart;
	public MAXList(List<com.ITzy.entity.UserName> userName, List<com.ITzy.entity.UserURL> userURL,
			List<com.ITzy.entity.UserNumber> userNumber, List<com.ITzy.entity.AddCart> addCart,
			List<com.ITzy.entity.WishCart> wishCart) {
		super();
		UserName = userName;
		UserURL = userURL;
		UserNumber = userNumber;
		AddCart = addCart;
		WishCart = wishCart;
	}
	public List<UserName> getUserName() {
		return UserName;
	}
	public void setUserName(List<UserName> userName) {
		UserName = userName;
	}
	public List<UserURL> getUserURL() {
		return UserURL;
	}
	public void setUserURL(List<UserURL> userURL) {
		UserURL = userURL;
	}
	public List<UserNumber> getUserNumber() {
		return UserNumber;
	}
	public void setUserNumber(List<UserNumber> userNumber) {
		UserNumber = userNumber;
	}
	public List<AddCart> getAddCart() {
		return AddCart;
	}
	public void setAddCart(List<AddCart> addCart) {
		AddCart = addCart;
	}
	public List<WishCart> getWishCart() {
		return WishCart;
	}
	public void setWishCart(List<WishCart> wishCart) {
		WishCart = wishCart;
	}
	@Override
	public String toString() {
		return "MAXList [UserName=" + UserName + ", UserURL=" + UserURL + ", UserNumber=" + UserNumber + ", AddCart="
				+ AddCart + ", WishCart=" + WishCart + "]";
	}
	
	
}

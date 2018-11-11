package com.ITzy.entity;

public class CollectData {
	
	
	private String UserName;
	private String UserURL;
	private String UserNumber;
	private String UserAddCart;
	private String UserWishCart;
	public CollectData(String userName, String userURL, String userNumber, String userAddCart, String userWishCart) {
		super();
		UserName = userName;
		UserURL = userURL;
		UserNumber = userNumber;
		UserAddCart = userAddCart;
		UserWishCart = userWishCart;
	}
	
	public CollectData(String userURL, String userNumber, String userAddCart, String userWishCart) {
		super();
		UserURL = userURL;
		UserNumber = userNumber;
		UserAddCart = userAddCart;
		UserWishCart = userWishCart;
	}

	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserURL() {
		return UserURL;
	}
	public void setUserURL(String userURL) {
		UserURL = userURL;
	}
	public String getUserNumber() {
		return UserNumber;
	}
	public void setUserNumber(String userNumber) {
		UserNumber = userNumber;
	}
	public String getUserAddCart() {
		return UserAddCart;
	}
	public void setUserAddCart(String userAddCart) {
		UserAddCart = userAddCart;
	}
	public String getUserWishCart() {
		return UserWishCart;
	}
	public void setUserWishCart(String userWishCart) {
		UserWishCart = userWishCart;
	}
	@Override
	public String toString() {
		return "CollectData [UserName=" + UserName + ", UserURL=" + UserURL + ", UserNumber=" + UserNumber
				+ ", UserAddCart=" + UserAddCart + ", UserWishCart=" + UserWishCart + "]";
	}
	
	
	
						
}

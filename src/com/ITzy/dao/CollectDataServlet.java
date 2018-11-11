package com.ITzy.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.ITzy.entity.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CollectDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static List<UserName> UserName = new ArrayList<UserName>();
    public static List<UserURL> UserURL = new ArrayList<UserURL>();
    public static List<UserNumber> UserNumber = new ArrayList<UserNumber>();
    public static List<AddCart> AddCart = new ArrayList<AddCart>();
    public static List<WishCart> WishCart = new ArrayList<WishCart>();
    public static List<MAXList> MAX = new ArrayList<MAXList>();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");	
		
		
		String  userName = request.getParameter("UserName");
		String  userURL = request.getParameter("UserURL");
		String  userNumber = request.getParameter("UserNumber");
		String  addCart = request.getParameter("AddCart");
		String  wishCart = request.getParameter("WishCart");
		
		System.out.println(userName);
		System.out.println(userURL);
		System.out.println(userNumber);
		System.out.println(addCart);
		System.out.println(wishCart);
		
		
		UserName.add(new UserName(userName));
		UserURL.add(new UserURL(userURL));
		UserNumber.add(new UserNumber(userNumber));
		AddCart.add(new AddCart(addCart));
		WishCart.add(new WishCart(wishCart));
		MAX.add(new MAXList(UserName, UserURL, UserNumber, AddCart, WishCart));
		
		request.setAttribute("UserName", UserName);
		request.setAttribute("UserURL", UserURL);
		request.setAttribute("UserNumber", UserNumber);
		request.setAttribute("AddCart", AddCart);
		request.setAttribute("WishCart", WishCart);
		request.setAttribute("MAX", MAX);
		
	
		
		request.getRequestDispatcher("View.jsp").forward(request, response);
		
		
		
	}

}

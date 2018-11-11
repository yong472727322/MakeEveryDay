package com.ITzy.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ITzy.entity.HighConcurrency;


public class HighConcurrencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<HighConcurrency> URLLIST = new ArrayList<HighConcurrency>();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String URL = request.getParameter("UserURL");
		String Brands1 = request.getParameter("UserName1");
		String Brands2 = request.getParameter("UserName2");
		String Brands3 = request.getParameter("UserName3");
		String Brands4 = request.getParameter("UserName4");
		String Brands5 = request.getParameter("UserName5");
		String Brands6 = request.getParameter("UserName6");
					
		URLLIST.add(new HighConcurrency(URL, Brands1, Brands2, Brands3, Brands4, Brands5, Brands6));
		
		request.setAttribute("URLLIST", URLLIST);
		
		request.getRequestDispatcher("HighConcurrencyAndEcho.jsp").forward(request,response);
	}

}

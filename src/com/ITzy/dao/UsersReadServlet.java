package com.ITzy.dao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ITzy.entity.CollectData;
import com.ITzy.entity.FilesName;
import com.ITzy.entity.IP;
import com.ITzy.entity.ReadData;
import com.ITzy.utils.FirefoxReading;
import com.ITzy.utils.ReadIP;
import com.ITzy.utils.ReadVPNText;
import com.ITzy.utils.ReadXLSX;

public class UsersReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<CollectData> BigData = new ArrayList<CollectData>();
	public static String UserName = null;
	public static String UserURL = null;
	public static String UserNumber = null;
	public static String AddCart = null;
	public static String WishCart = null;
    public static String GUOJIA = null;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		request.setCharacterEncoding("UTF-8");

		String URL = request.getParameter("URL");
		String IP = request.getParameter("IP");	
		String VPN = request.getParameter("VPN");
		
		String UserName = request.getParameter("UserName");
		String UserURL = request.getParameter("UserURL");
		String UserNumber = request.getParameter("UserNumber");
		String AddCart = request.getParameter("AddCart");
		String WishCart = request.getParameter("WishCart");
		String country = request.getParameter("country");
		
		
		 if("T-US".equals(country)) {
			 GUOJIA = "https://www.amazon.com";
		}if("T-JP".equals(country)) {
			 GUOJIA = "https://www.amazon.co.jp";
		}if("D-UK".equals(country)) {
			 GUOJIA = "https://www.amazon.co.uk";
		}if("D-DE".equals(country)) {
			 GUOJIA = "https://www.amazon.de";
		}if("T-CA".equals(country)) {
			 GUOJIA = "https://www.amazon.ca";
		}if("D-FR".equals(country)) {
			 GUOJIA = "https://www.amazon.fr";
		}if("D-ES".equals(country)) {
			 GUOJIA = "https://www.amazon.es";
		}if("D-IT".equals(country)) {
			 GUOJIA = "https://www.amazon.it";
		}
	
		
		
		List<FilesName> FilesName = FirefoxReading.Reading(URL);
		
		String[] Username = UserName.split("@@@@@");
		String[] Userurl = UserURL.split("@@@@@");
		String[] Usernumber = UserNumber.split("@@@@@");
		String[] Addcart = AddCart.split("@@@@@");
		String[] Wishcart = WishCart.split("@@@@@");
		
		
		for(int x=1;x<Username.length;x++) {
			
			BigData.add(new CollectData(Username[x], Userurl[x], Usernumber[x], Addcart[x], Wishcart[x]));
		}
		
		for (CollectData CB : BigData) {
			
			System.out.println(CB.getUserName()+"-----"+CB.getUserURL()+"-----"+CB.getUserNumber()+"-----"+CB.getUserAddCart()+"-----"+CB.getUserWishCart());
		}
		
		
		//调用工具类  解析 VPN 账号 密码 
		String  VPNS = ReadVPNText.ReadIngVPNText(VPN);		
		request.setAttribute("VPNS", VPNS);
		request.setAttribute("URL", URL);
		request.setAttribute("FilesName", FilesName);
		request.setAttribute("BigData", BigData);	
		request.setAttribute("GUOJIA", GUOJIA);	
		request.getRequestDispatcher("SlingAmazon").forward(request, response);		
	}
}












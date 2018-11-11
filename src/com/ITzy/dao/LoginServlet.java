package com.ITzy.dao;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		request.setCharacterEncoding("UTF-8");	
		String username = request.getParameter("Username");
		String pass = request.getParameter("Password");
		
		if("bhct".equals(username)&&"8888".equals(pass)){
			 
			System.out.println("登录成功......");
			System.out.println("即将进入数据采集界面.......");
			
			response.sendRedirect("Gather.jsp");
	      
					
		}else {		
			System.out.println("登录失败......");
			System.out.println("即将再次进入登录界面.......");
			response.sendRedirect("index.html");	
		}
		
	}

}

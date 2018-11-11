package com.ITzy.dao;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ITzy.entity.AllCookie;
import com.ITzy.entity.BIG;
import com.ITzy.entity.FilesName;
import com.ITzy.entity.HighConcurrency;
import com.ITzy.entity.NameAndValue;
import com.ITzy.utils.FirefoxReading;
import com.ITzy.utils.GoogleReading;
import com.ITzy.utils.ReadURL;
import com.ITzy.utils.ReadVPNText;
import com.ITzy.utils.ReadingAllCookiesGoogle;

public class AutomaticDataCollectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String GUOJIA = null;
	public static List<Integer> TheLengthOfTheData = null;
	public static List<BIG> Multithreading = null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");	          
		//参数获取
	  String Browser = request.getParameter("Browser");
	  String browsers = request.getParameter("browsers");
	  String Country = request.getParameter("country");
	  String Data = request.getParameter("Data");
	  String URL = request.getParameter("URL");
	  String VPN = request.getParameter("VPN");
	  String succeed = request.getParameter("succeed");
	  String fail = request.getParameter("fail");
	  String gogle = request.getParameter("gogle");
	  //判断是否加入心愿单和购物车的多选按钮的参数获取
	  String AddCart = request.getParameter("AddCart");
	  String WishCart = request.getParameter("WishCart");
	
	 /* System.out.println(AddCart);
	  System.out.println(WishCart);*/
	  
	//判断网站数据  
		 if("T-US".equals(Country)) {
			 GUOJIA = "https://www.amazon.com";
		}if("T-JP".equals(Country)) {
			 GUOJIA = "https://www.amazon.co.jp";
		}if("D-UK".equals(Country)) {
			 GUOJIA = "https://www.amazon.co.uk";
		}if("D-DE".equals(Country)) {
			 GUOJIA = "https://www.amazon.de";
		}if("T-CA".equals(Country)) {
			 GUOJIA = "https://www.amazon.ca";
		}if("D-FR".equals(Country)) {
			 GUOJIA = "https://www.amazon.fr";
		}if("D-ES".equals(Country)) {
			 GUOJIA = "https://www.amazon.es";
		}if("D-IT".equals(Country)) {
			 GUOJIA = "https://www.amazon.it";
		}
		    try {   
			    //读取cookies
		 		List<List<AllCookie>> CookieS = ReadingAllCookiesGoogle.ReadingAllCookie(URL);
		 		//调用工具类  解析 VPN 账号 密码   
				String  VPNS = ReadVPNText.ReadIngVPNText(VPN);	
				//拿到超链接数据
				List  DaTa = ReadURL.ReadIngVPNText(Data);
				
				   for(int x=0;x<DaTa.size();x++) {
					      if(x==0) {
						        TheLengthOfTheData = (List<Integer>) DaTa.get(0);
					      }if(x==1) {
						        Multithreading = (List<BIG>) DaTa.get(1);     
					      }
				   }				 
					if("Firefox".equals(Browser)) {
						//日志记录的数据消息（成功和失败记录）
						
						
						request.setAttribute("succeed", succeed);
						request.setAttribute("fail", fail);
						//获取Cookies的文件名
						List<FilesName> FilesName = FirefoxReading.Reading(URL);
						//文件名
						request.setAttribute("FilesName", FilesName);
						//读取cookies的前缀URL头
						request.setAttribute("URL", URL);
						//切换IP的VPN信息
						request.setAttribute("VPNS", VPNS);
						//记录要刷单的网址
						request.setAttribute("GUOJIA", GUOJIA);
						//要刷单的产品
						request.setAttribute("Multithreading", Multithreading);
						//刷单要开启的浏览器个数
						request.setAttribute("TheLengthOfTheData", TheLengthOfTheData);					
						//转发到操控刷单的servlet
						request.getRequestDispatcher("HighConcurrencyHamstringAmazonServlet").forward(request, response);	
					} 	if("Google".equals(Browser)) {
						//这是多窗口开启关闭模式
						if("YES".equals(browsers)) {
							//调用工具类读取谷歌的cookies							
							
							//读取的cookies集合到下个servlet
							request.setAttribute("CookieS", CookieS);
							//读取cookies的前缀URL头
							request.setAttribute("URL", URL);  
							//切换IP的VPN信息
							request.setAttribute("VPNS", VPNS);
							//记录要刷单的网址
							request.setAttribute("GUOJIA", GUOJIA);
							//要刷单的产品
							request.setAttribute("Multithreading", Multithreading);
							//刷单要开启的浏览器个数
							request.setAttribute("TheLengthOfTheData", TheLengthOfTheData);	
							//日志记录的数据消息（成功和失败记录）
							request.setAttribute("succeed", succeed);
							request.setAttribute("fail", fail);
							request.setAttribute("gogle", gogle);
							//选着是否加入心愿单和购物车信息
							request.setAttribute("AddCart", AddCart);
							request.setAttribute("WishCart", WishCart);
							//转发到操控刷单的servlet							
							request.getRequestDispatcher("TestServlet").forward(request, response);	
							
						}
						//这是无窗口开启关闭模式
						if("NO".equals(browsers)) {
							try {
								//调用工具类读取谷歌的cookies
								CookieS = ReadingAllCookiesGoogle.ReadingAllCookie(URL);								
								//读取的cookies集合到下个servlet
								request.setAttribute("CookieS", CookieS);
								//读取cookies的前缀URL头
								request.setAttribute("URL", URL);  
								//切换IP的VPN信息
								request.setAttribute("VPNS", VPNS);
								//记录要刷单的网址
								request.setAttribute("GUOJIA", GUOJIA);
								//要刷单的产品
								request.setAttribute("Multithreading", Multithreading);
								//刷单要开启的浏览器个数
								request.setAttribute("TheLengthOfTheData", TheLengthOfTheData);	
								//日志记录的数据消息（成功和失败记录）
								request.setAttribute("succeed", succeed);
								request.setAttribute("fail", fail);
								request.setAttribute("gogle", gogle);
								//选着是否加入心愿单和购物车信息
								request.setAttribute("AddCart", AddCart);
								request.setAttribute("WishCart", WishCart);
								//转发到操控刷单的servlet															
								request.getRequestDispatcher("FIXServlet").forward(request, response);								
							} catch (ParseException e) {					
								System.out.println("进入核心控制层报错，数据读取异常");
							}							
						}								
					}   
			} catch (IOException e) { 
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}

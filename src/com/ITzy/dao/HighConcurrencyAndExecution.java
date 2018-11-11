package com.ITzy.dao;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
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
import com.ITzy.utils.ReadVPNText;
import com.ITzy.utils.ReadingAllCookiesGoogle;

public class HighConcurrencyAndExecution extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static List<HighConcurrency> HighconcurrencyBigdata = new ArrayList<HighConcurrency>();
    public static List<BIG> multithreading = new ArrayList<BIG>(); 
    public static List<Integer>  TheLengthOfTheData = new ArrayList<Integer>();
    public static String GUOJIA = null;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");	
		String CoreData = request.getParameter("HighConcurrency");
		String URL = request.getParameter("URL");
		String VPN = request.getParameter("VPN");
		String Country = request.getParameter("country");
		String Browser = request.getParameter("Browser");
		String succeed = request.getParameter("succeed");
		String fail = request.getParameter("fail");
		String SO = request.getParameter("browsers");
		
		 
		
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
		
	
		
		//调用工具类  解析 VPN 账号 密码 
		String  VPNS = ReadVPNText.ReadIngVPNText(VPN);	
		
		
		//System.out.println(FilesName.toString());
		System.out.println(VPNS);		
		String[] LargeCollectionS = CoreData.split("###");		
		for(int x=0;x<LargeCollectionS.length;x++) {			
			String[] SmallCollectionS = LargeCollectionS[x].split("@@@");
			HighconcurrencyBigdata.add(new HighConcurrency(SmallCollectionS[0], SmallCollectionS[1], SmallCollectionS[2], SmallCollectionS[3], SmallCollectionS[4], SmallCollectionS[5], SmallCollectionS[6]));
		}
		System.out.println(HighconcurrencyBigdata.size());
		for (HighConcurrency HighconcurrencyBigdata : HighconcurrencyBigdata ) {
			
			List<String>  TransitCollection = new ArrayList<String>();
			
			String URLS = HighconcurrencyBigdata.getURL();
			TransitCollection.add(URLS);
			if(!"null".equals(HighconcurrencyBigdata.getBrands1())) {
				TransitCollection.add(HighconcurrencyBigdata.getBrands1());
			}			
			if(!"null".equals(HighconcurrencyBigdata.getBrands2())) {
				TransitCollection.add(HighconcurrencyBigdata.getBrands2());
			}			
			if(!"null".equals(HighconcurrencyBigdata.getBrands3())) {
				TransitCollection.add(HighconcurrencyBigdata.getBrands3());
			}			
			if(!"null".equals(HighconcurrencyBigdata.getBrands4())) {
				TransitCollection.add(HighconcurrencyBigdata.getBrands4());
			}			
			if(!"null".equals(HighconcurrencyBigdata.getBrands5())) {
				TransitCollection.add(HighconcurrencyBigdata.getBrands5());
			}			
			if(!"null".equals(HighconcurrencyBigdata.getBrands6())) {
				TransitCollection.add(HighconcurrencyBigdata.getBrands6());
			}
			int sum = TransitCollection.size();
			
			if(sum == 2) {
				TheLengthOfTheData.add(1);
				for (int x=0; x<TransitCollection.size();x++) {
					String ONE = TransitCollection.get(0);
					String TWO = TransitCollection.get(1);
					multithreading.add(new BIG(ONE,TWO));
					
					break;
				}
			}
			if(sum == 3) {
				TheLengthOfTheData.add(2);
				for (int x=0; x<TransitCollection.size();x++) {
					String ONE = TransitCollection.get(0);
					String TWO = TransitCollection.get(1);
					String THREE = TransitCollection.get(2);					
					multithreading.add(new BIG(ONE, TWO, THREE));
					
					break;
				}
			}
			if(sum == 4) {
				TheLengthOfTheData.add(3);
				for (int x=0; x<TransitCollection.size();x++) {
					String ONE = TransitCollection.get(0);
					String TWO = TransitCollection.get(1);
					String Three = TransitCollection.get(2);
					String FOUR = TransitCollection.get(3);
					multithreading.add(new BIG(ONE, TWO, Three, FOUR));
					
					break;
				}
			}
			if(sum == 5) {
				TheLengthOfTheData.add(4);
				for (int x=0; x<TransitCollection.size();x++) {
					String ONE = TransitCollection.get(0);
					String TWO = TransitCollection.get(1);
					String Three = TransitCollection.get(2);
					String FOUR = TransitCollection.get(3);
					String FIVE = TransitCollection.get(4);				
					multithreading.add(new BIG(ONE, TWO, Three, FOUR, FIVE));
					
					break;
				}
			}
			if(sum == 6) {
				TheLengthOfTheData.add(5);
				for (int x=0; x<TransitCollection.size();x++) {
					String ONE = TransitCollection.get(0);
					String TWO = TransitCollection.get(1);
					String Three = TransitCollection.get(2);
					String FOUR = TransitCollection.get(3);
					String FIVE = TransitCollection.get(4);
					String SIX = TransitCollection.get(5);
					multithreading.add(new BIG(ONE, TWO, Three, FOUR, FIVE, SIX));
					
					break;
				}
			} 
			if(sum == 7) {
				TheLengthOfTheData.add(6);
				for (int x=0; x<TransitCollection.size();x++) {  
					String ONE = TransitCollection.get(0);
					String TWO = TransitCollection.get(1);
					String Three = TransitCollection.get(2);
					String FOUR = TransitCollection.get(3);
					String FIVE = TransitCollection.get(4);
					String SIX = TransitCollection.get(5);
					String SEVEN = TransitCollection.get(6);
					multithreading.add(new BIG(ONE, TWO, Three, FOUR, FIVE, SIX, SEVEN));
					
					break;
				}
			}
			TransitCollection.clear();			
		  
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
			request.setAttribute("Multithreading", multithreading);
			//刷单要开启的浏览器个数
			request.setAttribute("TheLengthOfTheData", TheLengthOfTheData);					
			//转发到操控刷单的servlet
			request.getRequestDispatcher("HighConcurrencyHamstringAmazonServlet").forward(request, response);	
		}    
		if("Google".equals(Browser)) {
			
			if("YES".equals(SO)) {
				//调用工具类读取谷歌的cookies
				List<List<NameAndValue>> CookieS = GoogleReading.Reading(URL);	
				
				//读取的cookies集合到下个servlet
				request.setAttribute("CookieS", CookieS);
				//读取cookies的前缀URL头
				request.setAttribute("URL", URL);  
				//切换IP的VPN信息
				request.setAttribute("VPNS", VPNS);
				//记录要刷单的网址
				request.setAttribute("GUOJIA", GUOJIA);
				//要刷单的产品
				request.setAttribute("Multithreading", multithreading);
				//刷单要开启的浏览器个数
				request.setAttribute("TheLengthOfTheData", TheLengthOfTheData);	
				//日志记录的数据消息（成功和失败记录）
				request.setAttribute("succeed", succeed);
				request.setAttribute("fail", fail);
				//转发到操控刷单的servlet
				//request.getRequestDispatcher("GoogleHighConcurrency").forward(request, response);		
				request.getRequestDispatcher("TestServlet").forward(request, response);	
				
			}if("NO".equals(SO)) {
				//调用工具类读取谷歌的cookies
			//	List<List<NameAndValue>> CookieS = GoogleReading.Reading(URL);	
				
				List<List<AllCookie>> CookieS;
				try {
					CookieS = ReadingAllCookiesGoogle.ReadingAllCookie(URL);
					for (List<AllCookie> list : CookieS) { 
						for (AllCookie allCookie : list) {
							
							System.out.println(allCookie.getDomainS());
							System.out.println(allCookie.getExpirationDateS());
							System.out.println(allCookie.isHostOnlyS());
							System.out.println(allCookie.isHttpOnlyS());
							System.out.println(allCookie.getNameS());
							System.out.println(allCookie.getPathS());
							System.out.println(allCookie.isSecureS());
							System.out.println(allCookie.isSessionS());
							System.out.println(allCookie.getStoreIdS());
							System.out.println(allCookie.getValueS());
			                System.out.println(allCookie.getIdS());	
						}
						System.err.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
					}
					System.err.println(CookieS.size());
					//读取的cookies集合到下个servlet
					request.setAttribute("CookieS", CookieS);
					//读取cookies的前缀URL头
					request.setAttribute("URL", URL);  
					//切换IP的VPN信息
					request.setAttribute("VPNS", VPNS);
					//记录要刷单的网址
					request.setAttribute("GUOJIA", GUOJIA);
					//要刷单的产品
					request.setAttribute("Multithreading", multithreading);
					//刷单要开启的浏览器个数
					request.setAttribute("TheLengthOfTheData", TheLengthOfTheData);	
					//日志记录的数据消息（成功和失败记录）
					request.setAttribute("succeed", succeed);
					request.setAttribute("fail", fail);
					//转发到操控刷单的servlet
					//request.getRequestDispatcher("GoogleHighConcurrency").forward(request, response);										
					request.getRequestDispatcher("FIXServlet").forward(request, response);	
				} catch (ParseException e) {					
					System.out.println("What?");
				}
				
			}								
		}
  }
}

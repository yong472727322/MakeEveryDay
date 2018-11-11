package com.ITzy.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ITzy.entity.BIG;
import com.ITzy.entity.FirefoxCookies;
import com.ITzy.entity.NameAndValue;
import com.ITzy.utils.IPAgency;


public class GoogleHighConcurrency extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public static int  quantity = 0;
	public static String  BrandLinks ="";	
	public static String Link = null;
	public static int WarningLights = 1; 
	public static int DataRecords = 1;   
	public static int OnFailure = 1;
	public static int BigSum = 1;
	public static String  KeyWords = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		  FileWriter fw = null;
	        PrintWriter pw = null;  
          //获取谷歌的 Cookies
	        List<List<NameAndValue>> CookieS =  (List<List<NameAndValue>>)request.getAttribute("CookieS");
	        //获取cookies前缀头
			String  URL = (String)request.getAttribute("URL");
			//获取VPN信息
			String VPNS = (String) request.getAttribute("VPNS");
			//获取网站的网址
			String  GUOJIA = (String)request.getAttribute("GUOJIA");
			//要刷单的产品
			List<BIG>  Multithreading = (List<BIG>)request.getAttribute("Multithreading");
			//刷单要开启的浏览器个数
			List<Integer>  TheLengthOfTheData = (List<Integer>)request.getAttribute("TheLengthOfTheData");
			//日志记录的数据消息（成功和失败记录）
			String  succeed = (String) request.getAttribute("succeed");
			String  fail = (String) request.getAttribute("fail");
				
			    System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe"); 
			       
			    for (Integer IG : TheLengthOfTheData) {
					String BRD = "";
				    quantity = IG;				  					    
				    //拿到品牌的每一条				
				    for(int x=0;x<Multithreading.size();x++) {
				    	BIG testone = Multithreading.get(WarningLights-1);				    	
				    	BRD = testone.getFUCK1()+"@@@"+testone.getFUCK2()+"@@@"+testone.getFUCK3()+"@@@"+testone.getFUCK4()+"@@@"+testone.getFUCK5()+"@@@"+testone.getFUCK6();				 
				    	break;
		 		    }				
				    //拿到链接的地址		       
				    for(int x=0;x<Multithreading.size();x++) {
				    	BIG testtwo = Multithreading.get(WarningLights-1);
				    	Link = testtwo.getURL();
				    	String[] Key  = Link.split("keywords=");
				    	for(int z=0;z<Key.length;z++) {
				    		if(z==1) {
				    			String[] words = Key[1].split("&");
				    			 KeyWords =  words[0];
				    			 System.out.println(KeyWords);
				    		}
				    	}
			          	break;
				    }				 									    
				    //遍历谷歌的cookies
				    for (List<NameAndValue> list : CookieS) {
																			
							// 调用切换IP代码
							try {
							System.err.println("终止刷单系统......");
							Thread.sleep(1000);
							System.err.println("启动切换IP指令......");			
							IPAgency.GodOperation(VPNS);
							Thread.sleep(1000);
							System.err.println("继续开启执行刷单系统......");
						   } catch (Exception e) {
							e.printStackTrace();
						   }
							
							 //初始化窗口谷歌WebDriver 的属性
							 WebDriver GOG1 = null;
							 WebDriver GOG2 = null;
							 WebDriver GOG3 = null;
							 WebDriver GOG4 = null;
							 WebDriver GOG5 = null;
							 WebDriver GOG6 = null;	
							 
							 //自动默认初始化List集合(开启谷歌的集合)
							 List<WebDriver> GOG =  new ArrayList<WebDriver>();
							 //自动默认初始化List集合()
							 List<WebDriver>  ControlExecutive  = new ArrayList<WebDriver>();
							 
							 //判断开启的窗口个数
							  if( 1 == quantity) {
									//开启加载谷歌浏览器
								    WebDriver GOGdriver1 = new ChromeDriver();	
								    GOGdriver1.manage().window().maximize();  
								    GOG.add(GOGdriver1);					
							  } 
				              if( 2 == quantity) {
				            	    //开启加载谷歌浏览器
									WebDriver GOGdriver1 = new ChromeDriver();				
									WebDriver GOGdriver2 = new ChromeDriver();
									GOGdriver1.manage().window().maximize();  
									GOGdriver2.manage().window().maximize();  
									GOG.add(GOGdriver1);
									GOG.add(GOGdriver2);
							  } 
				              if( 3 == quantity) {
				            	    //开启加载谷歌浏览器
				            	    WebDriver GOGdriver1 = new ChromeDriver();           	  
									WebDriver GOGdriver2 = new ChromeDriver();					
									WebDriver GOGdriver3 = new ChromeDriver();
									GOGdriver1.manage().window().maximize();  
									GOGdriver2.manage().window().maximize();  
									GOGdriver3.manage().window().maximize();  
									GOG.add(GOGdriver1);
									GOG.add(GOGdriver2);
									GOG.add(GOGdriver3);				
				              } 
				              if( 4 == quantity) {
				            	    //开启加载谷歌浏览器
				            	    WebDriver GOGdriver1 = new ChromeDriver();            	   
									WebDriver GOGdriver2 = new ChromeDriver();					
									WebDriver GOGdriver3 = new ChromeDriver();					
									WebDriver GOGdriver4 = new ChromeDriver();	
									GOGdriver1.manage().window().maximize();  
									GOGdriver2.manage().window().maximize();  
									GOGdriver3.manage().window().maximize();  
									GOGdriver4.manage().window().maximize();  
									GOG.add(GOGdriver1);
									GOG.add(GOGdriver2);
									GOG.add(GOGdriver3);
									GOG.add(GOGdriver4);					
				              } 
				              if( 5 == quantity) {
				            	    //开启加载谷歌浏览器
				            	    WebDriver GOGdriver1 = new ChromeDriver();           	   
									WebDriver GOGdriver2 = new ChromeDriver();					
									WebDriver GOGdriver3 = new ChromeDriver();					
									WebDriver GOGdriver4 = new ChromeDriver();					
									WebDriver GOGdriver5 = new ChromeDriver();	
									GOGdriver1.manage().window().maximize();  
									GOGdriver2.manage().window().maximize();  
									GOGdriver3.manage().window().maximize();  
									GOGdriver4.manage().window().maximize();  
									GOGdriver5.manage().window().maximize();  
									
									GOG.add(GOGdriver1);
									GOG.add(GOGdriver2);
									GOG.add(GOGdriver3);
									GOG.add(GOGdriver4);
									GOG.add(GOGdriver5);					
				              } 
				              if( 6 == quantity) {
				            	    //开启加载谷歌浏览器
				            	    WebDriver GOGdriver1 = new ChromeDriver();       	   
									WebDriver GOGdriver2 = new ChromeDriver();				
									WebDriver GOGdriver3 = new ChromeDriver();				
									WebDriver GOGdriver4 = new ChromeDriver();					
									WebDriver GOGdriver5 = new ChromeDriver();					
									WebDriver GOGdriver6 = new ChromeDriver();	
									GOGdriver1.manage().window().maximize();  
									GOGdriver2.manage().window().maximize();  
									GOGdriver3.manage().window().maximize();  
									GOGdriver4.manage().window().maximize();  
									GOGdriver5.manage().window().maximize();
									GOGdriver6.manage().window().maximize();
									
									GOG.add(GOGdriver1);
									GOG.add(GOGdriver2);
									GOG.add(GOGdriver3);
									GOG.add(GOGdriver4);
									GOG.add(GOGdriver5);
									GOG.add(GOGdriver6);				
				              } 
				              
				              
				              //加强for循环控制窗口导入Cookies
				              for (Object OB : GOG) {
				            	  
									WebDriver Google = (WebDriver)	OB;
									Google.get(GUOJIA);
									for (NameAndValue nameAndValue : list) {
											Cookie Cookies = new Cookie(nameAndValue.getName(), nameAndValue.getValue());
											System.out.println(Cookies);
											Google.manage().addCookie(Cookies);
									}
											
										try {
											Google.get("https://www.Google.com");
											Thread.sleep(5000);
											Google.get(GUOJIA);
											if("https://www.amazon.de".equals(GUOJIA)) {
												//德国语言的切换
												System.out.println("启动语言切换指令！");
											    WebElement English = Google.findElement(By.id("icp-nav-flyout"));
												English.click();										 									 
												WebElement BUG =  Google.findElement(By.xpath("//div[@class='a-column a-span7']/div[2][@class='a-row a-spacing-mini']"));  
											    BUG.click();									 
												WebElement anclick =  Google.findElement(By.className("a-button-input"));  
												anclick.click();
												System.out.println("语言切换指令已完成！");
											}if("https://www.amazon.co.jp".equals(GUOJIA)) {
												//日本语言切换语言操作代码
												System.out.println("启动语言切换指令！");
												 WebElement English = Google.findElement(By.id("icp-nav-flyout"));
												 English.click();				 			 
												 WebElement BUG =  Google.findElement(By.xpath("//div[@class='a-column a-span7']/div[2][@class='a-row a-spacing-mini']"));  
												 BUG.click();			 
												 WebElement anclick =  Google.findElement(By.className("a-button-input"));  
												 anclick.click();
												 System.out.println("语言切换指令已完成！");
											}if("https://www.amazon.com/".equals(GUOJIA)) {
												System.out.println("已是当前语言！");
											}if("https://www.amazon.co.uk/".equals(GUOJIA)) {
												System.out.println("已是当前语言！");
											}if("https://www.amazon.fr/".equals(GUOJIA)) {
												System.out.println("当前网页无切换语言指令！默认为法语！");
											}if("https://www.amazon.ca/".equals(GUOJIA)) {
												System.out.println("启动语言切换指令！");
												 WebElement English = Google.findElement(By.id("icp-nav-flyout"));
												 English.click();				 			 
												 WebElement BUG =  Google.findElement(By.xpath("//div[@class='a-column a-span7']/div[1][@class='a-row a-spacing-mini']"));  
												 BUG.click();			 
												 WebElement anclick =  Google.findElement(By.className("a-button-input"));  
												 anclick.click();
												 System.out.println("语言切换指令已完成！");
											}if("https://www.amazon.es".equals(GUOJIA)) {
												System.out.println("当前网页无切换语言指令！默认为法语！");
											}if("https:// www.amazon.it/".equals(GUOJIA)) {
												System.out.println("当前网页无切换语言指令！默认为法语！");
											}
										} catch (NoSuchElementException e ) {							
											try {
												System.out.println("进入NoSuchElementException异常！！！");
												Google.get(GUOJIA);	
												if("https://www.amazon.de".equals(GUOJIA)) {
													//德国语言的切换
													System.out.println("启动语言切换指令！");
												    WebElement English = Google.findElement(By.id("icp-nav-flyout"));
													English.click();										 									 
													WebElement BUG =  Google.findElement(By.xpath("//div[@class='a-column a-span7']/div[2][@class='a-row a-spacing-mini']"));  
												    BUG.click();									 
													WebElement anclick =  Google.findElement(By.className("a-button-input"));  
													anclick.click();
													System.out.println("语言切换指令已完成！");
												}if("https://www.amazon.co.jp".equals(GUOJIA)) {
													//日本语言切换语言操作代码
													System.out.println("启动语言切换指令！");
													 WebElement English = Google.findElement(By.id("icp-nav-flyout"));
													 English.click();				 			 
													 WebElement BUG =  Google.findElement(By.xpath("//div[@class='a-column a-span7']/div[2][@class='a-row a-spacing-mini']"));  
													 BUG.click();			 
													 WebElement anclick =  Google.findElement(By.className("a-button-input"));  
													 anclick.click();
													 System.out.println("语言切换指令已完成！");
												}if("https://www.amazon.com/".equals(GUOJIA)) {
													System.out.println("已是当前语言！");
												}if("https://www.amazon.co.uk/".equals(GUOJIA)) {
													System.out.println("已是当前语言！");
												}if("https://www.amazon.fr/".equals(GUOJIA)) {
													System.out.println("当前网页无切换语言指令！默认为法语！");
												}if("https://www.amazon.ca/".equals(GUOJIA)) {
													System.out.println("启动语言切换指令！");
													 WebElement English = Google.findElement(By.id("icp-nav-flyout"));
													 English.click();				 			 
													 WebElement BUG =  Google.findElement(By.xpath("//div[@class='a-column a-span7']/div[1][@class='a-row a-spacing-mini']"));  
													 BUG.click();			 
													 WebElement anclick =  Google.findElement(By.className("a-button-input"));  
													 anclick.click();
													 System.out.println("语言切换指令已完成！");
												}if("https://www.amazon.es".equals(GUOJIA)) {
													System.out.println("当前网页无切换语言指令！默认为法语！");
												}if("https:// www.amazon.it/".equals(GUOJIA)) {
													System.out.println("当前网页无切换语言指令！默认为法语！");
												}
											} catch (NoSuchElementException e1) {
												System.out.println("进入NoSuchElementException异常！！！");
												//设置日期格式
												SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
												// new Date()为获取当前系统时间
												String Time  = df.format(new Date());
												//执行流文件写入
												File f = new File(fail);
												if (f.exists()) {
													fw = new FileWriter(f, true);
													pw = new PrintWriter(fw);
													pw.println("Fail    "+Time+"     Visit to amazon failed!");
													pw.println("                                            ");

												} else {
													f.createNewFile();
													fw = new FileWriter(f, true);
													pw = new PrintWriter(fw);
													pw.println("Fail    "+Time+"     Visit to amazon failed!");
													pw.println("                                            ");
												}
												pw.flush();
												fw.flush();
												pw.close();
												fw.close();  
											}
										}catch (TimeoutException e) {							
											System.out.println("链接超时");
											System.out.println("亚马逊主页加载超时异常！");
											//设置日期格式
											SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
											// new Date()为获取当前系统时间
											String Time  = df.format(new Date());
											//执行流文件写入
											File f = new File(fail);
											if (f.exists()) {
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Amazon home page load timeout exception!");
												pw.println("                                            ");

											} else {
												f.createNewFile();
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Amazon home page load timeout exception!");
												pw.println("                                            ");
											}
											pw.flush();
											fw.flush();
											pw.close();
											fw.close();  
										} catch (InterruptedException e) {
										     System.out.println("nice");
										}
										
																	
								} 
				              //控制窗口跳转到制定的url            
			            	  for (Object OB : GOG) {
			            		  try {
			            			  WebDriver GOGS = (WebDriver)OB;
			            			  GOGS.get(Link); 
			                		 				
			    						Thread.sleep(1000);    							
								} catch (InterruptedException e) {								
									e.printStackTrace();
								}catch (TimeoutException e) {							
									System.out.println("链接超时");
									//设置日期格式
									SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
									// new Date()为获取当前系统时间
									String Time  = df.format(new Date());
									//执行流文件写入
									File f = new File(fail);
									if (f.exists()) {
										fw = new FileWriter(f, true);
										pw = new PrintWriter(fw);
										pw.println("Fail    "+Time+"     Like load timeout exception!");
										pw.println("                                       ");

									} else {
										f.createNewFile();
										fw = new FileWriter(f, true);
										pw = new PrintWriter(fw);
										pw.println("Fail    "+Time+"     Like load timeout exception!");
										pw.println("                                       ");
									}
									pw.flush();
									fw.flush();
									pw.close();
									fw.close();  
								}catch (Exception e) {								
									System.out.println("产品链接失败！找不到指定的链接信息");
									//设置日期格式
									SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
									// new Date()为获取当前系统时间
									String Time  = df.format(new Date());
									//执行流文件写入
									File f = new File(fail);
									if (f.exists()) {
										fw = new FileWriter(f, true);
										pw = new PrintWriter(fw);
										pw.println("Fail    "+Time+"     Failed URL access!");
										pw.println("                                       ");

									} else {
										f.createNewFile();
										fw = new FileWriter(f, true);
										pw = new PrintWriter(fw);
										pw.println("Fail    "+Time+"     Failed URL access!");
										pw.println("                                       ");
									}
									pw.flush();
									fw.flush();
									pw.close();
									fw.close();  
								}
			            		 
			            	  } 
			            	  String[] brand = BRD.split("@@@"); 
			            	//进行品牌的多少判断
						    	 if(1 == quantity) {	
						    		  //控制窗口跳跃到指定的品牌链接
								     for(int x=0;x<GOG.size();x++) {
								    	 
								    	 Object DV1 = GOG.get(0);
								    	 
								    	 //进行转化
								    	 GOG1 = (WebDriver)DV1;
								    	 
								     }
								     try {
								    	 for(int x=0;x<=0;x++) {
								    			if(x==0) {
								    				WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									    			aboutLink1.click();							    			
								    			}					    				    			
								    		}
									}  catch (NoSuchElementException e) {
										
										  try {
											  System.out.println("产品搜索失败");
										    	 for(int x=0;x<=0;x++) {
										    			if(x==0) {
										    				WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
											    			aboutLink1.click();							    			
										    			}					    				    			
										    		}
											}  catch (NoSuchElementException e1) {
												System.out.println("产品搜索失败");
												//设置日期格式
												SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
												// new Date()为获取当前系统时间
												String Time  = df.format(new Date());
												//执行流文件写入
												File f = new File(fail);
												if (f.exists()) {
													fw = new FileWriter(f, true);
													pw = new PrintWriter(fw);
													pw.println("Fail    "+Time+"     Product search failed!");
													pw.println("                                       ");

												} else {
													f.createNewFile();
													fw = new FileWriter(f, true);
													pw = new PrintWriter(fw);
													pw.println("Fail    "+Time+"     Product search failed!");
													pw.println("                                       ");
												}
												pw.flush();
												fw.flush();
												pw.close();
												fw.close();
											} 
									} 
								    ControlExecutive.add(GOG1);
						    	 }if(2 == quantity) {	
						    		  //控制窗口跳跃到指定的品牌链接
								     for(int x=0;x<GOG.size();x++) {
								    	 
								    	 Object DV1 = GOG.get(0);
								    	 Object DV2 = GOG.get(1);
								    	 
								    	 //进行转化
								    	 GOG1 = (WebDriver)DV1;
								    	 GOG2 = (WebDriver)DV2;
								    	 
								    	
								     }	
								     try {
								    	 for(int x=0;x<=1;x++) {
								    		 if(x==0) {
								    			 System.out.println(brand[0]);								    		
								    			 WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									    		 aboutLink1.click();						    		
								    		 }if(x==1) {
								    			 System.out.println(brand[1]);								    			
								    			 WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									    		 aboutLink2.click();						    		
								    		 }					    							    		
								    	 }
									} catch (NoSuchElementException e) {
										 try {
											 System.out.println("产品搜索失败");
									    	 for(int x=0;x<=1;x++) {
									    		 if(x==0) {
									    			 WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
										    		 aboutLink1.click();						    		
									    		 }if(x==1) {
									    			 WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
										    		 aboutLink2.click();						    		
									    		 }					    							    		
									    	 }
										} catch (NoSuchElementException e1) {
											System.out.println("产品搜索失败");
											//设置日期格式
											SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
											// new Date()为获取当前系统时间
											String Time  = df.format(new Date());
											//执行流文件写入
											File f = new File(fail);
											if (f.exists()) {
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product search failed!");
												pw.println("                                       ");

											} else {
												f.createNewFile();
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product search failed!");
												pw.println("                                       ");
											}
											pw.flush();
											fw.flush();
											pw.close();
											fw.close();  
										} 
									} 
								    ControlExecutive.add(GOG1);
								    ControlExecutive.add(GOG2);
						    	 }if(3 == quantity) {			    		
						    		  //控制窗口跳跃到指定的品牌链接
								     for(int x=0;x<GOG.size();x++) {
								    	 
								    	 Object DV1 = GOG.get(0);
								    	 Object DV2 = GOG.get(1);
								    	 Object DV3 = GOG.get(2);
								    	 
								    	 //进行转化
								    	 GOG1 = (WebDriver)DV1;
								    	 GOG2 = (WebDriver)DV2;
								    	 GOG3 = (WebDriver)DV3;
								    	 
								    
								     }	
								     try {
								    	 for(int x=0;x<=2;x++) {
								    		 if(x==0) {
								    			 WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									    		 aboutLink1.click();						    		
								    		 } if(x==1) {
								    			 WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									    		 aboutLink2.click();						    		
								    		 } if(x==2) {
								    			 WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
									    		 aboutLink3.click();						    		
								    		 }					    							    							    		
								    	 }
									} catch (NoSuchElementException e) {
										 try {
											 System.out.println("产品搜索失败");
									    	 for(int x=0;x<=2;x++) {
									    		 if(x==0) {
									    			 WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
										    		 aboutLink1.click();						    		
									    		 } if(x==1) {
									    			 WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
										    		 aboutLink2.click();						    		
									    		 } if(x==2) {
									    			 WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
										    		 aboutLink3.click();						    		
									    		 }					    							    							    		
									    	 }
										} catch (NoSuchElementException e1) {
											System.out.println("产品搜索失败");
											//设置日期格式
											SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
											// new Date()为获取当前系统时间
											String Time  = df.format(new Date());
											//执行流文件写入
											File f = new File(fail);
											if (f.exists()) {
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product search failed!");
												pw.println("                                       ");

											} else {
												f.createNewFile();
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product search failed!");
												pw.println("                                       ");
											}
											pw.flush();
											fw.flush();
											pw.close();
											fw.close();  
										} 
									} 
								    ControlExecutive.add(GOG1);
								    ControlExecutive.add(GOG2);
								    ControlExecutive.add(GOG3);
						    	 }if(4 == quantity) {			    		
						    		  //控制窗口跳跃到指定的品牌链接
								     for(int x=0;x<GOG.size();x++) {
								    	 
								    	 Object DV1 = GOG.get(0);
								    	 Object DV2 = GOG.get(1);
								    	 Object DV3 = GOG.get(2);
								    	 Object DV4 = GOG.get(3);
								    	 
								    	 //进行转化
								    	 GOG1 = (WebDriver)DV1;
								    	 GOG2 = (WebDriver)DV2;
								    	 GOG3 = (WebDriver)DV3;
								    	 GOG4 = (WebDriver)DV4;
								    	 
								    	
								     }	
								     try {
								    	 for(int x=0;x<=3;x++) {
								    		 if(x==0) {
								    			 WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									    		 aboutLink1.click();						    		
								    		 }
								    		 if(x==1) {
								    			 WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									    		 aboutLink2.click();						    		
								    		 }
			                                 if(x==2) {
			                                	 WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
			    					    		 aboutLink3.click();    					    		
								    		 }
			                                 if(x==3) {
			                                	 WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
			    					    		 aboutLink4.click();   					    		
			                                 }					    							    		 					    		
								    	 }
									} catch (NoSuchElementException e) {
										
										 try {
											 System.out.println("产品搜索失败");
										
									    	 for(int x=0;x<=3;x++) {
									    		 if(x==0) {
									    			 WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
										    		 aboutLink1.click();						    		
									    		 }
									    		 if(x==1) {
									    			 WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
										    		 aboutLink2.click();						    		
									    		 }
				                                 if(x==2) {
				                                	 WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
				    					    		 aboutLink3.click();    					    		
									    		 }
				                                 if(x==3) {
				                                	 WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
				    					    		 aboutLink4.click();   					    		
				                                 }					    							    		 					    		
									    	 }
										} catch (NoSuchElementException e1) {
											System.out.println("产品搜索失败");
											//设置日期格式
											SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
											// new Date()为获取当前系统时间
											String Time  = df.format(new Date());
											//执行流文件写入
											File f = new File(fail);
											if (f.exists()) {
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product search failed!");
												pw.println("                                       ");

											} else {
												f.createNewFile();
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product search failed!");
												pw.println("                                       ");
											}
											pw.flush();
											fw.flush();
											pw.close();
											fw.close();  
									} 
								    
						    	 }
								     ControlExecutive.add(GOG1);
								     ControlExecutive.add(GOG2);
								     ControlExecutive.add(GOG3);
								     ControlExecutive.add(GOG4);
								     }if(5 == quantity) {			    		
						    		  //控制窗口跳跃到指定的品牌链接
								     for(int x=0;x<GOG.size();x++) {
								    	 
								    	 Object DV1 = GOG.get(0);
								    	 Object DV2 = GOG.get(1);
								    	 Object DV3 = GOG.get(2);
								    	 Object DV4 = GOG.get(3);
								    	 Object DV5 = GOG.get(4);
								    	 
								    	 //进行转化
								    	 GOG1 = (WebDriver)DV1;
								    	 GOG2 = (WebDriver)DV2;
								    	 GOG3 = (WebDriver)DV3;
								    	 GOG4 = (WebDriver)DV4;
								    	 GOG5 = (WebDriver)DV5;
								    	 
								    	
								     }	
								     try {
								    	 for(int x=0;x<=4;x++) {
								    		 if(x==0) {
								    			 WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									    		 aboutLink1.click();						    		
								    		 }if(x==1) {
								    			 WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									    		 aboutLink2.click();						    		
								    		 }if(x==2) {
								    			 WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
									    		 aboutLink3.click();						    		
								    		 }if(x==3) {
								    			 WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
									    		 aboutLink4.click();						    		 
								    		 }if(x==4) {
								    			 WebElement aboutLink5 = GOG5.findElement(By.partialLinkText(brand[4]));
									    		 aboutLink5.click();						    		
								    		 }					    								    		 					    		 					    		 					    		
								    	 }
									}catch (NoSuchElementException e){
										try {
											System.out.println("产品搜索失败");
										
									    	 for(int x=0;x<=4;x++) {
									    		 if(x==0) {
									    			 WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
										    		 aboutLink1.click();						    		
									    		 }if(x==1) {
									    			 WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
										    		 aboutLink2.click();						    		
									    		 }if(x==2) {
									    			 WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
										    		 aboutLink3.click();						    		
									    		 }if(x==3) {
									    			 WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
										    		 aboutLink4.click();						    		 
									    		 }if(x==4) {
									    			 WebElement aboutLink5 = GOG5.findElement(By.partialLinkText(brand[4]));
										    		 aboutLink5.click();						    		
									    		 }					    								    		 					    		 					    		 					    		
									    	 }
										}catch (NoSuchElementException e1){
											System.out.println("产品搜索失败");
											//设置日期格式
											SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
											// new Date()为获取当前系统时间
											String Time  = df.format(new Date());
											//执行流文件写入
											File f = new File(fail);
											if (f.exists()) {
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product search failed!");
												pw.println("                                       ");

											} else {
												f.createNewFile();
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product search failed!");
												pw.println("                                       ");
											}
											pw.flush();
											fw.flush();
											pw.close();
											fw.close();  
										} 
									} 
								     ControlExecutive.add(GOG1);
								     ControlExecutive.add(GOG2);
								     ControlExecutive.add(GOG3);
								     ControlExecutive.add(GOG4);
								     ControlExecutive.add(GOG5);
						    	 }if(6 == quantity) {			    		
						    		  //控制窗口跳跃到指定的品牌链接
								     for(int x=0;x<GOG.size();x++) {
								    	 
								    	 Object DV1 = GOG.get(0);
								    	 Object DV2 = GOG.get(1);
								    	 Object DV3 = GOG.get(2);
								    	 Object DV4 = GOG.get(3);
								    	 Object DV5 = GOG.get(4);
								    	 Object DV6 = GOG.get(5);
								    	 
								    	 //进行转化
								    	 GOG1 = (WebDriver)DV1;
								    	 GOG2 = (WebDriver)DV2;
								    	 GOG3 = (WebDriver)DV3;
								    	 GOG4 = (WebDriver)DV4;
								    	 GOG5 = (WebDriver)DV5;
								    	 GOG6 = (WebDriver)DV6;
								    	 
								  
								     }	
								     try {
								    	 for(int x=0;x<=5;x++) {
								    		    if(x==0) {
								    			     WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									    		     aboutLink1.click();						    		    
												}if(x==1) {
													 WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
										    		 aboutLink2.click();							    		 
												}if(x==2) {
													WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
										    		 aboutLink3.click();							    		
												}if(x==3) {
													 WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
										    		 aboutLink4.click();							    		 
												}if(x==4) {
													WebElement aboutLink5 = GOG5.findElement(By.partialLinkText(brand[4]));
										    		aboutLink5.click();							    		
												}if(x==5) {
													WebElement aboutLink6 = GOG6  .findElement(By.partialLinkText(brand[5]));
										    		aboutLink6.click();							    		
												}					    							    							    		 					    							    		 					    		
								    	 }							
									}catch (NoSuchElementException e){
										try {
											
											System.out.println("产品搜索失败");
									    	 for(int x=0;x<=5;x++) {
									    		    if(x==0) {
									    			     WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
										    		     aboutLink1.click();						    		    
													}if(x==1) {
														 WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
											    		 aboutLink2.click();							    		 
													}if(x==2) {
														WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
											    		 aboutLink3.click();							    		
													}if(x==3) {
														 WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
											    		 aboutLink4.click();							    		 
													}if(x==4) {
														WebElement aboutLink5 = GOG5.findElement(By.partialLinkText(brand[4]));
											    		aboutLink5.click();							    		
													}if(x==5) {
														WebElement aboutLink6 = GOG6  .findElement(By.partialLinkText(brand[5]));
											    		aboutLink6.click();							    		
													}					    							    							    		 					    							    		 					    		
									    	 }							
										}catch (NoSuchElementException e1){
											System.out.println("产品搜索失败");
											//设置日期格式
											SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
											// new Date()为获取当前系统时间
											String Time  = df.format(new Date());
											//执行流文件写入
											File f = new File(fail);
											if (f.exists()) {
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product search failed!");
												pw.println("                                       ");

											} else {
												f.createNewFile();
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product search failed!");
												pw.println("                                       ");
											}
											pw.flush();
											fw.flush();
											pw.close();
											fw.close();  
										} 
									} 
								     ControlExecutive.add(GOG1);
								     ControlExecutive.add(GOG2);
								     ControlExecutive.add(GOG3);
								     ControlExecutive.add(GOG4);
								     ControlExecutive.add(GOG5);
								     ControlExecutive.add(GOG6);
						    	 }
						    	 
						    	//增强for循环添加浏览商品
							    	for (WebDriver WB : ControlExecutive) {
							    		 try {
							    			    //获得浏览器主体 
									    		JavascriptExecutor js = (JavascriptExecutor) WB;
									    		Thread.sleep(4000);
									    		   //随机产生浏览
									    		   Random rand = new Random();
											      int sum =  rand.nextInt(7)+1;
											      System.err.println("正在随机产生界面浏览方式...");
											      Thread.sleep(2000);
											      System.err.println("产生"+sum+"号界面浏览方式...");
											      Thread.sleep(2000);
											      System.err.println("程序即将开启浏览模式操作...");
											      if(sum == 1) {
											          int max=6000;
											          int min=3000;
											          Random random = new Random();
											          int s = random.nextInt(max)%(max-min+1) + min;
											          int max1=10;
											          int min1=40;
											          Random random1 = new Random();
											          int SUI = random1.nextInt(max1)%(max1-min1+1) + min1;									
											    	  for(int x=1;x<=s;x++) {
												    		if(x%SUI==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}									    		
												    	}
											    		for(int x=s;x>=1;x--) {
												    		if(x%SUI==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}									    		
												    	}
											    		int max2=5000;
												        int min2=2000;
												        Random random2 = new Random();
												        int SUI2 = random2.nextInt(max2)%(max2-min2+1) + min2;
												        
												        int max3=20;
												        int min3=9;
												        Random random3 = new Random();
												        int SUI3 = random3.nextInt(max3)%(max3-min3+1) + min3;
											    		for(int x=1;x<=SUI2;x++) {
												    		if(x%SUI3==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}		    		
												    	}
											    		Thread.sleep(5000);
											    		for(int x=SUI2;x<=8000;x++) {
											    			if(x%SUI3==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}		
											    		}
											    		    int max4=80;
													        int min4=20;
													        Random random4 = new Random();
													        int SUI4 = random4.nextInt(max4)%(max4-min4+1) + min4;
											    		for(int x=8000;x>=1;x--) {
											    			if(x%SUI4==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}		
											    		}
											    		    int max5=5000;
													        int min5=3000;
													        Random random5 = new Random();
													        int SUI5 = random5.nextInt(max5)%(max5-min5+1) + min5;
											    		for(int x=1;x<=SUI5;x++) {
											    			if(x%SUI4==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}		
											    		}
											    		Thread.sleep(8000);
											    		for(int x=SUI5;x>=1;x--) {
											    			if(x%20==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}		
											    		}							
											      } if(sum == 2) {
											    	 
											          int max1=25;
											          int min1=50;
											          Random random1 = new Random();
											          int SUI = random1.nextInt(max1)%(max1-min1+1) + min1;									
											    	  for(int x=1;x<=6000;x++) {
												    		if(x%SUI==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}									    		
												    	}
											    		for(int x=6000;x>=1;x--) {
												    		if(x%SUI==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}									    		
												    	}
											    		int max2=2500;
												        int min2=1000;
												        Random random2 = new Random();
												        int SUI2 = random2.nextInt(max2)%(max2-min2+1) + min2;
												        
												        int max3=20;
												        int min3=9;
												        Random random3 = new Random();
												        int SUI3 = random3.nextInt(max3)%(max3-min3+1) + min3;
											    		for(int x=1;x<=SUI2;x++) {
												    		if(x%SUI3==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}		    		
												    	}
											    		Thread.sleep(5000);
											    		    int max4=50;
													        int min4=30;
													        Random random4 = new Random();
													        int SUI4 = random4.nextInt(max4)%(max4-min4+1) + min4;
											    		for(int x=SUI2;x<=7000;x++) {
											    			if(x%SUI4==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}		
											    		}
											    		  int max5=80;
													      int min5=40;
													      Random random5 = new Random();
													      int SUI5 = random5.nextInt(max5)%(max5-min5+1) + min5;
											    		for(int x=8000;x>=1;x--) {
											    			if(x%SUI5==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}		
											    		}
											    			
											      }
											      if(sum == 3) {
											    	  
											          int max1=1000;
											          int min1=2300;
											          Random random1 = new Random();
											          int SUI = random1.nextInt(max1)%(max1-min1+1) + min1;	
											          
											          int max2=2;
											          int min2=10;
											          Random random2 = new Random();
											          int SUI2 = random2.nextInt(max2)%(max2-min2+1) + min2;
											          
											    	  for(int x=1;x<=SUI;x++) {
												    		if(x%SUI2==0) {
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}									    		
												     }
											    	Thread.sleep(5000);
											    	  int max3=12;
											          int min3=24;
											          Random random3 = new Random();
											          int SUI3 = random3.nextInt(max3)%(max3-min3+1) + min3;
											          
											    	 for(int x=SUI;x<=6000;x++) {
												    		if(x%SUI3==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}									    		
												     }
											    	  int max4=1500;
											          int min4=3000;
											          Random random4 = new Random();
											          int SUI4 = random4.nextInt(max4)%(max4-min4+1) + min4;
											          
											          int max5=11;
											          int min5=40;
											          Random random5 = new Random();
											          int SUI5 = random5.nextInt(max5)%(max5-min5+1) + min5;
											          
											    	 for(int x=6000;x>=SUI4;x--) {
												    		if(x%SUI5==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}									    		
												     }
											    	  int max6=20;
											          int min6=50;
											          Random random6 = new Random();
											          int SUI6 = random6.nextInt(max6)%(max6-min6+1) + min6;
											    	for(int x=SUI4;x<=6000;x++ ) {
											    		if(x%SUI6==0){
											    			js.executeScript("scrollTo(0,"+x+")");
											    		}	
											    	}
											    	Thread.sleep(4000);
											    	  int max7=10;
											          int min7=80;
											          Random random7 = new Random();
											          int SUI7 = random7.nextInt(max7)%(max7-min7+1) + min7;
											          for(int x=6000;x>=1;x--) {
												    		if(x%SUI7==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												    	}
											      }
											      if(sum == 4) {
											    	int max6=20;
											        int min6=50;
											        Random random6 = new Random();
											        int SUI6 = random6.nextInt(max6)%(max6-min6+1) + min6;
											      	for(int x=1;x<=7000;x++ ) {
											    		if(x%SUI6==0){
											    			js.executeScript("scrollTo(0,"+x+")");
											    		}	
											    	}
											      	int max7=20;
											        int min7=40;
											        Random random7 = new Random();
											        int SUI7 = random7.nextInt(max7)%(max7-min7+1) + min7;
											        for(int x=7000;x>=1;x--) {
											    		if(x%SUI7==0){
											    			js.executeScript("scrollTo(0,"+x+")");
											    		}	
											    	}
											      }
											      if(sum == 5) {
											    		int max7=5;
												        int min7=40;
												        Random random7 = new Random();
												        int SUI7 = random7.nextInt(max7)%(max7-min7+1) + min7;
												        for(int x=1;x<=7000;x++) {
												        	if(x%SUI7==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        
												        int max8=3500;
												        int min8=2000;
												        Random random8 = new Random();
												        int SUI8 = random8.nextInt(max8)%(max8-min8+1) + min8;
												        
												        int max9=25;
												        int min9=8;
												        Random random9 = new Random();
												        int SUI9 = random9.nextInt(max9)%(max9-min9+1) + min9;
												        
												        for(int x=7000;x>=SUI8;x--) {
												        	if(x%SUI9==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        int max10=50;
												        int min10=30;
												        Random random10 = new Random();
												        int SUI10 = random10.nextInt(max10)%(max10-min10+1) + min10;
												        for(int x=SUI8;x<=7000;x++) {
												        	if(x%SUI10==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        int max1=50;
												        int min1=8;
												        Random random1 = new Random();
												        int SUI1= random1.nextInt(max1)%(max1-min1+1) + min1;
												        for(int x=7000;x>=1;x--) {
												        	if(x%SUI1==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        Thread.sleep(2000);
											      }
											      if(sum == 6) {
											    	    int max1=50;
												        int min1=8;
												        Random random1 = new Random();
												        int SUI1= random1.nextInt(max1)%(max1-min1+1) + min1;
												        for(int x=1;x<=2500;x++) {
												        	if(x%SUI1==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        Thread.sleep(2000);
												        int max2=70;
												        int min2=20;
												        Random random2 = new Random();
												        int SUI2= random2.nextInt(max2)%(max2-min2+1) + min2;
												        for(int x=2500;x>=1;x--) {
												        	if(x%SUI2==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        Thread.sleep(2000);
												        int max3=50;
												        int min3=30;
												        Random random3 = new Random();
												        int SUI3= random3.nextInt(max3)%(max3-min3+1) + min3;
												        for(int x=1;x<=7000;x++) {
												        	if(x%SUI3==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        Thread.sleep(6000);
												        int max4=30;
												        int min4=10;
												        Random random4 = new Random();
												        int SUI4= random4.nextInt(max4)%(max4-min4+1) + min4;
												        for(int x=7000;x>=1;x--) {
												        	if(x%SUI4==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        Thread.sleep(2000);
											      }
											      if(sum == 7) {
											    	    int max1=30;
												        int min1=15;
												        Random random1 = new Random();
												        int SUI1= random1.nextInt(max1)%(max1-min1+1) + min1;
												        
												        int max2=2500;
												        int min2=4000;
												        Random random2 = new Random();
												        int SUI2= random2.nextInt(max2)%(max2-min2+1) + min2;
												        
												        for(int x=1;x<=SUI2;x++) {
												        	if(x%SUI1==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        int max3=10;
												        int min3=6;
												        Random random3 = new Random();
												        int SUI3= random3.nextInt(max3)%(max3-min3+1) + min3;
												        for(int x=SUI2;x>=1;x--) {
												        	if(x%SUI3==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        
												        int max4=25;
												        int min4=10;
												        Random random4 = new Random();
												        int SUI4= random4.nextInt(max4)%(max4-min4+1) + min4;
												        for(int x=1;x<=7000;x++) {
												        	if(x%SUI4==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        int max5=45;
												        int min5=20;
												        Random random5 = new Random();
												        int SUI5= random5.nextInt(max5)%(max5-min5+1) + min5;
												        for(int x=7000;x>=1;x--) {
												        	if(x%SUI5==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        Thread.sleep(3000);
												        
												        int max6=45;
												        int min6=20;
												        Random random6 = new Random();
												        int SUI6= random6.nextInt(max6)%(max6-min6+1) + min6;
												        
												        int max7=4500;
												        int min7=3000;
												        Random random7 = new Random();
												        int SUI7= random7.nextInt(max7)%(max7-min7+1) + min7;
												        for(int x=1;x<=SUI7;x++) {
												        	if(x%SUI6==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
												        Thread.sleep(3000);
												        int max8=45;
												        int min8=30;
												        Random random8 = new Random();
												        int SUI8= random8.nextInt(max8)%(max8-min8+1) + min8;
												        for(int x=SUI7;x>=1;x--) {
												        	if(x%SUI8==0){
												    			js.executeScript("scrollTo(0,"+x+")");
												    		}	
												        }
											      }
											     							    			    		
										}catch (InterruptedException e) {
											System.out.println("浏览产品页面出现加载异常！");
											//设置日期格式
											SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
											// new Date()为获取当前系统时间
											String Time  = df.format(new Date());
											//执行流文件写入
											File f = new File(fail);
											if (f.exists()) {
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product browsing has been abnormal!");
												pw.println("                                       ");

											} else {
												f.createNewFile();
												fw = new FileWriter(f, true);
												pw = new PrintWriter(fw);
												pw.println("Fail    "+Time+"     Product browsing has been abnormal!");
												pw.println("                                       ");
											}
											pw.flush();
											fw.flush();
											pw.close();
											fw.close();  
										}
							    		 try {
								    			
							    			 //执行返回所需要的工具
								    			Navigation navigation = WB.navigate();
								    			// 找到加入购物车按钮定位
												WebElement AddShoppingCart = WB.findElement(By.id("add-to-cart-button"));
												//执行点击按钮
												AddShoppingCart.click();
												//执行页面返回
												navigation.back();								
									 			Thread.sleep(5000);
												//执行加入心愿单事件
												WebElement AddWishCart = WB.findElement(By.id("add-to-wishlist-button-submit"));
												//执行点击按钮
												AddWishCart.click();
												//设置日期格式
												SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
												// new Date()为获取当前系统时间
												String Time  = df.format(new Date());
												//执行流文件写入
												File f = new File(succeed);
												if (f.exists()) {
													fw = new FileWriter(f, true);
													pw = new PrintWriter(fw);
													pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);

												} else {
													f.createNewFile();
													fw = new FileWriter(f, true);
													pw = new PrintWriter(fw);
													pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);
												}
												pw.flush();
												fw.flush();
												pw.close();
												fw.close();  
												//执行关闭浏览器
												WB.quit();
												
										} catch (InterruptedException e) {
											e.printStackTrace();
										}catch (NoSuchElementException  e) {
											
											try {
												System.out.println("一号NoSuchElementException异常！");
												// 刷新浏览器
											   // WB.navigate().refresh();
							    			    //执行返回所需要的工具
								    			Navigation navigation = WB.navigate();
								    			//返回上一个页面
								    			navigation.forward();
								    			// 找到加入购物车按钮定位
												WebElement AddShoppingCart = WB.findElement(By.id("add-to-cart-button"));
												//执行点击按钮
												AddShoppingCart.click();
												//执行页面返回
												navigation.back();																		
												//执行加入心愿单事件
												WebElement AddWishCart = WB.findElement(By.id("add-to-wishlist-button-submit"));
												//执行点击按钮
												AddWishCart.click();
												//设置日期格式
												SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
												// new Date()为获取当前系统时间
												String Time  = df.format(new Date());
												//执行流文件写入
												File f = new File(succeed);
												if (f.exists()) {
													fw = new FileWriter(f, true);
													pw = new PrintWriter(fw);
													pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);

												} else {
													f.createNewFile();
													fw = new FileWriter(f, true);
													pw = new PrintWriter(fw);
													pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);
												}
												pw.flush();
												fw.flush();
												pw.close();
												fw.close();  
												//执行关闭浏览器
												WB.quit();
											} catch (NoSuchElementException e2) {
												
												try {
																						
								    			    //执行返回所需要的工具
									    			Navigation navigation = WB.navigate();
									    			//返回上一个页面
									    			navigation.forward();
									    			// 找到加入购物车按钮定位
													WebElement AddShoppingCart = WB.findElement(By.id("add-to-cart-button"));
													//执行点击按钮
													AddShoppingCart.click();
													//执行页面返回
													navigation.back();																		
													//执行加入心愿单事件
													WebElement AddWishCart = WB.findElement(By.id("add-to-wishlist-button-submit"));
													//执行点击按钮
													AddWishCart.click();
													//设置日期格式
													SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
													// new Date()为获取当前系统时间
													String Time  = df.format(new Date());
													//执行流文件写入
													File f = new File(succeed);
													if (f.exists()) {
														fw = new FileWriter(f, true);
														pw = new PrintWriter(fw);
														pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);

													} else {
														f.createNewFile();
														fw = new FileWriter(f, true);
														pw = new PrintWriter(fw);
														pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);
													}
													pw.flush();
													fw.flush();
													pw.close();
													fw.close();  
													//执行关闭浏览器
													WB.quit();
												} catch (NoSuchElementException e3) {
													try {
																					
									    			    //执行返回所需要的工具
										    			Navigation navigation = WB.navigate();
										    			//返回上一个页面
										    			navigation.forward();
										    			// 找到加入购物车按钮定位
														WebElement AddShoppingCart = WB.findElement(By.id("add-to-cart-button"));
														//执行点击按钮
														AddShoppingCart.click();
														//执行页面返回
														navigation.back();																		
														//执行加入心愿单事件
														WebElement AddWishCart = WB.findElement(By.id("add-to-wishlist-button-submit"));
														//执行点击按钮
														AddWishCart.click();
														//设置日期格式
														SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
														// new Date()为获取当前系统时间
														String Time  = df.format(new Date());
														//执行流文件写入
														File f = new File(succeed);
														if (f.exists()) {
															fw = new FileWriter(f, true);
															pw = new PrintWriter(fw);
															pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);

														} else {
															f.createNewFile();
															fw = new FileWriter(f, true);
															pw = new PrintWriter(fw);
															pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);
														}
														pw.flush();
														fw.flush();
														pw.close();
														fw.close();  
														//执行关闭浏览器
														WB.quit();
													} catch (NoSuchElementException e4) {
														try {
																									
										    			    //执行返回所需要的工具
											    			Navigation navigation = WB.navigate();
											    			//返回上一个页面
											    			navigation.forward();
											    			// 找到加入购物车按钮定位
															WebElement AddShoppingCart = WB.findElement(By.id("add-to-cart-button"));
															//执行点击按钮
															AddShoppingCart.click();
															//执行页面返回
															navigation.back();																		
															//执行加入心愿单事件
															WebElement AddWishCart = WB.findElement(By.id("add-to-wishlist-button-submit"));
															//执行点击按钮
															AddWishCart.click();
															//设置日期格式
															SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
															// new Date()为获取当前系统时间
															String Time  = df.format(new Date());
															//执行流文件写入
															File f = new File(succeed);
															if (f.exists()) {
																fw = new FileWriter(f, true);
																pw = new PrintWriter(fw);
																pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);

															} else {
																f.createNewFile();
																fw = new FileWriter(f, true);
																pw = new PrintWriter(fw);
																pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);
															}
															pw.flush();
															fw.flush();
															pw.close();
															fw.close();  
															//执行关闭浏览器
															WB.quit();
														} catch (NoSuchElementException e5) {
															try {
																										
											    			    //执行返回所需要的工具
												    			Navigation navigation = WB.navigate();
												    			//返回上一个页面
												    			navigation.forward();
												    			// 找到加入购物车按钮定位
																WebElement AddShoppingCart = WB.findElement(By.id("add-to-cart-button"));
																//执行点击按钮
																AddShoppingCart.click();
																//执行页面返回
																navigation.back();																		
																//执行加入心愿单事件
																WebElement AddWishCart = WB.findElement(By.id("add-to-wishlist-button-submit"));
																//执行点击按钮
																AddWishCart.click();
																//设置日期格式
																SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
																// new Date()为获取当前系统时间
																String Time  = df.format(new Date());
																//执行流文件写入
																File f = new File(succeed);
																if (f.exists()) {
																	fw = new FileWriter(f, true);
																	pw = new PrintWriter(fw);
																	pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);

																} else {
																	f.createNewFile();
																	fw = new FileWriter(f, true);
																	pw = new PrintWriter(fw);
																	pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);
																}
																pw.flush();
										 						fw.flush();
																pw.close();
																fw.close();  
																//执行关闭浏览器
																WB.quit();
															} catch (NoSuchElementException e6) {
																try {
																											
												    			    //执行返回所需要的工具
													    			Navigation navigation = WB.navigate();
													    			//返回上一个页面
													    			navigation.forward();
													    			// 找到加入购物车按钮定位
																	WebElement AddShoppingCart = WB.findElement(By.id("add-to-cart-button"));
																	//执行点击按钮
																	AddShoppingCart.click();
																	//执行页面返回
																	navigation.back();																		
																	//执行加入心愿单事件
																	WebElement AddWishCart = WB.findElement(By.id("add-to-wishlist-button-submit"));
																	//执行点击按钮
																	AddWishCart.click();
																	//设置日期格式
																	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
																	// new Date()为获取当前系统时间
																	String Time  = df.format(new Date());
																	//执行流文件写入
																	File f = new File(succeed);
																	if (f.exists()) {
																		fw = new FileWriter(f, true);
																		pw = new PrintWriter(fw);
																		pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);

																	} else {
																		f.createNewFile();
																		fw = new FileWriter(f, true);
																		pw = new PrintWriter(fw);
																		pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);
																	}
																	pw.flush();
																	fw.flush();
																	pw.close();
																	fw.close();  
																	//执行关闭浏览器
																	WB.quit();
																} catch (NoSuchElementException e7) {
																	try {
																														
													    			    //执行返回所需要的工具
														    			Navigation navigation = WB.navigate();
														    			//返回上一个页面
														    			navigation.forward();
														    			// 找到加入购物车按钮定位
																		WebElement AddShoppingCart = WB.findElement(By.id("add-to-cart-button"));
																		//执行点击按钮
																		AddShoppingCart.click();
																		//执行页面返回
																		navigation.back();																		
																		//执行加入心愿单事件
																		WebElement AddWishCart = WB.findElement(By.id("add-to-wishlist-button-submit"));
																		//执行点击按钮
																		AddWishCart.click();
																		//设置日期格式
																		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
																		// new Date()为获取当前系统时间
																		String Time  = df.format(new Date());
																		//执行流文件写入
																		File f = new File(succeed);
																		if (f.exists()) {
																			fw = new FileWriter(f, true);
																			pw = new PrintWriter(fw);
																			pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);

																		} else {
																			f.createNewFile();
																			fw = new FileWriter(f, true);
																			pw = new PrintWriter(fw);
																			pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);
																		}
																		pw.flush();
																		fw.flush();
																		pw.close();
																		fw.close();  
																		//执行关闭浏览器
																		WB.quit();
																	} catch (NoSuchElementException e8) {
																		try {
																																
														    			    //执行返回所需要的工具
															    			Navigation navigation = WB.navigate();
															    			//返回上一个页面
															    			navigation.forward();
															    			// 找到加入购物车按钮定位
																			WebElement AddShoppingCart = WB.findElement(By.id("add-to-cart-button"));
																			//执行点击按钮
																			AddShoppingCart.click();
																			//执行页面返回
																			navigation.back();																		
																			//执行加入心愿单事件
																			WebElement AddWishCart = WB.findElement(By.id("add-to-wishlist-button-submit"));
																			//执行点击按钮
																			AddWishCart.click();
																			//设置日期格式
																			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
																			// new Date()为获取当前系统时间
																			String Time  = df.format(new Date());
																			//执行流文件写入
																			File f = new File(succeed);
																			if (f.exists()) {
																				fw = new FileWriter(f, true);
																				pw = new PrintWriter(fw);
																				pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);

																			} else {
																				f.createNewFile();
																				fw = new FileWriter(f, true);
																				pw = new PrintWriter(fw);
																				pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);
																			}
																			pw.flush();
																			fw.flush();
																			pw.close();
																			fw.close();  
																			//执行关闭浏览器
																			WB.quit();
																		} catch (NoSuchElementException e9) {
																			try {
																																			
															    			    //执行返回所需要的工具
																    			Navigation navigation = WB.navigate();
																    			//返回上一个页面
																    			navigation.forward();
																    			// 找到加入购物车按钮定位
																				WebElement AddShoppingCart = WB.findElement(By.id("add-to-cart-button"));
																				//执行点击按钮
																				AddShoppingCart.click();
																				//执行页面返回
																				navigation.back();																		
																				//执行加入心愿单事件
																				WebElement AddWishCart = WB.findElement(By.id("add-to-wishlist-button-submit"));
																				//执行点击按钮
																				AddWishCart.click();
																				//设置日期格式
																				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
																				// new Date()为获取当前系统时间
																				String Time  = df.format(new Date());
																				//执行流文件写入
																				File f = new File(succeed);
																				if (f.exists()) {
																					fw = new FileWriter(f, true);
																					pw = new PrintWriter(fw);
																					pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);

																				} else {
																					f.createNewFile();
																					fw = new FileWriter(f, true);
																					pw = new PrintWriter(fw);
																					pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);
																				}
																				pw.flush();
																				fw.flush();
																				pw.close();
																				fw.close();  
																				//执行关闭浏览器
																				WB.quit();
																			} catch (NoSuchElementException e10) {
																				try {
																					System.out.println("NoSuchElementException异常！");																	
																    			    //执行返回所需要的工具
																	    			Navigation navigation = WB.navigate();
																	    			//返回上一个页面
																	    			navigation.forward();
																	    			// 找到加入购物车按钮定位
																					WebElement AddShoppingCart = WB.findElement(By.id("add-to-cart-button"));
																					//执行点击按钮
																					AddShoppingCart.click();
																					//执行页面返回
																					navigation.back();																		
																					//执行加入心愿单事件
																					WebElement AddWishCart = WB.findElement(By.id("add-to-wishlist-button-submit"));
																					//执行点击按钮
																					AddWishCart.click();
																					//设置日期格式
																					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
																					// new Date()为获取当前系统时间
																					String Time  = df.format(new Date());
																					//执行流文件写入
																					File f = new File(succeed);
																					if (f.exists()) {
																						fw = new FileWriter(f, true);
																						pw = new PrintWriter(fw);
																						pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);

																					} else {
																						f.createNewFile();
																						fw = new FileWriter(f, true);
																						pw = new PrintWriter(fw);
																						pw.println("Succeed    "+Time+"   "+(DataRecords++)+"   Number of times      "+KeyWords);
																					}
																					pw.flush();
																					fw.flush();
																					pw.close();
																					fw.close();  
																					//执行关闭浏览器
																					WB.quit();
																				} catch (NoSuchElementException e11) {
																					System.out.println("已无力回天！BYE BYE ！！！");
																					//执行关闭浏览器
																					WB.quit();
																					//设置日期格式
																					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
																					// new Date()为获取当前系统时间
																					String Time  = df.format(new Date());
																					//执行流文件写入
																					File f = new File(fail);
																					if (f.exists()) {
																						fw = new FileWriter(f, true);
																						pw = new PrintWriter(fw);
																						pw.println("Fail    "+Time+"   "+(OnFailure++)+"   Number of times");
																						pw.println("                                                      ");

																					} else {
																						f.createNewFile();
																						fw = new FileWriter(f, true);
																						pw = new PrintWriter(fw);
																						pw.println("Fail    "+Time+"   "+(OnFailure++)+"   Number of times");
																						pw.println("                                                      ");
																					}
																					pw.flush();
																					fw.flush();
																					pw.close();
																					fw.close();  
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}										
					                  }
				               }
							    	//设置日期格式
									SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
									// new Date()为获取当前系统时间
									String Time  = df.format(new Date());
									//执行流文件写入
									File f = new File(succeed);
									if (f.exists()) {
										fw = new FileWriter(f, true);
										pw = new PrintWriter(fw);
										pw.println("Succeed    "+Time+"   "+" A cookie has been executed   "+(BigSum++)+"   Number of times");
										pw.println("                                                    ");

									} else {
										f.createNewFile();
										fw = new FileWriter(f, true);
										pw = new PrintWriter(fw);
										pw.println("Succeed    "+Time+"   "+" A cookie has been executed   "+(BigSum++)+"   Number of times");
										pw.println("                                                    ");
									}
									pw.flush();
									fw.flush();
									pw.close();
									fw.close();  
				    }
				  	    
			}
				try {
					System.err.println("系统分配任务已执行完毕.....");
					Thread.sleep(3000);
					System.err.println("程序即将终止.....");
					Thread.sleep(3000);
					System.err.println("期待下次为您服务.....");
				} catch (InterruptedException e) { 
					e.printStackTrace();
				}
	}

}

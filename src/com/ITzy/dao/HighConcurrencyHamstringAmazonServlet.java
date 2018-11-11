package com.ITzy.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ITzy.entity.BIG;
import com.ITzy.entity.FilesName;
import com.ITzy.entity.FirefoxCookies;
import com.ITzy.entity.HighConcurrency;
import com.ITzy.utils.FirefoxReading;
import com.ITzy.utils.IPAgency;
import com.sun.org.apache.bcel.internal.classfile.Field;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;  

public class HighConcurrencyHamstringAmazonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<FirefoxCookies> Firefox = null;
	public static int  quantity = 0;
	public static String   BrandLinks ="";
	public static int DataRecords = 1;   
	public static int OnFailure = 1;
	public static String Link = null;
	public static int BigSum = 1;
	public static int WarningLights = 1; 
	public static String  KeyWords = null;
    List<WebDriver>  ControlExecutive  = new ArrayList<WebDriver>();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NoSuchElementException {
		FileWriter fw = null;
		PrintWriter pw = null;
		//获取文件名字
		List<FilesName> FilesName = (List<FilesName>) request.getAttribute("FilesName");
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
		
		for (Integer IG : TheLengthOfTheData) {
			String BRD = "";
		    quantity = IG;		  
		    System.out.println(quantity);
		    //拿到品牌的每一条
			
		    for(int x=0;x<Multithreading.size();x++) {
		    	BIG testone = Multithreading.get(WarningLights-1);		    	
		    	BRD = testone.getFUCK1()+"@@@"+testone.getFUCK2()+"@@@"+testone.getFUCK3()+"@@@"+testone.getFUCK4()+"@@@"+testone.getFUCK5()+"@@@"+testone.getFUCK6();
		    	System.out.println(BRD);
		    	break;
 		    }
		
		    //拿到链接的地址
         
		    for(int x=0;x<Multithreading.size();x++) {
		    	BIG testtwo = Multithreading.get(WarningLights-1);
		    	Link = testtwo.getURL();
	          	System.out.println(Link);
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
		
		    
			for (FilesName FN : FilesName) {

				String name = FN.getFiles();
				System.out.println(name);
				
				//拼接URL地址
				String File = URL + "\\" + name;
				// 获取该文件夹的所有cookies数据
				Firefox = FirefoxReading.ReadingFiles(File);
				
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
		     //初始化窗口WebDriver 的属性
			 WebDriver FOXS1 = null;
			 WebDriver FOXS2 = null;
			 WebDriver FOXS3 = null;
			 WebDriver FOXS4 = null;
			 WebDriver FOXS5 = null;
			 WebDriver FOXS6 = null;				
		     //自动默认初始化List集合(开启火狐的集合)
			 List<WebDriver> FFOX =  new ArrayList<WebDriver>();
			 //自动默认初始化List集合()
			 List<WebDriver>  ControlExecutive  = new ArrayList<WebDriver>();
			  //判断开启的窗口个数
			  if( 1 == quantity) {
					//开启加载火狐浏览器
					WebDriver FXdriver1 = new FirefoxDriver();	
				     //将浏览器最大化
					FXdriver1.manage().window().maximize();  
					FFOX.add(FXdriver1);					
			  } 
              if( 2 == quantity) {
            	    //开启加载火狐浏览器
					WebDriver FXdriver1 = new FirefoxDriver();				
					WebDriver FXdriver2 = new FirefoxDriver();	
					  //将浏览器最大化
					FXdriver1.manage().window().maximize();  
					  //将浏览器最大化
					FXdriver2.manage().window().maximize();  
					FFOX.add(FXdriver1);
					FFOX.add(FXdriver2);
			  } 
              if( 3 == quantity) {
            	   //开启加载火狐浏览器
            	    WebDriver FXdriver1 = new FirefoxDriver();           	  
					WebDriver FXdriver2 = new FirefoxDriver();					
					WebDriver FXdriver3 = new FirefoxDriver();	
					  //将浏览器最大化
					FXdriver1.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver2.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver3.manage().window().maximize(); 

					FFOX.add(FXdriver1);
					FFOX.add(FXdriver2);
					FFOX.add(FXdriver3);				
              } 
              if( 4 == quantity) {
            	   //开启加载火狐浏览器
            	    WebDriver FXdriver1 = new FirefoxDriver();            	   
					WebDriver FXdriver2 = new FirefoxDriver();					
					WebDriver FXdriver3 = new FirefoxDriver();					
					WebDriver FXdriver4 = new FirefoxDriver();	
					  //将浏览器最大化
					FXdriver1.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver2.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver3.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver4.manage().window().maximize(); 
					FFOX.add(FXdriver1);
					FFOX.add(FXdriver2);
					FFOX.add(FXdriver3);
					FFOX.add(FXdriver4);					
              } 
              if( 5 == quantity) {
            	    //开启加载火狐浏览器
            	    WebDriver FXdriver1 = new FirefoxDriver();           	   
					WebDriver FXdriver2 = new FirefoxDriver();					
					WebDriver FXdriver3 = new FirefoxDriver();					
					WebDriver FXdriver4 = new FirefoxDriver();					
					WebDriver FXdriver5 = new FirefoxDriver();
					  //将浏览器最大化
					FXdriver1.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver2.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver3.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver4.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver5.manage().window().maximize(); 
					FFOX.add(FXdriver1);
					FFOX.add(FXdriver2);
					FFOX.add(FXdriver3);
					FFOX.add(FXdriver4);
					FFOX.add(FXdriver5);					
              } 
              if( 6 == quantity) {
            	    //开启加载火狐浏览器
            	    WebDriver FXdriver1 = new FirefoxDriver();       	   
					WebDriver FXdriver2 = new FirefoxDriver();				
					WebDriver FXdriver3 = new FirefoxDriver();				
					WebDriver FXdriver4 = new FirefoxDriver();					
					WebDriver FXdriver5 = new FirefoxDriver();					
					WebDriver FXdriver6 = new FirefoxDriver();	
					  //将浏览器最大化
					FXdriver1.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver2.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver3.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver4.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver5.manage().window().maximize(); 
					  //将浏览器最大化
					FXdriver6.manage().window().maximize(); 
					FFOX.add(FXdriver1);
					FFOX.add(FXdriver2);
					FFOX.add(FXdriver3);
					FFOX.add(FXdriver4);
					FFOX.add(FXdriver5);
					FFOX.add(FXdriver6);				
              } 
              
              //加强for循环控制窗口导入Cookies
              for (Object OB : FFOX) {
					WebDriver FOX = (WebDriver)	OB;
					FOX.get(GUOJIA);
					    //循环Cookies，并导入到每个窗口中。       
						for (FirefoxCookies FFC : Firefox) {
							Cookie Cookies = new Cookie(FFC.getName(), FFC.getValue());
							FOX.manage().addCookie(Cookies);
						}
						FOX.get("www.baidu.com");
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {							
							e.printStackTrace();
						}
						FOX.get(GUOJIA); 									
				}                             
                  //控制窗口跳转到制定的url            
            	  for (Object OB : FFOX) {
            		  try {
            			  WebDriver FOXS = (WebDriver)OB;
                		  FOXS.get(Link); 
                		    							
					} catch (Exception e) {								
						System.out.println("有毒");
					}
            	  }           	 
            	  String[] brand = BRD.split("@@@");           	            	
			    	 //进行品牌的多少判断
			    	 if(1 == quantity) {	
			    		  //控制窗口跳跃到指定的品牌链接
					     for(int x=0;x<FFOX.size();x++) {
					    	 
					    	 Object DV1 = FFOX.get(0);
					    	 
					    	 //进行转化
					    	 FOXS1 = (WebDriver)DV1;
					     }
					     try {
					    	 for(int x=0;x<=0;x++) {
					    			if(x==0) {
					    				WebElement aboutLink1 = FOXS1.findElement(By.partialLinkText(brand[0]));
						    			aboutLink1.click();							    			
					    			}					    				    			
					    		}
						}  catch (NoSuchElementException e) {
							System.out.println("加载异常！找不到指定产品名！");
						} 
					    ControlExecutive.add(FOXS1);
			    	 }if(2 == quantity) {	
			    		  //控制窗口跳跃到指定的品牌链接
					     for(int x=0;x<FFOX.size();x++) {
					    	 
					    	 Object DV1 = FFOX.get(0);
					    	 Object DV2 = FFOX.get(1);
					    	 
					    	 //进行转化
					    	 FOXS1 = (WebDriver)DV1;
					    	 FOXS2 = (WebDriver)DV2;
					     }	
					     try {
					    	 for(int x=0;x<=1;x++) {
					    		 if(x==0) {
					    			 WebElement aboutLink1 = FOXS1.findElement(By.partialLinkText(brand[0]));
						    		 aboutLink1.click();						    		
					    		 }if(x==1) {
					    			 WebElement aboutLink2 = FOXS2.findElement(By.partialLinkText(brand[1]));
						    		 aboutLink2.click();						    		
					    		 }					    							    		
					    	 }
						} catch (NoSuchElementException e) {
							System.out.println("加载异常！找不到指定产品名！");
						} 
					    ControlExecutive.add(FOXS1);
					    ControlExecutive.add(FOXS2);
			    	 }if(3 == quantity) {			    		
			    		  //控制窗口跳跃到指定的品牌链接
					     for(int x=0;x<FFOX.size();x++) {
					    	 
					    	 Object DV1 = FFOX.get(0);
					    	 Object DV2 = FFOX.get(1);
					    	 Object DV3 = FFOX.get(2);
					    	 
					    	 //进行转化
					    	 FOXS1 = (WebDriver)DV1;
					    	 FOXS2 = (WebDriver)DV2;
					    	 FOXS3 = (WebDriver)DV3;
					     }	
					     try {
					    	 for(int x=0;x<=2;x++) {
					    		 if(x==0) {
					    			 WebElement aboutLink1 = FOXS1.findElement(By.partialLinkText(brand[0]));
						    		 aboutLink1.click();						    		
					    		 } if(x==1) {
					    			 WebElement aboutLink2 = FOXS2.findElement(By.partialLinkText(brand[1]));
						    		 aboutLink2.click();						    		
					    		 } if(x==2) {
					    			 WebElement aboutLink3 = FOXS3.findElement(By.partialLinkText(brand[2]));
						    		 aboutLink3.click();						    		
					    		 }					    							    							    		
					    	 }
						} catch (NoSuchElementException e) {
							System.out.println("加载异常！找不到指定产品名！");
						} 
					    ControlExecutive.add(FOXS1);
					    ControlExecutive.add(FOXS2);
					    ControlExecutive.add(FOXS3);
			    	 }if(4 == quantity) {			    		
			    		  //控制窗口跳跃到指定的品牌链接
					     for(int x=0;x<FFOX.size();x++) {
					    	 
					    	 Object DV1 = FFOX.get(0);
					    	 Object DV2 = FFOX.get(1);
					    	 Object DV3 = FFOX.get(2);
					    	 Object DV4 = FFOX.get(3);
					    	 
					    	 //进行转化
					    	 FOXS1 = (WebDriver)DV1;
					    	 FOXS2 = (WebDriver)DV2;
					    	 FOXS3 = (WebDriver)DV3;
					    	 FOXS4 = (WebDriver)DV4;
					     }	
					     try {
					    	 for(int x=0;x<=3;x++) {
					    		 if(x==0) {
					    			 WebElement aboutLink1 = FOXS1.findElement(By.partialLinkText(brand[0]));
						    		 aboutLink1.click();						    		
					    		 }
					    		 if(x==1) {
					    			 WebElement aboutLink2 = FOXS2.findElement(By.partialLinkText(brand[1]));
						    		 aboutLink2.click();						    		
					    		 }
                                 if(x==2) {
                                	 WebElement aboutLink3 = FOXS3.findElement(By.partialLinkText(brand[2]));
    					    		 aboutLink3.click();    					    		
					    		 }
                                 if(x==3) {
                                	 WebElement aboutLink4 = FOXS4.findElement(By.partialLinkText(brand[3]));
    					    		 aboutLink4.click();   					    		
                                 }					    							    		 					    		
					    	 }
						} catch (NoSuchElementException e) {
							System.out.println("加载异常！找不到指定产品名！");
						} 
					     ControlExecutive.add(FOXS1);
					     ControlExecutive.add(FOXS2);
					     ControlExecutive.add(FOXS3);
					     ControlExecutive.add(FOXS4);
			    	 }if(5 == quantity) {			    		
			    		  //控制窗口跳跃到指定的品牌链接
					     for(int x=0;x<FFOX.size();x++) {
					    	 
					    	 Object DV1 = FFOX.get(0);
					    	 Object DV2 = FFOX.get(1);
					    	 Object DV3 = FFOX.get(2);
					    	 Object DV4 = FFOX.get(3);
					    	 Object DV5 = FFOX.get(4);
					    	 
					    	 //进行转化
					    	 FOXS1 = (WebDriver)DV1;
					    	 FOXS2 = (WebDriver)DV2;
					    	 FOXS3 = (WebDriver)DV3;
					    	 FOXS4 = (WebDriver)DV4;
					    	 FOXS5 = (WebDriver)DV5;
					     }	
					     try {
					    	 for(int x=0;x<=4;x++) {
					    		 if(x==0) {
					    			 WebElement aboutLink1 = FOXS1.findElement(By.partialLinkText(brand[0]));
						    		 aboutLink1.click();						    		
					    		 }if(x==1) {
					    			 WebElement aboutLink2 = FOXS2.findElement(By.partialLinkText(brand[1]));
						    		 aboutLink2.click();						    		
					    		 }if(x==2) {
					    			 WebElement aboutLink3 = FOXS3.findElement(By.partialLinkText(brand[2]));
						    		 aboutLink3.click();						    		
					    		 }if(x==3) {
					    			 WebElement aboutLink4 = FOXS4.findElement(By.partialLinkText(brand[3]));
						    		 aboutLink4.click();						    		 
					    		 }if(x==4) {
					    			 WebElement aboutLink5 = FOXS5.findElement(By.partialLinkText(brand[4]));
						    		 aboutLink5.click();						    		
					    		 }					    								    		 					    		 					    		 					    		
					    	 }
						}catch (NoSuchElementException e){
							System.out.println("加载异常！找不到指定产品名！");
						} 
					     ControlExecutive.add(FOXS1);
					     ControlExecutive.add(FOXS2);
					     ControlExecutive.add(FOXS3);
					     ControlExecutive.add(FOXS4);
					     ControlExecutive.add(FOXS5);
			    	 }if(6 == quantity) {			    		
			    		  //控制窗口跳跃到指定的品牌链接
					     for(int x=0;x<FFOX.size();x++) {
					    	 
					    	 Object DV1 = FFOX.get(0);
					    	 Object DV2 = FFOX.get(1);
					    	 Object DV3 = FFOX.get(2);
					    	 Object DV4 = FFOX.get(3);
					    	 Object DV5 = FFOX.get(4);
					    	 Object DV6 = FFOX.get(5);
					    	 
					    	 //进行转化
					    	 FOXS1 = (WebDriver)DV1;
					    	 FOXS2 = (WebDriver)DV2;
					    	 FOXS3 = (WebDriver)DV3;
					    	 FOXS4 = (WebDriver)DV4;
					    	 FOXS5 = (WebDriver)DV5;
					    	 FOXS6 = (WebDriver)DV6;
					     }	
					     try {
					    	 for(int x=0;x<=5;x++) {
					    		    if(x==0) {
					    			     WebElement aboutLink1 = FOXS1.findElement(By.partialLinkText(brand[0]));
						    		     aboutLink1.click();						    		    
									}if(x==1) {
										 WebElement aboutLink2 = FOXS2.findElement(By.partialLinkText(brand[1]));
							    		 aboutLink2.click();							    		 
									}if(x==2) {
										WebElement aboutLink3 = FOXS3.findElement(By.partialLinkText(brand[2]));
							    		 aboutLink3.click();							    		
									}if(x==3) {
										 WebElement aboutLink4 = FOXS4.findElement(By.partialLinkText(brand[3]));
							    		 aboutLink4.click();							    		 
									}if(x==4) {
										WebElement aboutLink5 = FOXS5.findElement(By.partialLinkText(brand[4]));
							    		aboutLink5.click();							    		
									}if(x==5) {
										WebElement aboutLink6 = FOXS6  .findElement(By.partialLinkText(brand[5]));
							    		aboutLink6.click();							    		
									}					    							    							    		 					    							    		 					    		
					    	 }							
						}catch (NoSuchElementException e){
							System.out.println("加载异常！找不到指定产品名！");
						} 
					     ControlExecutive.add(FOXS1);
					     ControlExecutive.add(FOXS2);
					     ControlExecutive.add(FOXS3);
					     ControlExecutive.add(FOXS4);
					     ControlExecutive.add(FOXS5);
					     ControlExecutive.add(FOXS6);
			    	 }
			    	 
			    	 //增强for循环添加浏览商品
			    	 for (WebDriver WB : ControlExecutive) {
			    		 try {
			    			//获得浏览器主体 
					    		JavascriptExecutor js = (JavascriptExecutor) WB;
					    		
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
							e.printStackTrace();
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
								//执行成功文件写入事件
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
								//执行休眠
								Thread.sleep(6000);
								//执行关闭浏览器
								WB.quit();
								
						} catch (InterruptedException e) {
							e.printStackTrace();
						}catch (NoSuchElementException  e) {
							 try {
								    // 刷新浏览器
								    WB.navigate().refresh();
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
									//执行成功文件写入事件
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
									//执行休眠
									Thread.sleep(6000);
									//执行关闭浏览器
									WB.quit();
									
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}catch (NoSuchElementException  e1) {
								 try {
									   // 刷新浏览器
									    WB.navigate().refresh();
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
										//执行成功文件写入事件
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
										//执行休眠
										Thread.sleep(6000);
										//执行关闭浏览器
										WB.quit();
										
								} catch (InterruptedException e11) {
									e11.printStackTrace();
								}catch (NoSuchElementException  e11) {
									 try {
										    // 刷新浏览器
										    WB.navigate().refresh();
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
											//执行成功文件写入事件
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
											//执行休眠
											Thread.sleep(6000);
											//执行关闭浏览器
											WB.quit();
											
									} catch (InterruptedException e111) {
										e111.printStackTrace();
									}catch (NoSuchElementException  e111) {
										 try {
											   // 刷新浏览器
											    WB.navigate().refresh();
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
												//执行成功文件写入事件
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
												//执行休眠
												Thread.sleep(6000);
												//执行关闭浏览器
												WB.quit();
												
										} catch (InterruptedException e1111) {
											e1111.printStackTrace();
										}catch (NoSuchElementException  e1111) {
											 try {
												    // 刷新浏览器
												    WB.navigate().refresh();
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
													//执行成功文件写入事件
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
													//执行休眠
													Thread.sleep(6000);
													//执行关闭浏览器
													WB.quit();
													
											} catch (InterruptedException e11111) {
												e11111.printStackTrace();
											}catch (NoSuchElementException  e11111) {
												 try {
													   // 刷新浏览器
													    WB.navigate().refresh();
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
														//执行成功文件写入事件
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
														//执行休眠
														Thread.sleep(6000);
														//执行关闭浏览器
														WB.quit();
														
												} catch (InterruptedException e111111) {
													e111111.printStackTrace();
												}catch (NoSuchElementException  e111111) {
													 try {
														    // 刷新浏览器
														    WB.navigate().refresh();
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
															//执行成功文件写入事件
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
															//执行休眠
															Thread.sleep(6000);
															//执行关闭浏览器
															WB.quit();
															
													} catch (InterruptedException e1111111) {
														e1111111.printStackTrace();
													}catch (NoSuchElementException  e1111111) {
														 try {
															    // 刷新浏览器
															    WB.navigate().refresh();
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
																//执行成功文件写入事件
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
																//执行休眠
																Thread.sleep(6000);
																//执行关闭浏览器
																WB.quit();
																
														} catch (InterruptedException e11111111) {
															e11111111.printStackTrace();
														}catch (NoSuchElementException  e11111111) {
															 try {
																   // 刷新浏览器
																    WB.navigate().refresh();
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
																	//执行成功文件写入事件
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
																	//执行休眠
																	Thread.sleep(6000);
																	//执行关闭浏览器
																	WB.quit();
																	
															} catch (InterruptedException e111111111) {
																e111111111.printStackTrace();
															}catch (NoSuchElementException  e111111111) {
																System.out.println("已用尽洪荒之力.....");
																//执行失败文件写入事件
																//设置日期格式
																SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
																// new Date()为获取当前系统时间
																String Time  = df.format(new Date());
																// 如果文件存在，则追加内容；如果文件不存在，则创建文件
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
																// 执行关闭浏览器事件
																WB.quit();
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
			
			WarningLights ++;
		}									
	}
}

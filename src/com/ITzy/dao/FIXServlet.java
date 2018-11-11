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
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.NotConnectedException;

import com.ITzy.entity.AllCookie;
import com.ITzy.entity.BIG;
import com.ITzy.entity.FirefoxCookies;
import com.ITzy.entity.NameAndValue;
import com.ITzy.utils.IPAgency;

public class FIXServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int quantity = 0;
	public static String BrandLinks = "";
	public static String Link = null;
	public static int WarningLights = 1;
	public static int DataRecords = 1;
	public static int OnFailure = 1;
	public static int BigSum = 1;
	public static String KeyWords = null;
	public static int x = 0;
	public static FileWriter fw = null;
	public static PrintWriter pw = null;
	public static String succeed = null;
	public static String fail = null;
	public static String Error = null;
    public WebDriver control = null;
    //静态加载切换IP
	public static void SwitchIP(String VPNS) {
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
	}
    //静态加载错误日志写入
	public static void ErrorLogging(String fail ,String Error) throws IOException {
		// 设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// new Date()为获取当前系统时间
		String Time = df.format(new Date());
		// 执行流文件写入
		File f = new File(fail);
		if (f.exists()) {
			fw = new FileWriter(f, true);
			pw = new PrintWriter(fw);
			pw.println("fail    " + Time + "   " + Error);
			pw.println("                                                    ");

		} else {
			f.createNewFile();
			fw = new FileWriter(f, true);
			pw = new PrintWriter(fw);
			pw.println("fail    " + Time + "   " + Error);
			pw.println("                                                    ");
		}
		pw.flush();
		fw.flush();
		pw.close();
		fw.close();
	}
	//静态加载成功日志写入
	public static void SuccessLogging(String succeed) throws IOException {
		// 设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// new Date()为获取当前系统时间
		String Time = df.format(new Date());
		// 执行流文件写入
		File f = new File(succeed);
		if (f.exists()) {
			fw = new FileWriter(f, true);
			pw = new PrintWriter(fw);
			pw.println("Succeed    " + Time + "   " + (DataRecords++)+ "   Number of times      " + KeyWords);

		} else {
			f.createNewFile();
			fw = new FileWriter(f, true);
			pw = new PrintWriter(fw);
			pw.println("Succeed    " + Time + "   " + (DataRecords++)+ "   Number of times      " + KeyWords);
		}
		pw.flush();
		fw.flush();
		pw.close();
		fw.close();
	}
	
	
	//静态加载是否加购物车
	public static void StaticPurchased(WebDriver control,String AddCart,String WishCart) throws IOException {
		if ("是".equals(AddCart)) {
			// 执行返回所需要的工具
			Navigation navigation = control.navigate();
			// 找到加入购物车按钮定位
			WebElement AddShoppingCart = control.findElement(By.id("add-to-cart-button"));
			// 执行点击按钮
			AddShoppingCart.click();
			// 执行页面返回
			navigation.back();
		}
		if ("是".equals(WishCart)) {
			// 执行加入心愿单事件
			WebElement AddWishCart = control.findElement(By.id("add-to-wishlist-button-submit"));
			// 执行点击按钮
			AddWishCart.click();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获取谷歌的 Cookies
		List<List<AllCookie>> CookieS = (List<List<AllCookie>>) request.getAttribute("CookieS");
		int size = CookieS.size() / 2;
		// 获得谷歌浏览器的启动脚本信息
		String US = (String) request.getAttribute("gogle");
		// cookies的长度信息
		System.err.println("长度===" + size);
		// 获取cookies前缀头
		String URL = (String) request.getAttribute("URL");
		// 获取VPN信息
		String VPNS = (String) request.getAttribute("VPNS");
		// 获取网站的网址
		String GUOJIA = (String) request.getAttribute("GUOJIA");
		// 要刷单的产品
		List<BIG> Multithreading = (List<BIG>) request.getAttribute("Multithreading");
		// 刷单要开启的浏览器个数
		List<Integer> TheLengthOfTheData = (List<Integer>) request.getAttribute("TheLengthOfTheData");
		// 日志记录的数据消息（成功和失败记录）
		succeed = (String) request.getAttribute("succeed");
		fail = (String) request.getAttribute("fail");
		// 获取是否加入心愿单和购物车的选着数据
		String AddCart = (String) request.getAttribute("AddCart");
		String WishCart = (String) request.getAttribute("WishCart");

		for (Integer IG : TheLengthOfTheData) {
			String BRD = "";
			quantity = IG;
			// 拿到品牌的每一条
			for (int x = 0; x < Multithreading.size(); x++) {
				BIG testone = Multithreading.get(WarningLights - 1);
				BRD = testone.getFUCK1() + "@@@" + testone.getFUCK2() + "@@@" + testone.getFUCK3() + "@@@"
						+ testone.getFUCK4() + "@@@" + testone.getFUCK5() + "@@@" + testone.getFUCK6();
				break;
			}
			// 拿到链接的地址
			for (int x = 0; x < Multithreading.size(); x++) {
				BIG testtwo = Multithreading.get(WarningLights - 1);
				Link = testtwo.getURL();
				String[] Key = Link.split("keywords=");
				for (int z = 0; z < Key.length; z++) {
					if (z == 1) {
						String[] words = Key[1].split("&");
						KeyWords = words[0];
					}
				}
				break;
			}

			// 初始化窗口谷歌WebDriver 的属性
			WebDriver GOG1 = null;
			WebDriver GOG2 = null;
			WebDriver GOG3 = null;
			WebDriver GOG4 = null;
			WebDriver GOG5 = null;
			WebDriver GOG6 = null;
			WebDriver GOGdriver1 = null;
			WebDriver GOGdriver2 = null;
			WebDriver GOGdriver3 = null;
			WebDriver GOGdriver4 = null;
			WebDriver GOGdriver5 = null;
			WebDriver GOGdriver6 = null;
			System.setProperty("webdriver.chrome.driver", US);
			// 自动默认初始化List集合(浏览器的集合信息)
			List<WebDriver> GOG = new ArrayList<WebDriver>();
			// 判断开启的窗口个数
			if (1 == quantity) {
				try {
					// 开启加载谷歌浏览器
				    GOGdriver1 = new FirefoxDriver();
					//GOGdriver1 = new ChromeDriver();
					GOGdriver1.manage().window().maximize();
					GOG.add(GOGdriver1);
				} catch (Exception e) {
					System.out.println("浏览器开启异常");
					Error = "The browser opens the exception";
					ErrorLogging( fail,Error);
					
				}

			}
			if (2 == quantity) {
				try {
					// 开启加载谷歌浏览器
					
					 GOGdriver1 = new FirefoxDriver(); 
					 GOGdriver2 = new FirefoxDriver();
					 
					/*GOGdriver1 = new ChromeDriver();
					GOGdriver2 = new ChromeDriver();*/
					GOGdriver1.manage().window().maximize();
					GOGdriver2.manage().window().maximize();

					GOG.add(GOGdriver1);
					GOG.add(GOGdriver2);
				} catch (Exception e) {
					System.out.println("浏览器开启异常");
					Error = "The browser opens the exception";
					ErrorLogging( fail,Error);
				}
			}
			if (3 == quantity) {
				try {
					// 开启加载谷歌浏览器
					
					  GOGdriver1 = new FirefoxDriver(); 
					  GOGdriver2 = new FirefoxDriver();
					  GOGdriver3 = new FirefoxDriver();
					 
					/*GOGdriver1 = new ChromeDriver();
					GOGdriver2 = new ChromeDriver();
					GOGdriver3 = new ChromeDriver();*/
					GOGdriver1.manage().window().maximize();
					GOGdriver2.manage().window().maximize();
					GOGdriver3.manage().window().maximize();

					GOG.add(GOGdriver1);
					GOG.add(GOGdriver2);
					GOG.add(GOGdriver3);
				} catch (Exception e2) {
					System.out.println("浏览器开启异常");
					Error = "The browser opens the exception";
					ErrorLogging( fail,Error);
				}
			}
			if (4 == quantity) {
				try {
					// 开启加载谷歌浏览器
					
					 GOGdriver1 = new FirefoxDriver(); 
					 GOGdriver2 = new FirefoxDriver();
					 GOGdriver3 = new FirefoxDriver(); 
					 GOGdriver4 = new FirefoxDriver();
					 

					/*GOGdriver1 = new ChromeDriver();
					GOGdriver2 = new ChromeDriver();
					GOGdriver3 = new ChromeDriver();
					GOGdriver4 = new ChromeDriver();*/
					GOGdriver1.manage().window().maximize();
					GOGdriver2.manage().window().maximize();
					GOGdriver3.manage().window().maximize();
					GOGdriver4.manage().window().maximize();

					GOG.add(GOGdriver1);
					GOG.add(GOGdriver2);
					GOG.add(GOGdriver3);
					GOG.add(GOGdriver4);
				} catch (Exception e) {
					System.out.println("浏览器开启异常");
					Error = "The browser opens the exception";
					ErrorLogging( fail,Error);
				}
			}
			if (5 == quantity) {
				try {
					// 开启加载谷歌浏览器
					
					 GOGdriver1 = new FirefoxDriver();
					 GOGdriver2 = new FirefoxDriver();
					 GOGdriver3 = new FirefoxDriver();
					 GOGdriver4 = new FirefoxDriver();
					 GOGdriver5 = new FirefoxDriver();
					 

					/*GOGdriver1 = new ChromeDriver();
					GOGdriver2 = new ChromeDriver();
					GOGdriver3 = new ChromeDriver();
					GOGdriver4 = new ChromeDriver();
					GOGdriver5 = new ChromeDriver();*/
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
				} catch (Exception e) {
					System.out.println("浏览器开启异常");
					Error = "The browser opens the exception";
					ErrorLogging( fail,Error);
				}
			}
			if (6 == quantity) {
				try {
					// 开启加载谷歌浏览器
					
					  GOGdriver1 = new FirefoxDriver();
					  GOGdriver2 = new FirefoxDriver();
					  GOGdriver3 = new FirefoxDriver();
					  GOGdriver4 = new FirefoxDriver();
					  GOGdriver5 = new FirefoxDriver();
					  GOGdriver6 = new FirefoxDriver();
					 

					/*GOGdriver1 = new ChromeDriver();
					GOGdriver2 = new ChromeDriver();
					GOGdriver3 = new ChromeDriver();
					GOGdriver4 = new ChromeDriver();
					GOGdriver5 = new ChromeDriver();
					GOGdriver6 = new ChromeDriver();*/
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

				} catch (Exception e) {
					System.out.println("浏览器开启异常");
					Error = "The browser opens the exception";
					ErrorLogging( fail,Error);
				}
			}

			// 遍历谷歌的cookies,小cookies的迭代
			for (List<AllCookie> list : CookieS) {
				// 记录增长执行次数
				x++;
				System.out.println("执行次数 = " + x);
				// 调用切换IP代码
				SwitchIP(VPNS);
				// 自动默认初始化List集合(控制加入cookies的浏览器)
				List<WebDriver> ControlExecutive = new ArrayList<WebDriver>();
				// 加强for循环控制窗口导入Cookies
				for (Object OB : GOG) {
					WebDriver Google = (WebDriver) OB;
					try {
						// 跳转到国家的主页面
						Google.get(GUOJIA);
					} catch (TimeoutException e) {
						System.err.println("亚马逊主页面加载超时......");
						// 调用切换IP代码
						SwitchIP(VPNS);
						
						Error = "Amazon main page load timeouts";
						ErrorLogging( fail,Error);
						try {
							// 刷新浏览器
							((WebDriver) Google).navigate().refresh();
							/*Google.get(GUOJIA);*/
						} catch (TimeoutException e2) {
							System.err.println("亚马逊主页面加载超时......");
							// 调用切换IP代码
							SwitchIP(VPNS);
							// 刷新浏览器
							((WebDriver) Google).navigate().refresh();
							Error = "Amazon main page load timeouts";
							ErrorLogging( fail,Error);
						} catch (Exception e2) {
							System.err.println("网页加载异常超时....");						
							Error = "Page load exception timeout";
							ErrorLogging( fail,Error);
						}
					}
					try {
						// 导入cookies信息
						for (AllCookie nameAndValue : list) {
							Cookie Cookies = new Cookie(nameAndValue.getNameS(), nameAndValue.getValueS());
							Google.manage().addCookie(Cookies);
						}
					}catch (WebDriverException e) {
						System.err.println("Cookies导入WebDriverException异常");
						Error = "The Cookies import the WebDriverException";
						ErrorLogging( fail,Error);
					} catch (Exception e) {
						System.err.println("Cookies导入异常");
						Error = "The Cookies import exception";
						ErrorLogging( fail,Error);
					}
					
					try {
						
						// 跳转百度中间网站
						Google.get("https://www.baidu.com");
						Thread.sleep(3000);
						Google.get(GUOJIA);
						if ("https://www.amazon.de".equals(GUOJIA)) {
							// 德国语言的切换
							System.err.println("启动语言切换指令！");
							WebElement English = Google.findElement(By.id("icp-nav-flyout"));
							English.click();
							WebElement BUG = Google.findElement(
									By.xpath("//div[@class='a-column a-span7']/div[2][@class='a-row a-spacing-mini']"));
							BUG.click();
							WebElement anclick = Google.findElement(By.className("a-button-input"));
							anclick.click();
							System.err.println("语言切换指令已完成！");
						}
						if ("https://www.amazon.co.jp".equals(GUOJIA)) {
							// 日本语言切换语言操作代码
							System.err.println("启动语言切换指令！");
							WebElement English = Google.findElement(By.id("icp-nav-flyout"));
							English.click();
							WebElement BUG = Google.findElement(
									By.xpath("//div[@class='a-column a-span7']/div[2][@class='a-row a-spacing-mini']"));
							BUG.click();
							WebElement anclick = Google.findElement(By.className("a-button-input"));
							anclick.click();
							System.err.println("语言切换指令已完成！");
						}
						if ("https://www.amazon.com/".equals(GUOJIA)) {
							System.err.println("已是当前语言！");
						}
						if ("https://www.amazon.co.uk/".equals(GUOJIA)) {
							System.err.println("已是当前语言！");
						}
						if ("https://www.amazon.fr/".equals(GUOJIA)) {
							System.err.println("当前网页无切换语言指令！默认为法语！");
						}
						if ("https://www.amazon.ca/".equals(GUOJIA)) {
							System.err.println("启动语言切换指令！");
							WebElement English = Google.findElement(By.id("icp-nav-flyout"));
							English.click();
							WebElement BUG = Google.findElement(
									By.xpath("//div[@class='a-column a-span7']/div[1][@class='a-row a-spacing-mini']"));
							BUG.click();
							WebElement anclick = Google.findElement(By.className("a-button-input"));
							anclick.click();
							System.err.println("语言切换指令已完成！");
						}
						if ("https://www.amazon.es".equals(GUOJIA)) {
							System.err.println("当前网页无切换语言指令！默认为西班牙语！");
						}
						if ("https:// www.amazon.it/".equals(GUOJIA)) {
							System.err.println("当前网页无切换语言指令！默认为意大利语！");
						}

					} catch (NoSuchElementException e) {
						try {
							System.err.println("进入语言切换NoSuchElementException异常！！！");
							Google.get(GUOJIA);
							if ("https://www.amazon.de".equals(GUOJIA)) {
								// 德国语言的切换
								System.err.println("启动语言切换指令！");
								WebElement English = Google.findElement(By.id("icp-nav-flyout"));
								English.click();
								WebElement BUG = Google.findElement(By.xpath("//div[@class='a-column a-span7']/div[2][@class='a-row a-spacing-mini']"));
								BUG.click();
								WebElement anclick = Google.findElement(By.className("a-button-input"));
								anclick.click();
								System.err.println("语言切换指令已完成！");
							}
							if ("https://www.amazon.co.jp".equals(GUOJIA)) {
								// 日本语言切换语言操作代码
								System.err.println("启动语言切换指令！");
								WebElement English = Google.findElement(By.id("icp-nav-flyout"));
								English.click();
								WebElement BUG = Google.findElement(By.xpath(
										"//div[@class='a-column a-span7']/div[2][@class='a-row a-spacing-mini']"));
								BUG.click();
								WebElement anclick = Google.findElement(By.className("a-button-input"));
								anclick.click();
								System.err.println("语言切换指令已完成！");
							}
							if ("https://www.amazon.com/".equals(GUOJIA)) {
								System.err.println("已是当前语言！");
							}
							if ("https://www.amazon.co.uk/".equals(GUOJIA)) {
								System.err.println("已是当前语言！");
							}
							if ("https://www.amazon.fr/".equals(GUOJIA)) {
								System.err.println("当前网页无切换语言指令！默认为法语！");
							}
							if ("https://www.amazon.ca/".equals(GUOJIA)) {
								System.err.println("启动语言切换指令！");
								WebElement English = Google.findElement(By.id("icp-nav-flyout"));
								English.click();
								WebElement BUG = Google.findElement(By.xpath("//div[@class='a-column a-span7']/div[1][@class='a-row a-spacing-mini']"));
								BUG.click();
								WebElement anclick = Google.findElement(By.className("a-button-input"));
								anclick.click();
								System.err.println("语言切换指令已完成！");
							}
							if ("https://www.amazon.es".equals(GUOJIA)) {
								System.err.println("当前网页无切换语言指令！默认为西班牙语！");
							}
							if ("https:// www.amazon.it/".equals(GUOJIA)) {
								System.err.println("当前网页无切换语言指令！默认为法语！");
							}
						} catch (Exception e1) {
							System.err.println("进入切换语言NoSuchElementException异常......");
							Error = "Enter the switch language NoSuchElementException exception";
							ErrorLogging( fail,Error);
						}

					} catch (InterruptedException e) {
						System.out.println("nice");
					} catch (TimeoutException e) {
						System.err.println("亚马逊语言切换页面加载超时异常！");
						Error = "Amazon language switch page load timeout exception";
						ErrorLogging( fail,Error);
						// 调用切换IP代码
						SwitchIP(VPNS);
						// 刷新浏览器
						Google.navigate().refresh();
					}
				}
				// 控制窗口跳转到制定的url
				for (Object OB : GOG) {
					try {
						WebDriver GOGS = (WebDriver) OB;
						GOGS.get(Link);

					} catch (TimeoutException es) {
						System.out.println("产品网址链接加载超时异常......");
						Error = "Product url link load timeout exception";
						ErrorLogging( fail,Error);
						// 调用切换IP代码
						SwitchIP(VPNS);
						// 刷新浏览器
						((WebDriver) OB).navigate().refresh();
					} catch (Exception e) {
						System.out.println("产品链接失败！找不到指定的链接信息！！！");
						Error = "Product link failed!Unable to find the specified link information!";
						ErrorLogging( fail,Error);
					}
				}
				// 获得点击的产品名称和链接
				String[] brand = BRD.split("@@@");
				// 进行品牌的多少判断
				if (1 == quantity) {
					// 控制窗口跳跃到指定的品牌URL
					for (int x = 0; x < GOG.size(); x++) {
						// 进行转化
						Object DV1 = GOG.get(0);
						GOG1 = (WebDriver) DV1;
					}
					try {
						for (int x = 0; x <= 0; x++) {
							if (x == 0) {
								WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
								aboutLink1.click();
							}
						}
					} catch (TimeoutException e) {
						System.out.println("网络波动加载超时......");
						System.out.println("即将切换IP再次跳转......");
						// 调用切换IP代码
						SwitchIP(VPNS);
						try {
							// 刷新浏览器
							((WebDriver) GOG1).navigate().refresh();						
						} catch (Exception e2) {
							System.out.println("网络波动");
							Error = "Network fluctuation";
							ErrorLogging( fail,Error);
						}

					} catch (NoSuchElementException e) {
						try {
							System.out.println("产品搜索失败");
							// 调用切换IP代码
							SwitchIP(VPNS);
							for (int x = 0; x <= 0; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}
							}
						} catch (Exception e1) {
							System.out.println("产品搜索失败");
							Error = "Product search failed";
							ErrorLogging( fail,Error);
						}
					} catch (WebDriverException e) {				
						try {
							System.out.println("浏览器控制超时......");
							// 调用切换IP代码
							SwitchIP(VPNS);
							for (int x = 0; x <= 0; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}
							}
						}catch (Exception e2) {
							System.out.println("浏览器开启异常");
							Error = "The browser opens the exception";
							ErrorLogging( fail,Error);
						} 
					 }
					
					// 拿到链接窗口
					ControlExecutive.add(GOG1);
				}
				if (2 == quantity) {
					// 控制窗口跳跃到指定的品牌链接
					for (int x = 0; x < GOG.size(); x++) {
						Object DV1 = GOG.get(0);
						Object DV2 = GOG.get(1);
						GOG1 = (WebDriver) DV1;
						GOG2 = (WebDriver) DV2;
					}
					try {
						for (int x = 0; x <= 1; x++) {
							if (x == 0) {
								WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
								aboutLink1.click();
							}if (x == 1) {
								WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
								aboutLink2.click();
							}
						}
					} catch (TimeoutException e) {
						System.out.println("网络波动加载超时......");
						System.out.println("即将切换IP再次跳转......");
						// 调用切换IP代码
						SwitchIP(VPNS);
						try {
							// 刷新浏览器
							((WebDriver) GOG1).navigate().refresh();
							// 刷新浏览器
							((WebDriver) GOG2).navigate().refresh();													
						} catch (Exception e2) {
							System.out.println("网络波动");
							Error = "Network fluctuation";
							ErrorLogging( fail,Error);
						}
					} catch (NoSuchElementException e) {
						try {
							System.out.println("产品搜索失败");
							for (int x = 0; x <= 1; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}if (x == 1) {
									WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									aboutLink2.click();
								}
							}
						} catch (Exception e1) {
							System.out.println("产品搜索失败");
							Error = "Product search failed";
							ErrorLogging( fail,Error);
						}
					} catch (WebDriverException e) {
						System.out.println("浏览器控制超时......");
						try {
							// 调用切换IP代码
							SwitchIP(VPNS);
							for (int x = 0; x <= 1; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}if (x == 1) {
									WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									aboutLink2.click();
								}
							}
						} catch (Exception e2) {
							System.out.println("浏览器控制超时......");
							Error = "Browser control timeout";
							ErrorLogging( fail,Error);
						}

					}
					ControlExecutive.add(GOG1);
					ControlExecutive.add(GOG2);
				}
				if (3 == quantity) {
					// 控制窗口跳跃到指定的品牌链接
					for (int x = 0; x < GOG.size(); x++) {
						Object DV1 = GOG.get(0);
						Object DV2 = GOG.get(1);
						Object DV3 = GOG.get(2);
						GOG1 = (WebDriver) DV1;
						GOG2 = (WebDriver) DV2;
						GOG3 = (WebDriver) DV3;
					}
					try {
						for (int x = 0; x <= 2; x++) {
							if (x == 0) {
								WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
								aboutLink1.click();
							}if (x == 1) {
								WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
								aboutLink2.click();
							}if (x == 2) {
								WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
								aboutLink3.click();
							}
						}
					} catch (TimeoutException e) {
						System.out.println("网络波动加载超时......");
						System.out.println("即将切换IP再次跳转......");
						// 调用切换IP代码
						SwitchIP(VPNS);
						try {
							// 刷新浏览器
							((WebDriver) GOG1).navigate().refresh();
							// 刷新浏览器
							((WebDriver) GOG2).navigate().refresh();	
							// 刷新浏览器
							((WebDriver) GOG3).navigate().refresh();						
						} catch (Exception e2) {
							System.out.println("网络波动");
							Error = "Network fluctuation";
							ErrorLogging( fail,Error);
						}

					} catch (NoSuchElementException e) {
						try {
							System.out.println("产品搜索失败");
							for (int x = 0; x <= 2; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}if (x == 1) {
									WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									aboutLink2.click();
								}if (x == 2) {
									WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
									aboutLink3.click();
								}
							}
						} catch (Exception e1) {
							System.out.println("产品搜索失败");
							Error = "Product search failed";
							ErrorLogging( fail,Error);
						}
					} catch (WebDriverException e) {
						System.out.println("浏览器控制超时......");
						try {
							// 调用切换IP代码
							SwitchIP(VPNS);
							for (int x = 0; x <= 2; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}if (x == 1) {
									WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									aboutLink2.click();
								}if (x == 2) {
									WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
									aboutLink3.click();
								}
							}
						} catch (Exception e2) {
							System.out.println("浏览器控制超时......");
							Error = "Browser control timeout";
							ErrorLogging( fail,Error);
						}

					}
					ControlExecutive.add(GOG1);
					ControlExecutive.add(GOG2);
					ControlExecutive.add(GOG3);
				}
				if (4 == quantity) {
					// 控制窗口跳跃到指定的品牌链接
					for (int x = 0; x < GOG.size(); x++) {
						Object DV1 = GOG.get(0);
						Object DV2 = GOG.get(1);
						Object DV3 = GOG.get(2);
						Object DV4 = GOG.get(3);
						GOG1 = (WebDriver) DV1;
						GOG2 = (WebDriver) DV2;
						GOG3 = (WebDriver) DV3;
						GOG4 = (WebDriver) DV4;
					}
					try {
						for (int x = 0; x <= 3; x++) {
							if (x == 0) {
								WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
								aboutLink1.click();
							}if (x == 1) {
								WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
								aboutLink2.click();
							}if (x == 2) {
								WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
								aboutLink3.click();
							}if (x == 3) {
								WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
								aboutLink4.click();
							}
						}
					} catch (TimeoutException e) {

						try {
							System.out.println("网络波动加载超时......");
							System.out.println("即将切换IP再次跳转......");
							// 调用切换IP代码
							SwitchIP(VPNS);
							// 刷新浏览器
							((WebDriver) GOG1).navigate().refresh();
							// 刷新浏览器
							((WebDriver) GOG2).navigate().refresh();	
							// 刷新浏览器
							((WebDriver) GOG3).navigate().refresh();	
							// 刷新浏览器
							((WebDriver) GOG4).navigate().refresh();						
						} catch (Exception e2) {
							System.out.println("网络波动......");
							Error = "Network fluctuation";
							ErrorLogging( fail,Error);
						}
					} catch (NoSuchElementException e) {

						try {
							System.out.println("产品搜索失败");

							for (int x = 0; x <= 3; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}if (x == 1) {
									WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									aboutLink2.click();
								}if (x == 2) {
									WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
									aboutLink3.click();
								}if (x == 3) {
									WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
									aboutLink4.click();
								}
							}
						} catch (Exception e1) {
							System.out.println("产品搜索失败");
							Error = "Product search failed";
							ErrorLogging( fail,Error);
						}

					} catch (WebDriverException e) {
						System.out.println("浏览器控制超时......");
						try {
							// 调用切换IP代码
							SwitchIP(VPNS);
							for (int x = 0; x <= 3; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}if (x == 1) {
									WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									aboutLink2.click();
								}if (x == 2) {
									WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
									aboutLink3.click();
								}if (x == 3) {
									WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
									aboutLink4.click();
								}
							}
						} catch (Exception e2) {
							System.out.println("浏览器控制超时......");
							Error = "Browser control timeout";
							ErrorLogging( fail,Error);
						}
					}
					ControlExecutive.add(GOG1);
					ControlExecutive.add(GOG2);
					ControlExecutive.add(GOG3);
					ControlExecutive.add(GOG4);
				}
				if (5 == quantity) {

					// 控制窗口跳跃到指定的品牌链接
					for (int x = 0; x < GOG.size(); x++) {
						Object DV1 = GOG.get(0);
						Object DV2 = GOG.get(1);
						Object DV3 = GOG.get(2);
						Object DV4 = GOG.get(3);
						Object DV5 = GOG.get(4);
						GOG1 = (WebDriver) DV1;
						GOG2 = (WebDriver) DV2;
						GOG3 = (WebDriver) DV3;
						GOG4 = (WebDriver) DV4;
						GOG5 = (WebDriver) DV5;
					}

					try {
						for (int x = 0; x <= 4; x++) {
							if (x == 0) {
								WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
								aboutLink1.click();
							}if (x == 1) {
								WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
								aboutLink2.click();
							}if (x == 2) {
								WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
								aboutLink3.click();
							}if (x == 3) {
								WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
								aboutLink4.click();
							}if (x == 4) {
								WebElement aboutLink5 = GOG5.findElement(By.partialLinkText(brand[4]));
								aboutLink5.click();
							}
						}
					} catch (TimeoutException e) {
						System.out.println("网络波动加载超时......");
						System.out.println("即将切换IP再次跳转......");
						try {
							// 调用切换IP代码
							SwitchIP(VPNS);
							// 刷新浏览器
							((WebDriver) GOG1).navigate().refresh();
							// 刷新浏览器
							((WebDriver) GOG2).navigate().refresh();	
							// 刷新浏览器
							((WebDriver) GOG3).navigate().refresh();	
							// 刷新浏览器
							((WebDriver) GOG4).navigate().refresh();
							// 刷新浏览器
							((WebDriver) GOG5).navigate().refresh();							
						} catch (Exception e2) {
							System.out.println("网络波动......");
							Error = "Network fluctuation";
							ErrorLogging( fail,Error);
						}
					} catch (NoSuchElementException e) {
						try {
							System.out.println("产品搜索失败");

							for (int x = 0; x <= 4; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}if (x == 1) {
									WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									aboutLink2.click();
								}if (x == 2) {
									WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
									aboutLink3.click();
								}if (x == 3) {
									WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
									aboutLink4.click();
								}if (x == 4) {
									WebElement aboutLink5 = GOG5.findElement(By.partialLinkText(brand[4]));
									aboutLink5.click();
								}
							}
						} catch (Exception e1) {
							System.out.println("产品搜索失败");
							Error = "Product search failed";
							ErrorLogging( fail,Error);
						}
					} catch (WebDriverException e) {
						System.out.println("浏览器控制超时......");
						try {
							// 调用切换IP代码
							SwitchIP(VPNS);
							for (int x = 0; x <= 4; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}if (x == 1) {
									WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									aboutLink2.click();
								}if (x == 2) {
									WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
									aboutLink3.click();
								}if (x == 3) {
									WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
									aboutLink4.click();
								}if (x == 4) {
									WebElement aboutLink5 = GOG5.findElement(By.partialLinkText(brand[4]));
									aboutLink5.click();
								}
							}
						} catch (Exception e2) {
							System.out.println("浏览器控制超时......");
							Error = "Browser control timeout";
							ErrorLogging( fail,Error);
						}
					}
					ControlExecutive.add(GOG1);
					ControlExecutive.add(GOG2);
					ControlExecutive.add(GOG3);
					ControlExecutive.add(GOG4);
					ControlExecutive.add(GOG5);
				}
				if (6 == quantity) {

					// 控制窗口跳跃到指定的品牌链接
					for (int x = 0; x < GOG.size(); x++) {
						Object DV1 = GOG.get(0);
						Object DV2 = GOG.get(1);
						Object DV3 = GOG.get(2);
						Object DV4 = GOG.get(3);
						Object DV5 = GOG.get(4);
						Object DV6 = GOG.get(5);
						GOG1 = (WebDriver) DV1;
						GOG2 = (WebDriver) DV2;
						GOG3 = (WebDriver) DV3;
						GOG4 = (WebDriver) DV4;
						GOG5 = (WebDriver) DV5;
						GOG6 = (WebDriver) DV6;
					}
					try {
						for (int x = 0; x <= 5; x++) {
							if (x == 0) {
								WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
								aboutLink1.click();
							}if (x == 1) {
								WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
								aboutLink2.click();
							}if (x == 2) {
								WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
								aboutLink3.click();
							}if (x == 3) {
								WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
								aboutLink4.click();
							}if (x == 4) {
								WebElement aboutLink5 = GOG5.findElement(By.partialLinkText(brand[4]));
								aboutLink5.click();
							}if (x == 5) {
								WebElement aboutLink6 = GOG6.findElement(By.partialLinkText(brand[5]));
								aboutLink6.click();
							}
						}
					} catch (TimeoutException e) {
						System.out.println("网络波动加载超时......");
						System.out.println("即将切换IP再次跳转......");
						try {
							// 调用切换IP代码
							SwitchIP(VPNS);
							// 刷新浏览器
							((WebDriver) GOG1).navigate().refresh();
							// 刷新浏览器
							((WebDriver) GOG2).navigate().refresh();	
							// 刷新浏览器
							((WebDriver) GOG3).navigate().refresh();	
							// 刷新浏览器
							((WebDriver) GOG4).navigate().refresh();
							// 刷新浏览器
							((WebDriver) GOG5).navigate().refresh();
							// 刷新浏览器
							((WebDriver) GOG6).navigate().refresh();
						} catch (Exception e2) {
							System.out.println("网络波动......");
							Error = "Network fluctuation";
							ErrorLogging( fail,Error);
						}
					} catch (NoSuchElementException e) {
						try {

							System.out.println("产品搜索失败");
							for (int x = 0; x <= 5; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}if (x == 1) {
									WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									aboutLink2.click();
								}if (x == 2) {
									WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
									aboutLink3.click();
								}if (x == 3) {
									WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
									aboutLink4.click();
								}if (x == 4) {
									WebElement aboutLink5 = GOG5.findElement(By.partialLinkText(brand[4]));
									aboutLink5.click();
								}if (x == 5) {
									WebElement aboutLink6 = GOG6.findElement(By.partialLinkText(brand[5]));
									aboutLink6.click();
								}
							}
						} catch (Exception e1) {
							System.out.println("产品搜索失败");
							Error = "Product search failed";
							ErrorLogging( fail,Error);
						}
					} catch (WebDriverException e) {
						System.out.println("浏览器控制超时......");
						try {
							// 调用切换IP代码
							SwitchIP(VPNS);
							for (int x = 0; x <= 5; x++) {
								if (x == 0) {
									WebElement aboutLink1 = GOG1.findElement(By.partialLinkText(brand[0]));
									aboutLink1.click();
								}if (x == 1) {
									WebElement aboutLink2 = GOG2.findElement(By.partialLinkText(brand[1]));
									aboutLink2.click();
								}if (x == 2) {
									WebElement aboutLink3 = GOG3.findElement(By.partialLinkText(brand[2]));
									aboutLink3.click();
								}if (x == 3) {
									WebElement aboutLink4 = GOG4.findElement(By.partialLinkText(brand[3]));
									aboutLink4.click();
								}if (x == 4) {
									WebElement aboutLink5 = GOG5.findElement(By.partialLinkText(brand[4]));
									aboutLink5.click();
								}if (x == 5) {
									WebElement aboutLink6 = GOG6.findElement(By.partialLinkText(brand[5]));
									aboutLink6.click();
								}
							}
						} catch (Exception e2) {
							System.out.println("浏览器控制超时......");
							Error = "Browser control timeout";
							ErrorLogging( fail,Error);
						}
					}
					ControlExecutive.add(GOG1);
					ControlExecutive.add(GOG2);
					ControlExecutive.add(GOG3);
					ControlExecutive.add(GOG4);
					ControlExecutive.add(GOG5);
					ControlExecutive.add(GOG6);
				}

				// 增强for循环添加浏览商品
				for (WebDriver WB : ControlExecutive) {
					try {
						// 获得浏览器主体
						JavascriptExecutor js = (JavascriptExecutor) WB;
						Thread.sleep(4000);
						// 随机产生浏览
						Random rand = new Random();
						int sum = rand.nextInt(7) + 1;
						System.err.println("正在随机产生界面浏览方式...");
						Thread.sleep(2000);
						System.err.println("产生" + sum + "号界面浏览方式...");
						Thread.sleep(2000);
						System.err.println("程序即将开启浏览模式操作...");
						
						if (sum == 1) {
							int max = 6000;
							int min = 3000;
							Random random = new Random();
							int s = random.nextInt(max) % (max - min + 1) + min;
							
							int max1 = 80;
							int min1 = 50;
							Random random1 = new Random();
							int SUI = random1.nextInt(max1) % (max1 - min1 + 1) + min1;
							
							for (int x = 1; x <= s; x++) {
								if (x % SUI == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							for (int x = s; x >= 1; x--) {
								if (x % SUI == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							int max2 = 5000;
							int min2 = 2000;
							Random random2 = new Random();
							int SUI2 = random2.nextInt(max2) % (max2 - min2 + 1) + min2;

							int max3 = 100;
							int min3 = 50;
							Random random3 = new Random();
							int SUI3 = random3.nextInt(max3) % (max3 - min3 + 1) + min3;
							
							for (int x = 1; x <= SUI2; x++) {
								if (x % SUI3 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							for (int x = SUI2; x <= 8000; x++) {
								if (x % SUI3 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							int max4 = 100;
							int min4 = 80;
							Random random4 = new Random();
							int SUI4 = random4.nextInt(max4) % (max4 - min4 + 1) + min4;
							
							for (int x = 8000; x >= 1; x--) {
								if (x % SUI4 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							int max5 = 5000;
							int min5 = 3000;
							Random random5 = new Random();
							int SUI5 = random5.nextInt(max5) % (max5 - min5 + 1) + min5;							
							
							for (int x = 1; x <= SUI5; x++) {
								if (x % SUI4 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							for (int x = SUI5; x >= 1; x--) {
								if (x % 20 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
						}
						
						if (sum == 2) {

							int max1 = 50;
							int min1 = 40;
							Random random1 = new Random();
							int SUI = random1.nextInt(max1) % (max1 - min1 + 1) + min1;
							
							for (int x = 1; x <= 6000; x++) {
								if (x % SUI == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(3000);
							for (int x = 6000; x >= 1; x--) {
								if (x % SUI == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							int max2 = 2500;
							int min2 = 1000;
							Random random2 = new Random();
							int SUI2 = random2.nextInt(max2) % (max2 - min2 + 1) + min2;

							int max3 = 50;
							int min3 = 40;
							Random random3 = new Random();
							int SUI3 = random3.nextInt(max3) % (max3 - min3 + 1) + min3;
							
							Thread.sleep(3000);
							for (int x = 1; x <= SUI2; x++) {
								if (x % SUI3 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							Thread.sleep(5000);
							int max4 = 50;
							int min4 = 40;
							Random random4 = new Random();
							int SUI4 = random4.nextInt(max4) % (max4 - min4 + 1) + min4;
							
							for (int x = SUI2; x <= 7000; x++) {
								if (x % SUI4 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							Thread.sleep(3000);
							int max5 = 50;
							int min5 = 40;
							Random random5 = new Random();
							int SUI5 = random5.nextInt(max5) % (max5 - min5 + 1) + min5;
							for (int x = 8000; x >= 1; x--) {
								if (x % SUI5 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(3000);
						}
						if (sum == 3) {

							int max1 = 1000;
							int min1 = 2300;
							Random random1 = new Random();
							int SUI = random1.nextInt(max1) % (max1 - min1 + 1) + min1;

							int max2 = 40;
							int min2 = 30;
							Random random2 = new Random();
							int SUI2 = random2.nextInt(max2) % (max2 - min2 + 1) + min2;

							for (int x = 1; x <= SUI; x++) {
								if (x % SUI2 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(3000);
							Thread.sleep(5000);
							
							int max3 = 30;
							int min3 = 20;
							Random random3 = new Random();
							int SUI3 = random3.nextInt(max3) % (max3 - min3 + 1) + min3;

							for (int x = SUI; x <= 6000; x++) {
								if (x % SUI3 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(3000);
							int max4 = 1500;
							int min4 = 3000;
							Random random4 = new Random();
							int SUI4 = random4.nextInt(max4) % (max4 - min4 + 1) + min4;

							int max5 = 60;
							int min5 = 40;
							Random random5 = new Random();
							int SUI5 = random5.nextInt(max5) % (max5 - min5 + 1) + min5;

							for (int x = 6000; x >= SUI4; x--) {
								if (x % SUI5 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							Thread.sleep(3000);
							int max6 = 100;
							int min6 = 70;
							Random random6 = new Random();
							int SUI6 = random6.nextInt(max6) % (max6 - min6 + 1) + min6;
							
							for (int x = SUI4; x <= 6000; x++) {
								if (x % SUI6 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}

							Thread.sleep(4000);
							int max7 = 50;
							int min7 = 30;
							Random random7 = new Random();
							int SUI7 = random7.nextInt(max7) % (max7 - min7 + 1) + min7;
							
							for (int x = 6000; x >= 1; x--) {
								if (x % SUI7 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(3000);
						}
						if (sum == 4) {
							int max6 = 40;
							int min6 = 30;
							Random random6 = new Random();
							int SUI6 = random6.nextInt(max6) % (max6 - min6 + 1) + min6;
							
							for (int x = 1; x <= 7000; x++) {
								if (x % SUI6 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(3000);
							int max7 = 50;
							int min7 = 20;
							Random random7 = new Random();
							int SUI7 = random7.nextInt(max7) % (max7 - min7 + 1) + min7;
							
							for (int x = 7000; x >= 1; x--) {
								if (x % SUI7 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(3000);
						}
						if (sum == 5) {
							int max7 = 60;
							int min7 = 50;
							Random random7 = new Random();
							int SUI7 = random7.nextInt(max7) % (max7 - min7 + 1) + min7;
							
							for (int x = 1; x <= 7000; x++) {
								if (x % SUI7 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(3000);
							int max8 = 3500;
							int min8 = 2000;
							Random random8 = new Random();
							int SUI8 = random8.nextInt(max8) % (max8 - min8 + 1) + min8;

							int max9 = 45;
							int min9 = 20;
							Random random9 = new Random();
							int SUI9 = random9.nextInt(max9) % (max9 - min9 + 1) + min9;

							for (int x = 7000; x >= SUI8; x--) {
								if (x % SUI9 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(3000);
							int max10 = 50;
							int min10 = 30;
							Random random10 = new Random();
							int SUI10 = random10.nextInt(max10) % (max10 - min10 + 1) + min10;
							
							for (int x = SUI8; x <= 7000; x++) {
								if (x % SUI10 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							Thread.sleep(3000);
							int max1 = 60;
							int min1 = 40;
							Random random1 = new Random();
							int SUI1 = random1.nextInt(max1) % (max1 - min1 + 1) + min1;
							
							for (int x = 7000; x >= 1; x--) {
								if (x % SUI1 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(2000);
						}
						if (sum == 6) {
							int max1 = 50;
							int min1 = 30;
							Random random1 = new Random();
							int SUI1 = random1.nextInt(max1) % (max1 - min1 + 1) + min1;
							
							for (int x = 1; x <= 2500; x++) {
								if (x % SUI1 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							Thread.sleep(3000);
							int max2 = 70;
							int min2 = 40;
							Random random2 = new Random();
							int SUI2 = random2.nextInt(max2) % (max2 - min2 + 1) + min2;
							
							for (int x = 2500; x >= 1; x--) {
								if (x % SUI2 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							Thread.sleep(3000);
							int max3 = 50;
							int min3 = 30;
							Random random3 = new Random();
							int SUI3 = random3.nextInt(max3) % (max3 - min3 + 1) + min3;
							
							for (int x = 1; x <= 7000; x++) {
								if (x % SUI3 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							Thread.sleep(6000);
							int max4 = 50;
							int min4 = 30;
							Random random4 = new Random();
							int SUI4 = random4.nextInt(max4) % (max4 - min4 + 1) + min4;
							
							for (int x = 7000; x >= 1; x--) {
								if (x % SUI4 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(2000);
						}
						if (sum == 7) {
							int max1 = 60;
							int min1 = 30;
							Random random1 = new Random();
							int SUI1 = random1.nextInt(max1) % (max1 - min1 + 1) + min1;

							int max2 = 2500;
							int min2 = 4000;
							Random random2 = new Random();
							int SUI2 = random2.nextInt(max2) % (max2 - min2 + 1) + min2;

							for (int x = 1; x <= SUI2; x++) {
								if (x % SUI1 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							int max3 = 100;
							int min3 = 70;
							Random random3 = new Random();
							int SUI3 = random3.nextInt(max3) % (max3 - min3 + 1) + min3;
							
							for (int x = SUI2; x >= 1; x--) {
								if (x % SUI3 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}

							int max4 = 60;
							int min4 = 40;
							Random random4 = new Random();
							int SUI4 = random4.nextInt(max4) % (max4 - min4 + 1) + min4;
							for (int x = 1; x <= 7000; x++) {
								if (x % SUI4 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							
							int max5 = 45;
							int min5 = 20;
							Random random5 = new Random();
							int SUI5 = random5.nextInt(max5) % (max5 - min5 + 1) + min5;
							
							for (int x = 7000; x >= 1; x--) {
								if (x % SUI5 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(3000);

							int max6 = 45;
							int min6 = 20;
							Random random6 = new Random();
							int SUI6 = random6.nextInt(max6) % (max6 - min6 + 1) + min6;

							int max7 = 4500;
							int min7 = 3000;
							Random random7 = new Random();
							int SUI7 = random7.nextInt(max7) % (max7 - min7 + 1) + min7;
							
							for (int x = 1; x <= SUI7; x++) {
								if (x % SUI6 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
							Thread.sleep(3000);
							int max8 = 45;
							int min8 = 30;
							Random random8 = new Random();
							int SUI8 = random8.nextInt(max8) % (max8 - min8 + 1) + min8;
							
							for (int x = SUI7; x >= 1; x--) {
								if (x % SUI8 == 0) {
									js.executeScript("scrollTo(0," + x + ")");
								}
							}
						}

					} catch (InterruptedException e) {
						System.out.println("浏览产品页面出现加载异常......");
						Error = "Browse the product page for loading exceptions";
						ErrorLogging( fail,Error);
						
					} catch (UnhandledAlertException e) {
						System.out.println("浏览产品页面出现加载异常......");
						Error = "Browse the product page for loading exceptions";
						ErrorLogging( fail,Error);
					} catch (TimeoutException e) {
						System.out.println("浏览产品页面出现加载异常......");
						WB.navigate().refresh();
						Error = "Browse the product page for loading exceptions";
						ErrorLogging( fail,Error);
					} catch (WebDriverException e) {
						System.out.println("浏览产品页面出现加载异常......");
						Error = "Browse the product page for loading exceptions";
						ErrorLogging( fail,Error);
					}
					try {						
						control =  WB;
						StaticPurchased( control, AddCart, WishCart);
						SuccessLogging(succeed);
						// 执行清除cookies操作
						WB.manage().deleteAllCookies();
						// WB.quit();						
					}catch (TimeoutException e) {						
						System.out.println("加购物超时异常......");
						WB.navigate().refresh();
						Error = "Shopping timeout exception";
						ErrorLogging( fail,Error);
					} catch (NoSuchElementException e) {
						try {
						
							// 执行返回所需要的工具
							Navigation navigation = WB.navigate();
							// 返回上一个页面
							navigation.forward();
							control =  WB;
							StaticPurchased( control, AddCart, WishCart);
							SuccessLogging(succeed);
							// 执行清除cookies操作
							WB.manage().deleteAllCookies();
							// WB.quit();
							
						} catch (NoSuchElementException e2) {
							try {
								// 执行返回所需要的工具
								Navigation navigation = WB.navigate();
								// 返回上一个页面
								navigation.forward();
								control =  WB;
								StaticPurchased( control, AddCart, WishCart);
								SuccessLogging(succeed);
								// 执行清除cookies操作
								// WB.quit();
								WB.manage().deleteAllCookies();
							} catch (NoSuchElementException e3) {
								try {
									// 执行返回所需要的工具
									Navigation navigation = WB.navigate();
									// 返回上一个页面
									navigation.forward();
									control =  WB;
									StaticPurchased( control, AddCart, WishCart);
									SuccessLogging(succeed);
									// 执行清除cookies操作
									// WB.quit();
									WB.manage().deleteAllCookies();
								} catch (NoSuchElementException e4) {
									try {
										// 执行返回所需要的工具
										Navigation navigation = WB.navigate();
										// 返回上一个页面
										navigation.forward();
										control =  WB;
										StaticPurchased( control, AddCart, WishCart);
										SuccessLogging(succeed);
										// 执行清除cookies操作
										// WB.quit();
										WB.manage().deleteAllCookies();
									} catch (NoSuchElementException e5) {
										try {
											// 执行返回所需要的工具
											Navigation navigation = WB.navigate();
											// 返回上一个页面
											navigation.forward();
											control =  WB;
											StaticPurchased( control, AddCart, WishCart);
											SuccessLogging(succeed);
											// 执行清除cookies操作
											// WB.quit();
											WB.manage().deleteAllCookies();
										} catch (NoSuchElementException e6) {
											try {

												// 执行返回所需要的工具
												Navigation navigation = WB.navigate();
												// 返回上一个页面
												navigation.forward();
												control =  WB;
												StaticPurchased( control, AddCart, WishCart);
												SuccessLogging(succeed);
												// 执行清除cookies操作
												// WB.quit();
												WB.manage().deleteAllCookies();
											} catch (NoSuchElementException e7) {
												try {
													// 执行返回所需要的工具
													Navigation navigation = WB.navigate();
													// 返回上一个页面
													navigation.forward();
													control =  WB;
													StaticPurchased( control, AddCart, WishCart);
													SuccessLogging(succeed);
													// 执行清除cookies操作
													// WB.quit();
													WB.manage().deleteAllCookies();
												} catch (NoSuchElementException e8) {
													try {
														// 执行返回所需要的工具
														Navigation navigation = WB.navigate();
														// 返回上一个页面
														navigation.forward();
														control =  WB;
														StaticPurchased( control, AddCart, WishCart);
														SuccessLogging(succeed);
														// 执行清除cookies操作
														// WB.quit();
														WB.manage().deleteAllCookies();
													} catch (NoSuchElementException e9) {
														try {
															// 执行返回所需要的工具
															Navigation navigation = WB.navigate();
															// 返回上一个页面
															navigation.forward();
															control =  WB;
															StaticPurchased( control, AddCart, WishCart);
															SuccessLogging(succeed);
															// 执行清除cookies操作
															// WB.quit();
															WB.manage().deleteAllCookies();
														} catch (NoSuchElementException e10) {
															try {

																// 执行返回所需要的工具
																Navigation navigation = WB.navigate();
																// 返回上一个页面
																navigation.forward();
																control =  WB;
																StaticPurchased( control, AddCart, WishCart);
																SuccessLogging(succeed);
																// 执行清除cookies操作
																// WB.quit();
																WB.manage().deleteAllCookies();
															} catch (NoSuchElementException e11) {
																System.out.println("已无力回天！BYE BYE ！！！");
																// 执行清除cookies操作
																WB.manage().deleteAllCookies();
																// WB.quit();
																Error = "No more!BYE BYE!";
																ErrorLogging( fail,Error);
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
				// 设置日期格式
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				// new Date()为获取当前系统时间
				String Time = df.format(new Date());
				// 执行流文件写入
				File f = new File(succeed);
				if (f.exists()) {
					fw = new FileWriter(f, true);
					pw = new PrintWriter(fw);
					pw.println("Succeed    " + Time + "   " + " A cookie has been executed   " + (BigSum++)+ "   Number of times");
					pw.println("                                                    ");

				} else {
					f.createNewFile();
					fw = new FileWriter(f, true);
					pw = new PrintWriter(fw);
					pw.println("Succeed    " + Time + "   " + " A cookie has been executed   " + (BigSum++)+ "   Number of times");
					pw.println("                                                    ");
				}
				pw.flush();
				fw.flush();
				pw.close();
				fw.close();
				if (x == size) {
					System.out.println("即将结束！！！");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
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
}

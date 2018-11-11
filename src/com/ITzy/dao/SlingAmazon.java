package com.ITzy.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ITzy.entity.BIGLISTS;
import com.ITzy.entity.CollectData;
import com.ITzy.entity.Cookies;
import com.ITzy.entity.FilesName;
import com.ITzy.entity.FirefoxCookies;
import com.ITzy.entity.JSONING;
import com.ITzy.entity.ReadData;
import com.ITzy.utils.FirefoxReading;
import com.ITzy.utils.IPAgency;
import com.thoughtworks.selenium.webdriven.commands.GetConfirmation;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class SlingAmazon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<Cookies> cookies = new ArrayList<Cookies>();
	public static List<BIGLISTS> BIGLIST = new ArrayList<BIGLISTS>();
	List<FirefoxCookies> Firefox = null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FileWriter fw = null;
		PrintWriter pw = null;
		String PPURL = "";
		String PPNAME = null;
		System.err.println("---------------------------------------------------------");
		String VPNS = (String) request.getAttribute("VPNS");
		String URL = (String) request.getAttribute("URL");
		List<FilesName> FilesName = (List<FilesName>) request.getAttribute("FilesName");
		List<CollectData> BigData = (List<CollectData>) request.getAttribute("BigData");
		String GUOJIA = (String) request.getAttribute("GUOJIA");
		System.err.println("---------------------------------------------------------");
		System.out.println(URL);
		for (CollectData collectData : BigData) {
			String name1 = collectData.getUserName();
			for (FilesName FN : FilesName) {

				String name = FN.getFiles();
				System.out.println(name);
				String File = URL + "\\" + name;
				// 获取该文件夹的所有cookies数据
				Firefox = FirefoxReading.ReadingFiles(File);
				try {
					System.err.println("终止刷单系统.....");
					Thread.sleep(1000);
					System.err.println("启动切换IP指令.....");
					// 调用切换IP代码
					IPAgency.GodOperation(VPNS);
					Thread.sleep(1000);
					System.err.println("继续开启执行刷单系统.....");
				} catch (Exception e) {
					e.printStackTrace();
				}
				// 开启加载火狐浏览器
				WebDriver driver = new FirefoxDriver();
				Navigation navigation = driver.navigate();

				// 启动火狐跳转到亚马逊主页面
				driver.get(GUOJIA);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				// 增强for循环遍历出cookies执行导入
				for (FirefoxCookies Firefox : Firefox) {
					Cookie Cookies = new Cookie(Firefox.getName(), Firefox.getValue());
					driver.manage().addCookie(Cookies);
				}
				driver.get("https://www.baidu.cn");
				try {
					Thread.sleep(8000);
					// 跳转到浏览页面
					String URLS = collectData.getUserURL();
					driver.get(URLS);				
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			
				try {

					// WebElement aboutLink = driver.findElement(By.partialLinkText("About"));
					WebElement aboutLink = driver.findElement(By.linkText(name1));
					aboutLink.click();
					Thread.sleep(2000);
					Alert javascriptConfirm = driver.switchTo().alert();
					javascriptConfirm.accept();
					Thread.sleep(2000);
					javascriptConfirm = driver.switchTo().alert();
					javascriptConfirm.accept();
					driver.switchTo().alert().dismiss();
					
					
					js.executeScript("scrollTo(0,10000)");// 向下拉到底
					Thread.sleep(1000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *99/100)");// 向上拉到顶
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollTo(0,100000)");// 向下拉到底
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollTo(0,1)");// 向上拉到顶
					Thread.sleep(2000);
					js.executeScript("scrollTo(0,1000)");
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollWidht *1/2)");// 左右拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollWidht *1/2)");// 左右拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollTo(0,10000)");// 向下拉到底
					Thread.sleep(1000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *99/100)");// 向上拉到顶
					js.executeScript("scrollTo(0,10000)");// 向下拉到底
					Thread.sleep(1000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *99/100)");// 向上拉到顶
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollTo(0,100000)");// 向下拉到底
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollTo(0,1)");// 向上拉到顶
					
				} catch (NoAlertPresentException e) {
					System.out.println("一级一号异常");
					System.out.println("进入UnhandledAlertException异常");
				} /*catch (NoSuchElementException e) {
					System.out.println("一级二号异常");
					System.out.println("进入NoSuchElementException异常");
				}*/ catch (InterruptedException e) {
					e.printStackTrace();
				}

				try {
					js.executeScript("scrollTo(0,10000)");// 向下拉到底
					Thread.sleep(1000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *99/100)");// 向上拉到顶
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollTo(0,100000)");// 向下拉到底
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollTo(0,1)");// 向上拉到顶
					Thread.sleep(2000);
					js.executeScript("scrollTo(0,1000)");
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollWidht *1/2)");// 左右拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");// 拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollBy(0, 0-document.body.scrollWidht *1/2)");// 左右拉到中间
					Thread.sleep(2000);
					js.executeScript("scrollTo(0,10000)");// 向下拉到底
					Thread.sleep(1000);
					// 找到加入购物车按钮并执行添加
					WebElement addButton = driver.findElement(By.id("add-to-cart-button"));
					addButton.click();
					navigation.back();
					Thread.sleep(5000);
					// 调用加入心愿单事件
					WebElement wishButton = driver.findElement(By.id("add-to-wishlist-button-submit"));
					wishButton.click();
					File f = new File("C:\\Users\\Administrator\\Desktop\\刷单成功.txt");

					if (f.exists()) {
						fw = new FileWriter(f, true);
						pw = new PrintWriter(fw);
						pw.println("成功-----------------" + name+"----------------------"+name1);

					} else {
						f.createNewFile();
						fw = new FileWriter(f, true);
						pw = new PrintWriter(fw);
						pw.println("成功-----------------" + name+"----------------------"+name1);
					}
					pw.flush();
					fw.flush();
					pw.close();
					fw.close();
					Thread.sleep(5000);
					
				  	// 执行关闭浏览器事件
					driver.quit();
				} catch (NoAlertPresentException e) {
					System.out.println("二级一号NoAlertPresentException异常");
					driver.quit();
				} catch (NoSuchElementException e) {
					System.out.println("二级二号NoSuchElementException异常");
					
					System.out.println("启动错误文件信息采集模式...");
					// 如果文件存在，则追加内容；如果文件不存在，则创建文件
					File f = new File("C:\\Users\\Administrator\\Desktop\\刷单错误.txt");

					if (f.exists()) {
						fw = new FileWriter(f, true);
						pw = new PrintWriter(fw);
						pw.println("FBA会员报错！！！----------------" + name+"----------------------"+name1);

					} else {
						f.createNewFile();
						fw = new FileWriter(f, true);
						pw = new PrintWriter(fw);
						pw.println("FBA会员弹出报错！！！-------------" + name+"----------------------"+name1);
					}
					pw.flush();
					fw.flush();
					pw.close();
					fw.close();
					// 执行关闭浏览器事件
					driver.quit();
				} catch (InterruptedException e) {
					e.printStackTrace();
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

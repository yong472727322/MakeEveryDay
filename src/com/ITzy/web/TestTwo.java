package com.ITzy.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.ITzy.entity.URL;
public class TestTwo {
	public static List list =  new ArrayList();
	public static Set<URL> URL =  new HashSet<URL>();
     static {
    	 
    	
    	list.add("iPhone 6 Plus Wallet Case, TAKEN Vintage Flip Cover with Magnet Belt Clip, Leather Shell with Cards Slot, Credit Card Holder, Shockproof and Durable Cases for Apple i Phone 6s Plus 5.5(2017), Brown");
    	list.add("TAKEN Leather Wallet Folio Case for iPhone 6 6s Plus with IC ID Card Slot, Phone Six Plus Protector, Shockproof Waterproof Dustproof Scratch Proof fashion and vintage,for i Phone 6 Plus Coffee, 2017");
    	list.add("iPhone 6 Plus Wallet case, iPhone 6s Plus Holster, Vintage TAKEN PU leather Wallets Cases with Card Slot, Flip Slim Cover with Magnet Clip for iPhone 6 Plus (2016) / 6s Plus (2017) 5.5, Rose Gold");
    	list.add("iPhone 6 Plus / iPhone 6s Plus Case, TAKEN Credit Card Slot, Vintage Premium PU Leather Wallet Cover Flip Cases for apple i Phone 6 / 6s Plus 5.5 Inch (Grey/Gray), for Lady, Womens, Mens, Boy, Girl");
    	list.add("TAKEN Vintage PU Wallet iPhone 6 Plus Case, Shockproof Leather Cases, Durable Flip Cover with Card Slot for Apple iPhone 6s Plus (2017) 5.5 Inch, Gift for Business Lady Men Women Boys Girls - Blue");
    	list.add("iPhone 6 Plus Case, Taken [Card Slot] [KickStand] Dual Layer Hybrid Shockproof Case Cover for Apple iPhone 6 Plus/6S Plus (Black)");
     }
	/*public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver2 = new FirefoxDriver();
		Navigation navigation = driver.navigate();
		Navigation navigation1 = driver1.navigate();
		Navigation navigation2 = driver2.navigate();
		driver.get("https://www.amazon.com/");
		driver1.get("https://www.amazon.com/");
		driver2.get("https://www.amazon.com/");
		Thread.sleep(5000);
		Cookie Cookies1 = new Cookie("a-ogbcbff", "1");
		Cookie Cookies2 = new Cookie("session-token", "zriZUIJ7WB4lvcMNZT3I1xAJBetEyJgBH9RXL8YCf0VSQM342rFX8oLHjps15LbVEdhE7wSHjLsSaGB9/x7e8NV8bS1HBF7DD0wCSVKC49zw4pDs04efyxzhF7+pO9UXtPFLc9H8mzWlbmsRExLYJMGeao06uD9wSFa/dTS3L9KOW5dBBZ/UKs3PeFn62uwOiP5R81kiVfeREhwptZnpFBhF2ir4WHdrJawXweSJgGQ=");
		Cookie Cookies3 = new Cookie("x-main", "YqE7dQrvrqOEJGoyjMulrmVzuqfYw02y");
		Cookie Cookies4 = new Cookie("at-main", "Atza|IwEBIKzXj1Ui0HhzEU0R2xMg0CwndvIqT24Ub-RF2s6JAIcSrJA2y_NmytFKBWhmKw0kyy1h1AVdPd1weM8UKGdCodBU0vPDUODttfqGLRpNrUSITIIp_Kbd9T8_VnEODY8Z4e64WBfSeq9SP_YsC2i-tcX-dMC7kVU2i2vcsrZLrwSuZDUhZyS5WhdxSDGyUaGRlfoznnJ-GRgygcvgK5laJr7HEjrNn27RMEUXl6MYza7fYfuAVpfP-WUFAADNViokHxT2JsGolMEvGpRXVrLgZXINVtenE_yR0e3J1vD2ht4SpOeFms4xgMzztLkS7oewn-M0LyqzuBswJC63xOjLh1xR0bVGdFosbOwu06fhq2PTGsTr4DqqBTRuVewi86PyXtO4NIZDrfnhzPJe-ePnRmbJ");
		Cookie Cookies5 = new Cookie("sess-at-main", "Kd+0qucyPfL8yxShTVoYBFK0dZkpJQeqmvOXaIxbbNo=");
		Cookie Cookies6 = new Cookie("skin", "noskin");
		Cookie Cookies7 = new Cookie("x-wl-uid", "1pqwvEDi3MgnNrz6vONXrDCIQrow8kM4fyyEqzYeUfaylGYpQHbWXaQxzPjFozdHO8ay5Qmv++8R5kz9sPBzd6efrZ0mN787c1ljZSHy4JxwYMcQqApg1s3oM64t9GCG+H/glhvGxHy4=");
		Cookie Cookies8 = new Cookie("ubid-main", "135-7711883-8102253");
		Cookie Cookies9 = new Cookie("session-id-time", "2082787201l");
		Cookie Cookies10 = new Cookie("session-id", "140-8550969-8384849");
		Cookie Cookies11 = new Cookie("csm-hit", "s-59RBX8DNNAT31T8PQJRW|1510383802344");
		driver.manage().addCookie(Cookies1);
		driver.manage().addCookie(Cookies2);
		driver.manage().addCookie(Cookies3);
		driver.manage().addCookie(Cookies4);
		driver.manage().addCookie(Cookies5);
		driver.manage().addCookie(Cookies6);
		driver.manage().addCookie(Cookies7);
		driver.manage().addCookie(Cookies8);
		driver.manage().addCookie(Cookies9);
		driver.manage().addCookie(Cookies10);
		driver.manage().addCookie(Cookies11);
		
		driver1.manage().addCookie(Cookies1);
		driver1.manage().addCookie(Cookies2);
		driver1.manage().addCookie(Cookies3);
		driver1.manage().addCookie(Cookies4);
		driver1.manage().addCookie(Cookies5);
		driver1.manage().addCookie(Cookies6);
		driver1.manage().addCookie(Cookies7);
		driver1.manage().addCookie(Cookies8);
		driver1.manage().addCookie(Cookies9);
		driver1.manage().addCookie(Cookies10);
		driver1.manage().addCookie(Cookies11);
		
		driver2.manage().addCookie(Cookies1);
		driver2.manage().addCookie(Cookies2);
		driver2.manage().addCookie(Cookies3);
		driver2.manage().addCookie(Cookies4);
		driver2.manage().addCookie(Cookies5);
		driver2.manage().addCookie(Cookies6);
		driver2.manage().addCookie(Cookies7);
		driver2.manage().addCookie(Cookies8);
		driver2.manage().addCookie(Cookies9);
		driver2.manage().addCookie(Cookies10);
		driver2.manage().addCookie(Cookies11);
		
		   
		 String BS  = "iPhone 6 Plus Wallet Case, TAKEN Vintage Flip Cover with Magnet Belt Clip, Leather Shell with Cards Slot, Credit Card Holder, Shockproof and Durable Cases for Apple i Phone 6s Plus 5.5(2017), Brown";
		 String BS1  = "TAKEN Leather Wallet Folio Case for iPhone 6 6s Plus with IC ID Card Slot, Phone Six Plus Protector, Shockproof Waterproof Dustproof Scratch Proof fashion and vintage,for i Phone 6 Plus Coffee, 2017";
		 String BS2 = "TAKEN Vintage PU Wallet iPhone 6 Plus Case, Shockproof Leather Cases, Durable Flip Cover with Card Slot for Apple iPhone 6s Plus (2017) 5.5 Inch, Gift for Business Lady Men Women";
		 Thread.sleep(5000);
		 driver.get("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=iPhone+6+plus+case&field-brandtextbin=Taken");
		 driver1.get("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=iPhone+6+plus+case&field-brandtextbin=Taken");
		 driver2.get("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=iPhone+6+plus+case&field-brandtextbin=Taken");
         Thread.sleep(5000);
        WebElement aboutLink = driver.findElement(By.partialLinkText(BS));
		aboutLink.click();
		
		WebElement aboutLink1 = driver1.findElement(By.partialLinkText(BS1));
		aboutLink1.click();
		
		WebElement aboutLink2 = driver2.findElement(By.partialLinkText(BS2));
		aboutLink2.click();
		
		 Thread.sleep(5000);
		 
		   // 找到加入购物车按钮并执行添加
			WebElement addButton = driver.findElement(By.id("add-to-cart-button"));
			addButton.click();
			navigation.back();
			Thread.sleep(5000);
			
			// 调用加入心愿单事件
			WebElement wishButton = driver.findElement(By.id("add-to-wishlist-button-submit"));
			wishButton.click();
			Thread.sleep(5000);
			driver.quit();
			 
			// 找到加入购物车按钮并执行添加
			WebElement addButton1 = driver1.findElement(By.id("add-to-cart-button"));
			addButton1.click();
			navigation1.back();
			Thread.sleep(5000);
			// 调用加入心愿单事件
			WebElement wishButton1 = driver1.findElement(By.id("add-to-wishlist-button-submit"));
			wishButton1.click();
			Thread.sleep(5000);
			driver1.quit();
			 
			// 找到加入购物车按钮并执行添加
			WebElement addButton2 = driver2.findElement(By.id("add-to-cart-button"));
			addButton2.click();
			navigation2.back();
			Thread.sleep(5000);
			// 调用加入心愿单事件
			WebElement wishButton2 = driver2.findElement(By.id("add-to-wishlist-button-submit"));
			wishButton2.click();
			Thread.sleep(5000);
			driver2.quit();
		 List<WebElement> buttons = driver.findElements(By.tagName("a"));

        
		 int x = 1;       
         for (WebElement webElement : buttons) {
        	  System.out.println(webElement.getAttribute("title"));	
        	  String name = webElement.getAttribute("title");
        	 // System.out.println(name);
        	 for (Object list : list) {
				if(name.equals(list)) {
					
	        		 String URLS =  webElement.getAttribute("href");
	        		 URL.add(new URL(URLS));
	        	  }
				}
			}
         System.out.println(URL.size());
        for (URL url : URL) {
        	 System.out.println(url.getURLS());
        	  JavascriptExecutor executor = (JavascriptExecutor)driver;
      		  executor.executeScript("window.open('"+url.getURLS()+"')"); 
		}
        	
        
		
        
		}
       */
		// 开启加载火狐浏览器
		/*WebDriver driver = new FirefoxDriver();
		Navigation navigation = driver.navigate();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		Cookie Cookies1 = new Cookie("a-ogbcbff", "1");
		Cookie Cookies2 = new Cookie("session-token",
				"Z+zaqlZoGbUVyX7vpftrDqfHmuRmcZLmtX2cbgFjQ4h+26fJhan8NRBmd647m9d5aeTVjoLAUC+X8dqBRbCCrk+5Feg7ECuU2C6/Q6SfccawekG+40q6HAV+zIOIjP0HDYSkYZz+GQutzelTvqW5252eKzVJFPHcB5Dm90YnXhWGlWnHxWA9KeIFmxiL9ghPI1C9KKZPzXAL8+QK58AkEm8MIRMXeYlW/mE9Egnf8Ug=");
		Cookie Cookies3 = new Cookie("x-main", "l2QuS4OEgutw5CCHoNoZV2ZQ40YzCRaQ");
		Cookie Cookies4 = new Cookie("at-main",
				"Atza|IwEBIEoKAEzqzkSXWnc824Qs44-6r07tPxPutzwkNZ84lsFw-9k_Guo47fGZ6UWh6twFJXZ4-AM_0DAlj1OJHzRumIUGzAnVys7hxn7bJHeUK3v9BEgmmv3fwmQOVXB_5jGqoHB0-FP9vmQx1GQa19RQ14NE2keWQh0GzP7qvS-2yWh2dBDN8b4ZT30Q_x92X-NHev0v4Z1wyRULyNrjj4N-5HCsAVOd4vkBWzhYGF2JJly16cwnHNgnFFrsr_qRWm8xO7Z59OjW3HWDG_OJrPKfDagQXNjhk9F_TLlfx-Z5H9SiezeUiWODK_G8GAvZU05gAmkUBROkfw75T5jmtUOteLnZ2pMClRje2gqHiMOvwxJ-1fnPOa-6MeW5XiNdVF1d6nqtmyzTQ_URxqABvtNcmP68HKQ3g2mPQmGzgLOv-FkckMKAMOD_ljSoH80R43ZtRBs");
		Cookie Cookies5 = new Cookie("sess-at-main", "8w/ZY/o3nMLfe812pH0lpftgvv+OjRTKiGIsKfIpFqU=");
		Cookie Cookies6 = new Cookie("lc-main", "en_US");
		Cookie Cookies7 = new Cookie("skin", "noskin");
		Cookie Cookies8 = new Cookie("x-wl-uid",
				"1b/nIK0KMxhU8MjIg4sodOsB10hMisS6JD/wiwB29Q1NobMF1IIf5d0CvJ+XYP5m8Y0bG2FuIcouY4EBtmxsG3NQAkr/so7b68BKaxYS93pDobp8QZ+OJp8xqg2dSjRMb0gWrjHxUMH4=");
		Cookie Cookies9 = new Cookie("csm-hit", "s-40SD1326XKF6NJWJW2TY|1510226216146");
		Cookie Cookies10 = new Cookie("ubid-main", "131-0130048-0417730");
		Cookie Cookies11 = new Cookie("session-id-time", "2082787201l");
		Cookie Cookies12 = new Cookie("session-id", "140-0441085-7159032");
		Cookie Cookies13 = new Cookie("csm-hit", "s-EVVMT7MPJ6FFV0M7XYHP|1510226228327");

		driver.manage().addCookie(Cookies1);
		driver.manage().addCookie(Cookies2);
		driver.manage().addCookie(Cookies3);
		driver.manage().addCookie(Cookies4);
		driver.manage().addCookie(Cookies5);
		driver.manage().addCookie(Cookies6);
		driver.manage().addCookie(Cookies7);
		driver.manage().addCookie(Cookies8);
		driver.manage().addCookie(Cookies9);
		driver.manage().addCookie(Cookies10);
		driver.manage().addCookie(Cookies11);
		driver.manage().addCookie(Cookies12);
		driver.manage().addCookie(Cookies13);
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=iPhone+6+plus+case&field-brandtextbin=Taken");
		Thread.sleep(3000);
		driver.get("");
		  List<WebElement> aList = driver.findElements(By.tagName("a"));
		  for (WebElement a : aList) {
              System.out.println(a.getAttribute("href"));//获取a标签中的URL
               
              //获取a标签href属性值
              String urlStr = a.getAttribute("href");
              if(urlStr.contains("TAKEN")) {
                 System.out.println("@@@@@@@@@@@@@@"+a.getAttribute("href"));
              }
               
          }*/
		
		/*WebElement aboutLink1 = driver.findElement(By.linkText("iPhone 6 Plus Wallet Case, TAKEN Vintage Flip Cover with Magnet Belt Clip, Leather Shell with Cards Slot, Credit Card Holder, Shockproof and Durable Cases for Apple i Phone 6s Plus 5.5(2017), Brown"));
		aboutLink1.click();
		WebElement aboutLink2 = driver.findElement(By.linkText("TAKEN Leather Wallet Folio Case for iPhone 6 6s Plus with IC ID Card Slot, Phone Six Plus Protector, Shockproof Waterproof Dustproof Scratch Proof fashion and vintage,for i Phone 6 Plus Coffee, 2017"));
		aboutLink2.click();
		WebElement aboutLink3 = driver.findElement(By.linkText("iPhone 6 Plus Wallet case, iPhone 6s Plus Holster, Vintage TAKEN PU leather Wallets Cases with Card Slot, Flip Slim Cover with Magnet Clip for iPhone 6 Plus (2016) / 6s Plus (2017) 5.5, Rose Gold"));
		aboutLink3.click();
		WebElement aboutLink4 = driver.findElement(By.linkText("iPhone 6 Plus / iPhone 6s Plus Case, TAKEN Credit Card Slot, Vintage Premium PU Leather Wallet Cover Flip Cases for apple i Phone 6 / 6s Plus 5.5 Inch (Grey/Gray), for Lady, Womens, Mens, Boy, Girl"));
		aboutLink4.click();
		WebElement aboutLink5 = driver.findElement(By.linkText("TAKEN Vintage PU Wallet iPhone 6 Plus Case, Shockproof Leather Cases, Durable Flip Cover with Card Slot for Apple iPhone 6s Plus (2017) 5.5 Inch, Gift for Business Lady Men Women Boys Girls - Blue"));
		aboutLink5.click();*/
		
		 /* JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-Vintage-Leather-Shockproof-Durable/dp/B01IJVUOTS/ref=sr_1_1?ie=UTF8&qid=1511161873&sr=8-1&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/Leather-Protector-Shockproof-Waterproof-Dustproof/dp/B01M1SBPUF/ref=sr_1_2?ie=UTF8&qid=1511161933&sr=8-2&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-Holster-Vintage-leather-Wallets/dp/B01IJVURYU/ref=sr_1_3?ie=UTF8&qid=1511161933&sr=8-3&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-TAKEN-Credit-Vintage-Premium-Leather/dp/B01LXA0HVK/ref=sr_1_4?ie=UTF8&qid=1511161933&sr=8-4&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/Vintage-Shockproof-Leather-Durable-Business/dp/B01IJVUQDM/ref=sr_1_5?ie=UTF8&qid=1511161933&sr=8-5&keywords=iPhone+6+plus+case')"   );
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-Vintage-Leather-Shockproof-Durable/dp/B01IJVUOTS/ref=sr_1_1?ie=UTF8&qid=1511161873&sr=8-1&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/Leather-Protector-Shockproof-Waterproof-Dustproof/dp/B01M1SBPUF/ref=sr_1_2?ie=UTF8&qid=1511161933&sr=8-2&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-Holster-Vintage-leather-Wallets/dp/B01IJVURYU/ref=sr_1_3?ie=UTF8&qid=1511161933&sr=8-3&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-TAKEN-Credit-Vintage-Premium-Leather/dp/B01LXA0HVK/ref=sr_1_4?ie=UTF8&qid=1511161933&sr=8-4&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/Vintage-Shockproof-Leather-Durable-Business/dp/B01IJVUQDM/ref=sr_1_5?ie=UTF8&qid=1511161933&sr=8-5&keywords=iPhone+6+plus+case')"   );
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-Vintage-Leather-Shockproof-Durable/dp/B01IJVUOTS/ref=sr_1_1?ie=UTF8&qid=1511161873&sr=8-1&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/Leather-Protector-Shockproof-Waterproof-Dustproof/dp/B01M1SBPUF/ref=sr_1_2?ie=UTF8&qid=1511161933&sr=8-2&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-Holster-Vintage-leather-Wallets/dp/B01IJVURYU/ref=sr_1_3?ie=UTF8&qid=1511161933&sr=8-3&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-TAKEN-Credit-Vintage-Premium-Leather/dp/B01LXA0HVK/ref=sr_1_4?ie=UTF8&qid=1511161933&sr=8-4&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/Vintage-Shockproof-Leather-Durable-Business/dp/B01IJVUQDM/ref=sr_1_5?ie=UTF8&qid=1511161933&sr=8-5&keywords=iPhone+6+plus+case')"   );
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-Vintage-Leather-Shockproof-Durable/dp/B01IJVUOTS/ref=sr_1_1?ie=UTF8&qid=1511161873&sr=8-1&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/Leather-Protector-Shockproof-Waterproof-Dustproof/dp/B01M1SBPUF/ref=sr_1_2?ie=UTF8&qid=1511161933&sr=8-2&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-Holster-Vintage-leather-Wallets/dp/B01IJVURYU/ref=sr_1_3?ie=UTF8&qid=1511161933&sr=8-3&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-TAKEN-Credit-Vintage-Premium-Leather/dp/B01LXA0HVK/ref=sr_1_4?ie=UTF8&qid=1511161933&sr=8-4&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/Vintage-Shockproof-Leather-Durable-Business/dp/B01IJVUQDM/ref=sr_1_5?ie=UTF8&qid=1511161933&sr=8-5&keywords=iPhone+6+plus+case')"   );
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-Vintage-Leather-Shockproof-Durable/dp/B01IJVUOTS/ref=sr_1_1?ie=UTF8&qid=1511161873&sr=8-1&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/Leather-Protector-Shockproof-Waterproof-Dustproof/dp/B01M1SBPUF/ref=sr_1_2?ie=UTF8&qid=1511161933&sr=8-2&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-Holster-Vintage-leather-Wallets/dp/B01IJVURYU/ref=sr_1_3?ie=UTF8&qid=1511161933&sr=8-3&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/iPhone-TAKEN-Credit-Vintage-Premium-Leather/dp/B01LXA0HVK/ref=sr_1_4?ie=UTF8&qid=1511161933&sr=8-4&keywords=iPhone+6+plus+case')"); 
		  executor.executeScript("window.open('https://www.amazon.com/Vintage-Shockproof-Leather-Durable-Business/dp/B01IJVUQDM/ref=sr_1_5?ie=UTF8&qid=1511161933&sr=8-5&keywords=iPhone+6+plus+case')"   );
		  
		  */
/*		  String[] handles = new String[driver.getWindowHandles().size()];//定义数组，所有窗口的句柄；
		  driver.getWindowHandles().toArray(handles); WebDriver childWindow = driver.switchTo().window(handles[3]);//根据句柄切换至你想切换的窗口
		  WebDriver childWindow = null;
		  for(int x=1;x<=20;x++) {
			  driver.getWindowHandles().toArray(handles); 
			   childWindow = driver.switchTo().window(handles[x]);//根据句柄切换至你想切换的窗口
			  
			  WebElement addButton = driver.findElement(By.id("add-to-cart-button"));
			   addButton.click();	
			   navigation.back();					
			   Thread.sleep(3000);									    
			//调用加入心愿单事件
			  WebElement wishButton = driver.findElement(By.id("add-to-wishlist-button-submit"));
	          wishButton.click();						
			  Thread.sleep(3000);
			 
		  }
		  childWindow.quit();*/
    
}

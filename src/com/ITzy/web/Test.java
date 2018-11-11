package com.ITzy.web;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;  
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.httpclient.cookie.Cookie2;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ITzy.entity.AllCookie;
import com.ITzy.entity.Person;
import com.ITzy.entity.ReadData;

import net.sf.json.JSONArray;  
import net.sf.json.JsonConfig;  
public class Test {  
	public static int DataRecords = 1;
	public static XSSFRow xssfRow  = null; 
	public static int x =0;
	public static String Testfirst = null;
	public static String Testlast = null;
	public static List<List<AllCookie>>  Cookies = new ArrayList<List<AllCookie>>();
    public static void main(String[] args) throws Exception {  
	    	
		 
	    	
	  
    	 //WebDriver FXdriver1 = new FirefoxDriver();            	   						 
	     //FXdriver1.manage().window().maximize(); 					      
		 //FXdriver1.get("https://www.amazon.com/");	
		
				
			InputStream is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\小链接文件\\test6.xlsx");
		   
		    
	        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
	       
	        for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
	            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
	            if (xssfSheet == null) {
	                break;
	            }else {	            	
		            for (int rowNum = 0; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
		                 xssfRow = xssfSheet.getRow(rowNum);
		                if (xssfRow != null) {	                	                			                   	                			                			                	
   		                         
		                     XSSFCell two = xssfRow.getCell(1);
		                     XSSFCell three = xssfRow.getCell(2);	                     
		                     XSSFCell four = xssfRow.getCell(3);                   

		                	 String username =  getValue(two);
		                	 String password =  getValue(three);
		                	 String cookies =  getValue(four);
                          List<AllCookie> Cook = new ArrayList<AllCookie>(); 
		                  String[] CK = cookies.split("},");
		                  for(int x=0;x<CK.length;x++) {
		                	  		                	  
		                	  if(x==0) {
		                		 String[] one  = CK[0].split("\\[");		                		
		                		  Testfirst = one[1];
		                		  CK[0] = Testfirst;
		                	  }if(x==CK.length-1) {		                		  		                		
		                		  String[] twos   = CK[CK.length-1].split("}]");		                		     		 
		                		  Testlast = twos[0];
		                		  CK[CK.length-1] = Testlast;
		                	 }
		                  }	
   
		                 List<String> breakup =  new ArrayList<String>();

                          for(int x=0;x<CK.length;x++) {                        	                          
		                	String[] Cookies =   CK[x].split("\\{"); 
		                	for(int z=0;z<Cookies.length;z++) {
		                		if(z==1) {
		                			breakup.add(Cookies[z]);
		                		}
		                	}		                		                			                	
		                  }
              
                          String DomainS = "";
                          Date ExpirationDateS = null;
                          boolean HostOnlyS = false;
                          boolean HttpOnlyS = false;
                          String NameS = "";
                          String PathS = "";
                          boolean SecureS = false;
                          boolean SessionS = false;
                          String StoreIdS = "";
                          String ValueS = "";
                          int IdS = 0;
                          
                       
                          
                          for (String str : breakup) {							 
                        	//  System.out.println(str);
                        	  String[]  TEST = str.split(",");
                        	  
                        	  for(int z=0;z<TEST.length;z++) {
                        		//  System.out.println(TEST[z]);
                        		 if(z==0) {
                        			 String[] domain =  TEST[0].split("\"domain\":\"");
                        			 String[] Domain =  domain[1].split("\"");
                        			 DomainS =  Domain[0];
                        			 System.out.println(DomainS);
                        		 }if(z==1) {
                        			 String[] expirationDate =  TEST[1].split("\"expirationDate\":");
                        			 String ExpirationDateS1 =  stampToDate(expirationDate[1]);                       			
                        			 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        			 ExpirationDateS = simpleDateFormat.parse(ExpirationDateS1);
                        			 System.out.println(ExpirationDateS);                      			                     			     
                        		 }if(z==2) {  
                        			 String[] hostOnly =  TEST[2].split("\"hostOnly\":");
                        			 String conversions1 =   hostOnly[1];
                        		     HostOnlyS =  Boolean.parseBoolean(conversions1);
                        		     System.out.println(HostOnlyS);
                        		 }if(z==3) {  
                        			 String[] httpOnly =  TEST[3].split("\"httpOnly\":");
                        			 String conversions2 =   httpOnly[1];
                        			 HttpOnlyS =  Boolean.parseBoolean(conversions2);
                        		     System.out.println(HttpOnlyS);
                        		 }if(z==4) {  
                        			 String[] name =  TEST[4].split("\"name\":\"");
                        			 String []  Name =   name[1].split("\""); 
                        			 NameS =  Name[0];
                        		     System.out.println(NameS);
                        		 }if(z==5) {  
                        			 String[] path =  TEST[5].split("\"path\":\"");
                        			 String []  Path =   path[1].split("\""); 
                        			 PathS =  Path[0];
                        		     System.out.println(PathS);
                        		 }if(z==6) {  
                        			 String[] secure =  TEST[6].split("\"secure\":");
                        			 String   conversions3 =   secure[1]; 
                        			 SecureS =  Boolean.parseBoolean(conversions3);
                        		     System.out.println(SecureS);
                        		 }if(z==7) {  
                        			 String[] session =  TEST[7].split("\"session\":");
                        			 String   conversions4 =   session[1]; 
                        			 SessionS =  Boolean.parseBoolean(conversions4);
                        		     System.out.println(SessionS);
                        		 }if(z==8) {  
                        			 String[] storeId =  TEST[8].split("\"storeId\":\"");
                        			 String []  StoreId =   storeId[1].split("\""); 
                        			 StoreIdS =  StoreId[0];
                        		     System.out.println(StoreIdS);
                        		 }if(z==9) {  
                        			 String[] value =  TEST[9].split("\"value\":\"");                        		
                        			 if("\"".equals(value[1])) {
                        				ValueS="";
                        				continue;
                        			 }else {
                        				 String[] Value =  value[1].split("\"");
                        				 ValueS=Value[0];                        				
                        			 }
                                     System.out.println(ValueS);
                        		 }if(z==10) {  
                        			 String[] id =  TEST[10].split("\"id\":");
                        			 String   Id =   id[1]; 
                        			 IdS =  Integer.valueOf(Id);                       			
                        		     System.out.println(IdS);
                        		 }
                        		 
                        		
                        	  }
                        	  Cook.add(new AllCookie(DomainS, ExpirationDateS, HostOnlyS, HttpOnlyS, NameS, PathS, SecureS, SessionS, StoreIdS, ValueS, IdS));
						  }
                          Cookies.add(Cook);
		                }else {
		                	break; 
		                }
		                
		            }        	            	        
		        }
	          
	            
	        }
	        System.out.println("##############"+Cookies.size());
	    }  
    
    
      public static String stampToDate(String s){
           String res;
           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           long lt = new Long(s);
           Date date = new Date(lt);
           res = simpleDateFormat.format(date);
           return res;
     }
      
	 private static String getValue(XSSFCell xssfRow) {

   		  if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
   			   return String.valueOf(xssfRow.getBooleanCellValue());
   		  } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
   			return String.valueOf(xssfRow.getNumericCellValue());
   		  } else {
   			return String.valueOf(xssfRow.getStringCellValue());
   		 }
   	}
	    
}
  
package com.ITzy.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ITzy.entity.BigCookies;
import com.ITzy.entity.Google;
import com.ITzy.entity.NameAndValue;

public class GoogleReading {
		
	public static XSSFRow xssfRow  = null; 
	public static int x =0;
	public static List<Google> Cookies  = new ArrayList<Google>();
	public static List<BigCookies> User = new ArrayList<BigCookies>();
	public static String[]  FiestCookies;
    public static String NAME= "";
    public static String VALUE= "";
	public static int x1 =1;
	public static List<List<NameAndValue>> GoogleCookieS  = new ArrayList<List<NameAndValue>>();
	//开启读取谷歌的xlsx文件
	public static List<List<NameAndValue>> Reading(String URL) throws IOException {
		
         
			
			InputStream is = new FileInputStream(URL);
	        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
	        // 获取每一个工作薄
	        for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
	            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
	            if (xssfSheet == null) {
	                break;
	            }            
	            else {
	            	// 获取当前工作薄的每一行
		            for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
		                 xssfRow = xssfSheet.getRow(rowNum);
		                if (xssfRow != null) {	  
		                	
		                	List<String> center =  new ArrayList<String>();
   		                     XSSFCell one = xssfRow.getCell(1);	                    
		                     XSSFCell two = xssfRow.getCell(2);
		                     XSSFCell three = xssfRow.getCell(3);		                     
		                     String email =  getValue(one);
		                	 String password =  getValue(two);
		                	 String cookies =  getValue(three);	
		                	 
		                	 //一重切割
		                	 String[] shattering = cookies.split("},");
		                	 for(int x=0;x<shattering.length;x++) {		                		 
		                		 if(x==0) {
		                			String[]  FiestCookies = shattering[0].split("\\[");			                			
		                			center.add(FiestCookies[1]);
		                		 }		                		 
		                		 if( x>=1 && x<shattering.length-1) {			                			
		                			center.add(shattering[x]);		                			 
		                		 }if(x == shattering.length-1) {
		                			 String[]  lastCookies = shattering[x].split("\\]");		                			
		                			 center.add(lastCookies[0]);
		                		 }
		                	 }
		                	 List<String> centerTwo =  new ArrayList<String>();
		                	 //二重切割	                	 		                	 		                	 
		                	 for (int k=0;k<center.size();k++) {
								String data = center.get(k);
								String[] COOKIES = data.split(",");								
								for(int z=0;z<COOKIES.length;z++) {
									     if(z==0) {
				                			String[]  SmallFirst = COOKIES[0].split("\\{");					                		
				                			centerTwo.add(SmallFirst[1]);
				                		 }		                		 
									     else {
									    	 centerTwo.add(COOKIES[z]);
									     }
								}
							}
		                   String  individual = "";
		                	//三重切割		                  
		                	for(int s=0;s<centerTwo.size();s++) {
		                		
		                		individual = individual +centerTwo.get(s);
		                	}
		                	List<NameAndValue> NAndV = new  ArrayList<NameAndValue>();		                
		                //	System.out.println("=============================================================");
		                	String[]  TEST = individual.split("\"id\":");
		                	for(int k=0;k<TEST.length-1;k++) {
		                		String[] FUCK = TEST[k].split("httpOnly\":");
		                		for(int x=0;x<FUCK.length;x++) {
		                			if(x==1) {
		                				String[] AA = FUCK[1].split("\"\"path\":\"");
		                				for(int m=0;m<AA.length;m++) {
		                					if(m==0) {
		                						String[] BB = AA[0].split("\"name\":\"");
		                						NAME = BB[1];		                						
		                					}if(m==1) {
		                						String[] CC = AA[1].split("\"value\":\"");
		                						String CAO = "value\":";
		                						String KK = CC[1]+CAO;
		                						String[]  QQ = KK.split("\"value\":");
		                						for(int C=0;C<QQ.length;C++)
		                						{
		                							if(C==0) {
		                								VALUE = QQ[0];
		                							}
		                						}
		                					    
		                					}
		                					
		                				}
		                				NAndV.add(new NameAndValue(NAME, VALUE));
		                			}		                				                			
		                		}
		                	}
		                
		                	GoogleCookieS.add(NAndV);
		                }else {
		                	break;
		                }
		            }        	            	        
		        }		        		      
	        }
	        return GoogleCookieS;
	    }
	
	
	   //转换数据格式
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
	


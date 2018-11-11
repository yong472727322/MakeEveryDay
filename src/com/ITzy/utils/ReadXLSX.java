package com.ITzy.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.ITzy.entity.ReadData;

public class ReadXLSX { 
	
	
	
	public static List<ReadData> list =  new ArrayList<ReadData>();
	public static XSSFRow xssfRow  = null; 
	public static int x =0;
	
	
	public static  List<ReadData>  ReadIng(String URL) throws IOException {								
			InputStream is = new FileInputStream(URL);
		    /*BufferedReader bs = new BufferedReader(new InputStreamReader(URL,"UTF-8")); */
		    
	        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
	       
	        for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
	            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
	            if (xssfSheet == null) {
	                break;
	            }else {
	            	
		            for (int rowNum = 3; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
		                 xssfRow = xssfSheet.getRow(rowNum);
		                if (xssfRow != null) {	                	                			                   	                			                			                	
   		                     XSSFCell one = xssfRow.getCell(1);	                    
		                     XSSFCell two = xssfRow.getCell(2);
		                     XSSFCell three = xssfRow.getCell(3);	                     
		                     XSSFCell four = xssfRow.getCell(4);                   
		                     XSSFCell five = xssfRow.getCell(5);
  		                  
		                   
		                	 String Username =  getValue(one);
		                	 String Password =  getValue(two);
		                	 String Cookies =  getValue(three);
		                	 String NewUsername =  getValue(four);
		                	 String NewPassword =  getValue(five);
         	 
		                     list.add(new ReadData(Username, Password, Cookies, NewUsername, NewPassword));		                   
		                }else {
		                	break;
		                }
		            }        	            	        
		        }
	            }	
		return  list;
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

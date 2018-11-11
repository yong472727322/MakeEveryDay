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

import com.ITzy.entity.IP;
import com.ITzy.entity.ReadData;

public class ReadIP {

	public static List<IP> list = new ArrayList<>();
	public static XSSFRow xssfRow  = null; 
	public static int x =0;
	public static List<IP> ReadIng(String IP) throws IOException {

		InputStream is = new FileInputStream(IP);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);	
		for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
			XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
			if (xssfSheet == null) {
				break;
			} else {				
				for (int rowNum = 3; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
					xssfRow = xssfSheet.getRow(rowNum);
					if (xssfRow != null) {
						
						XSSFCell one = xssfRow.getCell(0);
						XSSFCell two = xssfRow.getCell(1);
						
						String Ip = getValue(one);
						String PortNumber = getValue(two);
						
						list.add(new IP(Ip, PortNumber));
					} else {
						break;
					}
				}
			}
		}
		return list;
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

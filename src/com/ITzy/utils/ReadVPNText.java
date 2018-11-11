package com.ITzy.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadVPNText {
	public static String line = "";      
	public static String ReadIngVPNText(String  VPN) throws IOException {
		
		  // 要读取以上路径的input txt文件  
          File filename = new File(VPN);      
          InputStreamReader reader = new InputStreamReader(  new FileInputStream(filename)); 
          BufferedReader br = new BufferedReader(reader);        
          line = br.readLine();           
		  return line;
	}
}

package com.ITzy.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.ITzy.entity.*;
public class FirefoxReading {
      
	public static List<FilesName> FilesName = new ArrayList<FilesName>();
	public static List<FirefoxCookies> FirefoxCookies = new ArrayList<FirefoxCookies>();
	
	//读取文件夹名称
	public static List<FilesName> Reading(String URL) {
		
		File file=new File(URL);
		String test[];
		test=file.list();
		for(int i=0;i<test.length;i++)
		{	
		  FilesName.add(new FilesName(test[i]));
		} 
		return FilesName;
	}
	
   //读取文件夹的内部的数据
   public static List<FirefoxCookies> ReadingFiles(String File) throws IOException {
		
		File file=new File(File);
		BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
		String s = null;
		while((s = br.readLine())!=null){//使用readLine方法，一次读一行
			 String[] SJ  = s.split("	");
			/*for(int x=0;x<SJ.length;x++) {
				System.out.println(SJ[x]);
			}*/		
			System.out.println("= =");
			if(SJ.length==7) {
				FirefoxCookies.add(new FirefoxCookies(SJ[0], SJ[1], SJ[2], SJ[3], SJ[4], SJ[5], SJ[6]));
			}			 			
		}
		br.close();;
		return FirefoxCookies;
	}
}

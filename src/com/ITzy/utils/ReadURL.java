package com.ITzy.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

import com.ITzy.entity.BIG;

public class ReadURL {
	
	public static List<Integer> sum = new  ArrayList<Integer>();
	public static List<BIG> list =  new ArrayList<BIG>();
	
	public static List  BIG = new ArrayList();
	
	public static List ReadIngVPNText(String  URL) throws IOException {
		
		    FileReader fr=new FileReader(URL);
	        BufferedReader br=new BufferedReader(fr);
	        String line="";	      
	        while ((line=br.readLine())!=null) {
	           String[] arrs=null;
	           arrs = line.split("@@@");
	           int bs = arrs.length;
	           if(bs == 2) {
	        	   list.add(new BIG(arrs[0], arrs[1]));
	        	   sum.add(1);
	           } if(bs == 3) {
	        	   list.add(new BIG(arrs[0], arrs[1],arrs[2]));
	        	   sum.add(2);
	           } if(bs == 4) {
	        	   list.add(new BIG(arrs[0], arrs[1],arrs[2],arrs[3]));
	        	   sum.add(3);
	           } if(bs == 5) {
	        	   list.add(new BIG(arrs[0], arrs[1],arrs[2],arrs[3],arrs[4]));
	        	   sum.add(4);
	           } if(bs == 6) {
	        	   list.add(new BIG(arrs[0], arrs[1],arrs[2],arrs[3],arrs[4],arrs[5]));
	        	   sum.add(5);
	           } if(bs == 7) {
	        	   list.add(new BIG(arrs[0], arrs[1],arrs[2],arrs[3],arrs[4],arrs[5],arrs[6])); 
	        	   sum.add(6);
	           } 
	        }
	        br.close();
	        fr.close();
	        BIG.add(sum);
	        BIG.add(list);
	 
	        
	        return BIG;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		 FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\bs.txt");
	        BufferedReader br=new BufferedReader(fr);
	        String line="";	      
	        while ((line=br.readLine())!=null) {
	           String[] arrs=null;
	           arrs = line.split("@@@");
	           int bs = arrs.length;
	           if(bs == 2) {
	        	   list.add(new BIG(arrs[0], arrs[1]));
	           } if(bs == 3) {
	        	   list.add(new BIG(arrs[0], arrs[1],arrs[2]));
	           } if(bs == 4) {
	        	   list.add(new BIG(arrs[0], arrs[1],arrs[2],arrs[3]));
	           } if(bs == 5) {
	        	   list.add(new BIG(arrs[0], arrs[1],arrs[2],arrs[3],arrs[4]));
	           } if(bs == 6) {
	        	   list.add(new BIG(arrs[0], arrs[1],arrs[2],arrs[3],arrs[4],arrs[5]));
	           } if(bs == 7) {
	        	   list.add(new BIG(arrs[0], arrs[1],arrs[2],arrs[3],arrs[4],arrs[5],arrs[6])); 
	           } 
	        }
	        br.close();
	        fr.close();
	        
	        for (com.ITzy.entity.BIG highConcurrency : list) {
				System.out.println(highConcurrency.getURL()+"@@@"+highConcurrency.getFUCK1()+"@@@"+highConcurrency.getFUCK2()+"@@@"+highConcurrency.getFUCK3()+"@@@"+highConcurrency.getFUCK4()+"@@@"+highConcurrency.getFUCK5()+"@@@"+highConcurrency.getFUCK6());
			}
	        System.err.println(list.size());
	}
}

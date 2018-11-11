package com.ITzy.utils;
import java.io.BufferedReader;  
import java.io.InputStreamReader;  
public class IPAgency {
	public static String[] VPN = null;
	public static void main(String[] args) throws Exception {
		GodOperation("test");
	}
	 public static void GodOperation(String VPNS) throws Exception {
		 int x=0;
		  VPN = VPNS.split(" ");
			    //断开IP连接
		        cutAdsl(VPN[0]); 
		        Thread.sleep(2000);  
		       //重新连接分配一个新的IP  		        
		       while(true) {
		    	  boolean TEST =  BUGTEST();
		    	  if(TEST == true) {
		    		  break;
		    	  }
		    	  x++;
		    	  if(x==30) {
		    		  System.err.println("IP切换进入死循环...");
		    		  Thread.sleep(2000);  
		    		  System.err.println("即将跳出死循环...");
		    		  break;
		    	  }
		       }
		       Thread.sleep(2000);    
	 }
	
	public static boolean BUGTEST() throws Exception {
		 boolean  SUM =  connAdsl(VPN[0],VPN[1],VPN[2]);
		 
		 return SUM;
	}
	 /** 
     * 执行CMD命令,并返回String字符串 
     */  
    public static String executeCmd(String strCmd) throws Exception {  
        Process p = Runtime.getRuntime().exec("cmd /c " + strCmd);  
        StringBuilder sbCmd = new StringBuilder();  
        BufferedReader br = new BufferedReader(new InputStreamReader(p  
                .getInputStream()));  
        String line;  
        while ((line = br.readLine()) != null) {  
            sbCmd.append(line + "\n");  
        }  
        return sbCmd.toString();  
    }  
  
    /** 
     * 连接ADSL 
     */  
    public static boolean connAdsl(String adslTitle, String adslName, String adslPass) throws Exception {  
        System.err.println("正在建立连接...");  
        String adslCmd = "rasdial " + adslTitle + " " + adslName + " "  
                + adslPass;  
        String tempCmd = executeCmd(adslCmd);  
        // 判断是否连接成功  
        if (tempCmd.indexOf("已连接") > 0) {  
            System.err.println("已成功建立连接...");  
            return true;  
        } else {  
            System.err.println(tempCmd);  
            System.err.println("建立连接失败...");  
            return false;  
        }  
    }  
  
    /** 
     * 断开ADSL 
     */  
    public static boolean cutAdsl(String adslTitle) throws Exception {  
        String cutAdsl = "rasdial " + adslTitle + " /disconnect";  
        String result = executeCmd(cutAdsl);  
         
        if (result.indexOf("没有连接")!=-1){  
            System.err.println(adslTitle + "连接不存在!");  
            return false;  
        } else {  
            System.err.println("连接已断开...");  
            return true;  
        }  
    }     
}  


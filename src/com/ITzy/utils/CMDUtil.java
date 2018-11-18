package com.ITzy.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CMDUtil {

	//VPN名称
	private static String vpnName = "157.52.202.18-20212";
	
	
	
	/**
	 * 连接VPN
	 * @return
	 */
	public static boolean connectVPN() {
		String executeCMDconsole = executeCMDconsole("rasdial "+vpnName+" zttek2 zttek2");
		if(executeCMDconsole.contains("正在网络上注册你的计算机")
			&& executeCMDconsole.contains("已连接")){
			return true;
		}
		System.out.println("连接VPN失败---->"+executeCMDconsole+"<------连接VPN失败");
		return false;
	}
	
	/**
	 * 断开VPN
	 * @return
	 */
	public static boolean disConnectVPN() {
		String executeCMDconsole = executeCMDconsole("rasdial "+vpnName+" /DISCONNECT");
		if(executeCMDconsole.contains("命令已完成")){
			return true;
		}
		System.out.println("断开VPN---->"+executeCMDconsole);
		return false;
	}
	
	
	public static String executeCMDconsole(String cmd) {
        //此方法为打印日志到控制台！！！！！！！！！！！！
        //此方法跑成功！！！
		StringBuffer sb = new StringBuffer();
        Process p;
        try {
            p = Runtime.getRuntime().exec(cmd);            
            p.waitFor();
            BufferedReader bReader=new BufferedReader(new InputStreamReader(p.getInputStream(),"gbk"));
            String line=null;
            while((line=bReader.readLine())!=null)
            	sb.append(line+"\n");
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return sb.toString();
    }
}

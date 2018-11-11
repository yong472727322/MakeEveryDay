package com.ITzy.utils;

/**
 * 处理VPN相关
 * @author zhs-pc
 *
 */
public class VPNUtil {

	/**
	 * 上一个VPN
	 */
	private static String preVpn = "127.0.0.1";
	/**
	 * 当前VPN
	 */
	private static String curVpn = "";
	
	
//	public static boolean 
	
	public static boolean changeIP() {
		try {
			//断开连接
			CMDUtil.disConnectVPN();
			//获取新VPN
			String newVPN = SSHLinuxUtil.getNewVpn();
			//修改 拨号簿
			PbkUtil.changeVPN(newVPN);
			//重新连接
			CMDUtil.connectVPN();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main(String [] args) throws Exception {
		for(int i = 0 ; i < 10 ; i ++) {
			changeIP();
			System.out.println("切换成功，等待60秒。");
			Thread.sleep(60000);
		}
		
	}
	
}

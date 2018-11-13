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
			boolean connectVPN = CMDUtil.connectVPN();
			
			return connectVPN;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main(String [] args) throws Exception {
		for(int i = 0 ; i < 10 ; i ++) {
			if(changeIP()) {
				System.out.println(i+"切换成功，等待60秒。");
				Thread.sleep(60000);
				System.out.println("开始重新切换。。。");
			}else {
				changeIP();
			}
		}
	}
	
}

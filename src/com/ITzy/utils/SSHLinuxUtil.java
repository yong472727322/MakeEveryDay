package com.ITzy.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

/**
 * SSH连接
 * @author zhs-pc
 *
 */
public class SSHLinuxUtil {

	public static String getNewVpn() throws Exception {
      String host = "157.52.202.18";
      int port = 20212;
      String user = "root";
      String password = "jPbHgZOP8";
//      String command = "ls -l";
//      String command = "./only-get-ip.sh";
      String command = "./get-ip.sh ";
      String res = exeCommand(host,port,user,password,command);
      
      res = res.replaceAll("\n|\r", "");
      System.out.println("newVPN--->"+res+"<--newVPN");

      return res;
  }


  public static String exeCommand(String host, int port, String user, String password, String command) throws JSchException, IOException {

      JSch jsch = new JSch();
      Session session = jsch.getSession(user, host, port);
      session.setConfig("StrictHostKeyChecking", "no");
      //    java.util.Properties config = new java.util.Properties();
      //   config.put("StrictHostKeyChecking", "no");

      session.setPassword(password);
      session.connect();

      ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
      InputStream in = channelExec.getInputStream();
      channelExec.setCommand(command);
      channelExec.setErrStream(System.err);
      channelExec.connect();
      String out = IOUtils.toString(in, "UTF-8");

      channelExec.disconnect();
      session.disconnect();

      return out;
  }
}

package com.ITzy.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class PbkUtil {

	public static String FILEPATH = "C:\\Users\\zhs-pc\\AppData\\Roaming\\Microsoft\\Network\\Connections\\Pbk";

    public static String fileName = "rasphone.pbk";

    public static void changeVPN(String newVPN) throws Exception {
        File file = new File(FILEPATH + "/" + fileName);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = null;
        String vpn = null;
        while ((line = br.readLine()) != null){
//            System.out.println(line);
            if(line.startsWith("PhoneNumber")){
                vpn = line.split("=")[1];
                System.out.println("原VPN>>>"+vpn+"<<<");
            }
        }

        modifyFileContent(fileName,vpn,newVPN);
    }

    /**
     * 修改文件内容
     * @param fileName
     * @param oldstr
     * @param newStr
     * @return
     */
    private static boolean modifyFileContent(String fileName, String oldstr, String newStr) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(FILEPATH+"/"+fileName, "rw");
            String line = null;
            long lastPoint = 0; //记住上一次的偏移量
            while ((line = raf.readLine()) != null) {
                final long ponit = raf.getFilePointer();
                if(line.contains(oldstr)){
//                	String oldVPN = line.split("=")[1];
                	line = line.replaceAll(oldstr, newStr);
                	String str= "PhoneNumber="+newStr;
                    System.out.println("最终-->"+line+"<--");
                    raf.seek(lastPoint);
                    raf.writeBytes(line);
                }
                lastPoint = ponit;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                raf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
	
}

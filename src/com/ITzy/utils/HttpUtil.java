package com.ITzy.utils;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Date;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;

public class HttpUtil {

	/**
     * Creates CloseableHttpClient instance with default configuration.
     */
    private static CloseableHttpClient httpCilent = HttpClients.createDefault();
	
    public static AmazonTask sendGet(String url){
        try {
            HttpGet httpGet = new HttpGet(url);
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).build();//设置请求和传输超时时间
            httpGet.setConfig(requestConfig);
            HttpResponse execute = httpCilent.execute(httpGet);
            StatusLine statusLine = execute.getStatusLine();
            int statusCode = statusLine.getStatusCode();
            String resultStr = EntityUtils.toString(execute.getEntity());
            if(200 == statusCode){
            	ReturnResult returnResult = JSONObject.parseObject(resultStr, ReturnResult.class);
            	String code = returnResult.getCode();
            	String message = returnResult.getMessage();
            	if("0000".equals(code) && "success".equals(message)) {
            		if(null != returnResult.getObject()) {
            			AmazonTask task = JSONObject.parseObject(returnResult.getObject().toString(), AmazonTask.class);
            			return task;
            		}
            	}
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
}

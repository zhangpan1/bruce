package com.zhang.bruce.util;

import com.google.common.collect.Maps;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;

public class HttpUtil {

	private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);

	private static final HttpClient httpClient = new HttpClient();

	/**
	 *
	 * @param ip
	 * @param   同步：/rmcs-fireware/ChKLegalServlet，异步：
	 * @param timeout 毫秒
	 * @param param
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public static String doPost(String ip,String port,String path, int timeout, Map<String,Object> param,String doorgodId){
		PostMethod post = null;
		String result = "";
		try {
			httpClient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"UTF-8");
			httpClient.getHostConfiguration().setHost(ip, Integer.parseInt(port), "http");
			httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(timeout);
			httpClient.getHttpConnectionManager().getParams().setSoTimeout(timeout);
			post = new PostMethod(path);
			post.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
			ArrayList<NameValuePair> pairList = new ArrayList<NameValuePair>();
			if(param != null){
				for (Map.Entry<String, Object> entry : param.entrySet()) {
					if (entry.getValue() == null)
						continue;
					pairList.add(new NameValuePair(entry.getKey(), entry.getValue().toString()));
				}
			}
			NameValuePair[] params = new NameValuePair[pairList.size()];
			params = pairList.toArray(params);
			post.setRequestBody(params);
			httpClient.executeMethod(post);
			int code = post.getStatusCode();
			if (code == HttpStatus.SC_OK) {
				result= post.getResponseBodyAsString();
			}
		}catch(Exception ex){
			logger.error("doorgod_call_rmcs_error===>"+doorgodId, ex);
		}finally {
			if (post != null){
				post.releaseConnection();
			}
		}
		return result;
	}


	public static Map<String,String> sendGet(String url, String param) {
        String result = "";
        Map<String,String> mapResult = Maps.newHashMap();
        BufferedReader in = null;
        try {
            String urlNameString = url;
            if (param != null) {
                urlNameString = urlNameString + "?" + param;
            }
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            // 建立实际的连接
            connection.connect();
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(),"utf-8"));//防止乱码
			String a = connection.getHeaderField("X-API-CREDITS-AVAILABLE");
			String b = connection.getHeaderField("X-API-CREDITS-USED");
			mapResult.put("total",a);
			mapResult.put("used",b);
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            logger.error("发送GET请求出现异常！url:"+url+",param:"+param,e);
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
            	logger.error("关闭输入流异常！",e2);

            }
        }
		mapResult.put("result",result);
        return mapResult;
    }
	/**
	 * 向指定 URL 发送POST方法的请求
	 *
	 * @param url   发送请求的 URL
	 * @param param
	 * @return 所代表远程资源的响应结果
	 */
	public static String sendPost(String url, String param) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(param);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			logger.info("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
	public static String sendGet1(String url, String param) {
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url;
			if (param != null) {
				urlNameString = urlNameString + "?" + param;
			}
			URL realUrl = new URL(urlNameString);
			System.out.println(urlNameString);
			// 打开和URL之间的连接
			URLConnection connection = realUrl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			connection.setConnectTimeout(300);
			connection.setReadTimeout(300);

			// 建立实际的连接
			connection.connect();
			// 定义 BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(
					connection.getInputStream(),"utf-8"));//防止乱码
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			logger.error("发送GET请求出现异常！url:"+url+",param:"+param,e);
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				logger.error("关闭输入流异常！",e2);

			}
		}
		return result;
	}

}

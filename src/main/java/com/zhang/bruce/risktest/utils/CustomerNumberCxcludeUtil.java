//package com.zhang.bruce.risktest.utils;
//
//import com.yeepay.g3.utils.common.BeanUtils;
//import com.yeepay.g3.utils.common.json.JSONUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class CustomerNumberCxcludeUtil {
//
//private static final Logger logger = LoggerFactory.getLogger(CustomerNumberCxcludeUtil.class);
//
//	// 机场编码数缓存
//	private static Map<String, CustomerNumberClose> dataCache = new HashMap<String, CustomerNumberClose>();
//
//
//	/**
//	 * 解析商户编号数据
//	 * @return
//	 */
//	public static List<Object> parseExcel() {
//		List<Object> list = new ArrayList<Object>();
//		try {
//			InputStream inputStream = CustomerNumberCxcludeUtil.class.getResourceAsStream("/customer_number_close.xlsx");
//			list = EasyExcelFactory.read(inputStream, new Sheet(1, 1, CustomerNumberClose.class));
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error("paese customer_number_close.xlsx is error", e);
//		}
//		logger.info("paese customer_number_close.xlsx is succees, data:{}", JSONUtils.toJsonString(list));
//		return list;
//	}
//
//	/**
//	 * 加载商户编号数据
//	 */
//	public static void loadDataToCache() {
//		// 解析excel中商户编号数据
//		List<Object> list = CustomerNumberCxcludeUtil.parseExcel();
//		List<CustomerNumberClose> datas = new ArrayList<CustomerNumberClose>();
//		BeanUtils.copyListProperties(list, datas, CustomerNumberClose.class);
//		Map<String, CustomerNumberClose> tempDataCache = new HashMap<String, CustomerNumberClose>();
//		for (CustomerNumberClose data : datas) {
//			tempDataCache.put(data.getCustomerNumber(), data);
//		}
//		synchronized (dataCache) {
//			dataCache.clear();
//			dataCache.putAll(tempDataCache);
//		}
//	}
//
//	/**
//	 * 判断商户商户编号是否存在
//	 * @param customerNumber
//	 * @return
//	 */
//	public static boolean isInDataCache(String customerNumber) {
//		synchronized (dataCache) {
//			return dataCache.containsKey(customerNumber);
//		}
//	}
//
//	public static void main(String[] args) {
//		CustomerNumberCxcludeUtil.loadDataToCache();
//		System.out.println(CustomerNumberCxcludeUtil.isInDataCache("10027239046"));
//	}
//}

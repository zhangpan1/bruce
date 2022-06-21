//package com.zhang.bruce.risktest.utils;
//
//import com.alibaba.excel.EasyExcelFactory;
//import com.alibaba.excel.metadata.Sheet;
//import com.alibaba.fastjson.JSON;
//import com.yeepay.dp.etl.dto.AirportCodeData;
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
///**
// * 解析解析机场编码数据工具类
// * @author pengfei.yang
// *
// */
//public class AirportCodeDataUtil {
//
//	private static final Logger logger = LoggerFactory.getLogger(AirportCodeDataUtil.class);
//
//	// 机场编码数缓存
//	private static Map<String, AirportCodeData> airportCodeDataCache = new HashMap<String, AirportCodeData>();
//
//	static {
//		loadAirportCodeDataCache();
//	}
//
//	/**
//	 * 解析机场编码数据
//	 * @return
//	 */
//	public static List<Object> parseExcel() {
//		List<Object> list = new ArrayList<Object>();
//		try {
//			InputStream inputStream = AirportCodeDataUtil.class.getResourceAsStream("/airport_code_data.xlsx");
//			list = EasyExcelFactory.read(inputStream, new Sheet(1, 1, AirportCodeData.class));
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error("paese airport_code_data.xlsx is error", e);
//		}
//		logger.info("paese airport_code_data.xlsx is succees, data:{}", JSONUtils.toJsonString(list));
//		return list;
//	}
//
//	/**
//	 * 加载机场编码数据
//	 */
//	public static void loadAirportCodeDataCache() {
//		// 解析excel中机场编码数据
//		List<Object> list = AirportCodeDataUtil.parseExcel();
//		List<AirportCodeData> datas = new ArrayList<AirportCodeData>();
//		BeanUtils.copyListProperties(list, datas, AirportCodeData.class);
//		Map<String, AirportCodeData> tempAirportCodeDataCache = new HashMap<String, AirportCodeData>();
//		for (AirportCodeData data : datas) {
//			tempAirportCodeDataCache.put(data.getAirportCode(), data);
//		}
//		synchronized (airportCodeDataCache) {
//			airportCodeDataCache.clear();
//			airportCodeDataCache.putAll(tempAirportCodeDataCache);
//		}
//	}
//
//	/**
//	 * 根据机场编码获取获取缓存数据
//	 * @param airportCode
//	 * @return
//	 */
//	public static AirportCodeData getAirportCodeDataCache(String airportCode) {
//		synchronized (airportCodeDataCache) {
//			return airportCodeDataCache.get(airportCode);
//		}
//	}
//
//	public static void main(String[] args) {
//		AirportCodeData data = getAirportCodeDataCache("WUA");
//		System.out.println(JSON.toJSONString(data));
//	}
//}

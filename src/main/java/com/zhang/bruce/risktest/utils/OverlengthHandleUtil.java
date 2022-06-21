//package com.zhang.bruce.risktest.utils;
//
//import java.util.*;
//
//public class OverlengthHandleUtil {
//
//	public static Map<String, Object> subGoodsInfoMap(Map<String, Object> goodsInfoMap, List<String> keyList, int sourceLength, int targetLength) {
//		int over = sourceLength - targetLength;
//		int size = over/3 == 0  ?  over/3 : over/3 + 1;
//		Map<String, String> map  = new HashMap<String, String>();
//		for (String str : keyList) {
//			map.put(str, goodsInfoMap.get(str).toString());
//		}
//		map = sortMapByValue(map);
//		for (Map.Entry<String, String> entry : map.entrySet()) {
//			if (size > 0) {
//				int length = length(entry.getValue());
//				int s = length/3 == 0 ? length/3 : length/3 + 1;
//				goodsInfoMap.put(entry.getKey(), "");
//				size -= s;
//			}
//		}
//		return goodsInfoMap;
//	}
//
//	public static Map<String, Object> removeGoodsInfoMapKey(Map<String, Object> goodsInfoMap, List<String> keyList) {
//		for (String str : keyList) {
//			if (goodsInfoMap.containsKey(str)) {
//				goodsInfoMap.remove(str);
//				return goodsInfoMap;
//			}
//		}
//		return goodsInfoMap;
//	}
//
//	/**
//     * 获取字符串的长度，如果有中文，则每个中文字符计为2位
//     * @param value 指定的字符串
//     * @return 字符串的长度
//     */
//    public static int length(String value) {
//        int valueLength = 0;
//        String chinese = "[\u0391-\uFFE5]";
//        /* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
//        for (int i = 0; i < value.length(); i++) {
//            /* 获取一个字符 */
//            String temp = value.substring(i, i + 1);
//            /* 判断是否为中文字符 */
//            if (temp.matches(chinese)) {
//                /* 中文字符长度为2 */
//                valueLength += 3;
//            }else {
//            	 	valueLength += 1;
//            }
//        }
//        return valueLength;
//    }
//
//	/**
//     * 使用 Map按value进行排序
//     * @param map
//     * @return
//     */
//    public static Map<String, String> sortMapByValue(Map<String, String> oriMap) {
//        if (oriMap == null || oriMap.isEmpty()) {
//            return null;
//        }
//        Map<String, String> sortedMap = new LinkedHashMap<String, String>();
//        List<Map.Entry<String, String>> entryList = new ArrayList<Map.Entry<String, String>>(oriMap.entrySet());
//        Collections.sort(entryList, new com.yeepay.util.MapValueComparator());
//        Iterator<Map.Entry<String, String>> iter = entryList.iterator();
//        Map.Entry<String, String> tmpEntry = null;
//        while (iter.hasNext()) {
//            tmpEntry = iter.next();
//            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
//        }
//        return sortedMap;
//    }
//}

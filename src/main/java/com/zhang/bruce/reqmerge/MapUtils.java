package com.zhang.bruce.reqmerge;

import com.yeepay.doorgod.utils.log.LogUtil;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: Map工具类
 * @email: pan.zhang@yeepay.com
 * @date: 2023/10/11 4:42 下午
 */
public class MapUtils {
    private static final Logger logger = LogUtil.getLogger(MapUtils.class);

    public static Map<String, Object> transStringToMap(String mapString) {
        Map<String, Object> m = new HashMap<String, Object>();
        try {
            String[] strs = mapString.split("\\,");
            for (String s : strs) {
                String[] ms = s.split("=");
                if (ms.length == 2) {
                    if(ms[1] != null && !"null".equalsIgnoreCase(ms[1])) {
                        m.put(ms[0], ms[1]);
                    } else {
                        m.put(ms[0], "");
                    }
                }
            }
        } catch (Exception e) {
            logger.error("execute MapUtils  transStringToMap  is error {}", e);
        }
        return m;
    }

    /**
     * 合并map，同步有值，同步优先
     *
     * @param allSynReqIfMap
     * @param allAsyncReqIfMap
     * @return
     */
    public static Map<String, Object> mergeSyncMapToAsync(Map<String, Object> allSynReqIfMap, Map<String, Object> allAsyncReqIfMap) {
        HashMap<String, Object> mergedMap = new HashMap<>();
        try {
            // 遍历同步直传中的所有键值对--- 异步包含了goodsIf
            for (String key : allSynReqIfMap.keySet()) {
                Object valueSync = allSynReqIfMap.get(key);
                Object valueAsync = allAsyncReqIfMap.get(key);
                // 如果A和B都有值且不为null不为空字符，则使用A的值
                if (valueSync != null && valueAsync != null) {
                    // 如果是String类型，再加一个判断
                    if (valueSync instanceof String && valueAsync instanceof String) {
                        if (StringUtils.isNotBlank((String) valueSync)) {
                            mergedMap.put(key, valueSync);
                        } else {
                            mergedMap.put(key, valueAsync);
                        }
                    } else {
                        // 否则以同步为准
                        mergedMap.put(key, valueSync);
                    }
                    // 否则，使用谁有值就使用谁的值
                } else if (valueSync != null) {
                    mergedMap.put(key, valueSync);
                } else if (valueAsync != null) {
                    mergedMap.put(key, valueAsync);
                }

            }
            // 遍历异步中的所有键值对，将B中没有的键值对添加到mergedMap中
            for (String key : allAsyncReqIfMap.keySet()) {
                if (!allSynReqIfMap.containsKey(key)) {
                    mergedMap.put(key, allAsyncReqIfMap.get(key));
                }
            }
        } catch (Exception e) {
            logger.error("execute MapUtils  mergeSyncMapToAsync  is error {}", e);
        }
        return mergedMap;
    }
}

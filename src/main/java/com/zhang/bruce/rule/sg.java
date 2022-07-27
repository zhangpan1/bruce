package com.zhang.bruce.rule;

import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/14 8:33 下午
 */
public class sg {

     double getValueByProdName(Object str,String prodName,String splitType) {
        try{
            if (str == null || prodName == null || splitType == null) return 0.0;
            BigDecimal result = new BigDecimal(0);
            String value = (String) str;
            String valueArr[] = value.split(splitType);
            Map<String,Object> map = new HashMap<String,Object>();
            if("all".equals(prodName)){
                for(String tmpStr : valueArr){
                    String tmpStrArr[] =  tmpStr.split(":");
                    if(tmpStrArr!=null && tmpStrArr.length>1){
                        result = result.add(new BigDecimal(tmpStrArr[1]));
                    }else if(tmpStrArr!=null && tmpStrArr.length==1 &&!"".equals(tmpStrArr[0])){
                        result = result.add(new BigDecimal(tmpStrArr[0]));
                    }
                }
                return result.doubleValue();
            }else{
                for(String tmpStr : valueArr){
                    String tmpStrArr[] =  tmpStr.split(":");
                    if(tmpStrArr!=null && tmpStrArr.length>1){
                        String key = tmpStrArr[0];
                        Object val =  map.get(key);
                        if (val == null) {
                            map.put(key, new BigDecimal(tmpStrArr[1]));
                        } else {
                            BigDecimal bigVal = (BigDecimal) val;
                            BigDecimal itemVal = new BigDecimal(tmpStrArr[1]);
                            bigVal = bigVal.add(itemVal);
                            map.put(key, bigVal);
                        }
                    }
                }
                String prodNameArr[] = prodName.split(",");
                for(String prod:prodNameArr){
                    if(map.get(prod)!=null){
                        result = result.add(new BigDecimal(map.get(prod).toString()));
                    }
                }
                return result.doubleValue();
            }
        }
        catch(Exception e){
            LoggerUtil.getLogger().error("getValueByProdName全局方法出现异常", e);
            return 0.0;
        }
    }
}

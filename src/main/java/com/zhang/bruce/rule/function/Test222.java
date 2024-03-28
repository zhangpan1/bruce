package com.zhang.bruce.rule.function;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/8/8 10:11 下午
 */
public class Test222 {
    public static void main(String[] args) {
        String fakeJson = "0:21147.0,{\"detail\"::2248.0,-1:16914.0,Internal S:38.0,1:183324.0";
        if (StringUtils.isNotBlank(fakeJson)){
            String result = Arrays.stream(fakeJson.split(","))
                    .filter(s -> !(s.contains("{") || s.contains("}")))
                    .collect(Collectors.joining(","));

            Map<String,Object> map = JSONObject.parseObject("{"+result+"}");
            List<EchartsPieGO> list = new ArrayList<>();
            map.forEach((k,v)->{
                if (Arrays.asList("1","0").contains(k)){
                    EchartsPieGO go = new EchartsPieGO();
                    go.setX("1".equals(k)?"真":"伪");
                    go.setY(BigDecimal.valueOf(Double.parseDouble(v.toString())).intValue()+"");
                    list.add(go);
                }

            });
            System.out.println(list);
        }
    }
}

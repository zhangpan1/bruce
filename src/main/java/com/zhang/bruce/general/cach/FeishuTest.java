package com.zhang.bruce.general.cach;

import com.lark.oapi.service.im.v1.model.ext.MessageTemplate;
import com.lark.oapi.service.im.v1.model.ext.MessageTemplateData;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/7/3 5:04 下午
 */
public class FeishuTest {
    public static void main(String[] args) {
        // 创建模板变量Map
        Map<String, Object> variables = new HashMap<>();
        variables.put("name", "张三");
        variables.put("amount", "100.00");
        variables.put("time", "2024-07-03 16:00:00");

        // 使用 Builder 构建 MessageTemplateData 实例
        MessageTemplateData messageData = MessageTemplateData.newBuilder()
                .templateId("your_template_id_here") // 替换为实际的模板ID
                .templateVariable(variables)
                .build();
        String messageTemplate = MessageTemplate.newBuilder()
                .data(messageData)
                .build();
        System.out.println(messageTemplate);
    }
}

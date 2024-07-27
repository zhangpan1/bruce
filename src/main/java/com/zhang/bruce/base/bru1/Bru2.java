package com.zhang.bruce.base.bru1;

import com.google.common.collect.Maps;

import java.net.URLEncoder;
import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/1/30 4:35 下午
 */
public class Bru2 {
    public static void main(String[] args) throws InterruptedException {
        Map resultMap  = Maps.newHashMap();
        resultMap.put("trueCount", 1);
        resultMap.put("falseCount", 2);
        //resultMap.put("isTure", isTure);
        String isTrue = (String) resultMap.get("isTure");
        if (isTrue != null) {
            System.out.println(isTrue);

        } else {
            System.out.println("你说放松放松放松");
        }

        System.out.println(buildSideBarUrl(1L));

    }
    private static String buildSideBarUrl(Long alertId) {
        String realUrl = "https://indexmanage.yeepay.com/frontend/alert-center-sidebar/index.html#/detail?id=";
        String targetUrl = "https://img.yeepay.com/hbird-ucm/feishu-web-app-entry/index.html#/app?appId=cli_a413ea36f872d00e&appEncodeUrl=";
        String Sidebarurl = "https://applink.feishu.cn/client/web_app/open?appId=cli_a413ea36f872d00e&mode=sidebar&lk_target_url=";
        try {
            String sidebarRealEncodeUrl = URLEncoder.encode(realUrl + 4190775L, "UTF-8");
            String lkTargetUrl = targetUrl + sidebarRealEncodeUrl + "&exchangeMethod=uia";
            String lkTargetEncodeUrl = URLEncoder.encode(lkTargetUrl, "UTF-8");
            String url = Sidebarurl + lkTargetEncodeUrl;
            System.out.println(url);
            return url;
        } catch (Exception e) {
            System.out.println(e);
        }
        // encode失败跳到告警中心首页
        return "https://cloudos.yeepay.com/alert-center/index.html#/index/index";
    }
}

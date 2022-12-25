package com.zhang.bruce.general;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/11/22 18:01
 * @Description:
 */
public class TestUrl {
    public static void main(String[] args) {
        String fiel = "0cca53aa9da24a15a469effa036909a8.xlsx/GPT换汇交易查询 (2).xlsx";
        String[] fileNames = fiel.split("/");
        String typeName = fileNames[1];
        System.out.println(typeName);

        try {
            String file  = java.net.URLEncoder.encode(typeName, "UTF-8");
            String file1 =  new String(typeName.getBytes(), "UTF-8");

            System.out.println(file1);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

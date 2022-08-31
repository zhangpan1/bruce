package com.zhang.bruce.risk.xml;

import com.zhang.bruce.risk.xml.utils.ReceiptExplainException;
import com.zhang.bruce.risk.xml.utils.ReceiptExplainUtils;
import lombok.SneakyThrows;

import java.io.File;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/8/23 4:38 下午
 */
public class TestParse {
    public static void main(String[] args) throws ReceiptExplainException {

        File file = new File("/Users/ita010226/IdeaProjects/bruce/src/main/resources/test");
        File[] files = printFile(file);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < files.length; i++) {
                    File file1 = files[i];
                    // 遍历报文
                    // 回执报文信息
                    ReceiptPacketBean receiptPacketBean = null;
                    try {
                        receiptPacketBean = ReceiptExplainUtils.readReceiptXml(file1);
                    } catch (ReceiptExplainException e) {

                    }
                    System.out.println(receiptPacketBean);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                for (int i = 0; i < files.length; i++) {
                    File file1 = files[i];
                    // 遍历报文
                    // 回执报文信息
                    ReceiptPacketBean receiptPacketBean = ReceiptExplainUtils.readReceiptXml(file1);
                    System.out.println(receiptPacketBean);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < files.length; i++) {
                    File file1 = files[i];
                    // 遍历报文
                    // 回执报文信息
                    ReceiptPacketBean receiptPacketBean = null;
                    try {
                        receiptPacketBean = ReceiptExplainUtils.readReceiptXml(file1);
                    } catch (ReceiptExplainException e) {
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                    }
                    System.out.println(receiptPacketBean);
                }
            }
        }).start();



    }

    public static File[] printFile(File file) {
        File[] files = file.listFiles();//获取当前文件夹的所有子文件，返回抽象路径名数组
        return files;
    }

}


package com.zhang.bruce.risk.xml.utils;


import com.zhang.bruce.risk.xml.ReceiptPacketBean;
import com.zhang.bruce.risk.xml.handler.FragmentContentHandler;
import com.zhang.bruce.risk.xml.handler.ReceiptPacketHandler;
import com.zhang.bruce.risk.xml.handler.XPathTreeContentHandler;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lijunhao
 * @date 2022/1/11 2:26 下午
 */
public class ReceiptExplainUtils {

    private static final Log log = LogFactory.getLog(ReceiptExplainUtils.class);

    /**
     * 创建一个解析XML的工厂对象
     */
    private static final SAXParserFactory PREFATORY = SAXParserFactory.newInstance();
    /**
     * 创建一个解析XML的对象
     */
    private static SAXParser parser;

    private ReceiptExplainUtils() {
    }

    static {
        try {
            parser = PREFATORY.newSAXParser();
        } catch (Exception e) {
            log.error("创建SAXParser失败！！", e);
        }
    }

    /**
     * 读取回执xml
     *
     * @param file 文件
     */
    public static ReceiptPacketBean readReceiptXml(File file) throws ReceiptExplainException {
        if (parser == null) {
            throw new IllegalArgumentException("saxParser获取失败！");
        }
        try {
            //创建一个解析助手类
            ReceiptPacketHandler handler = new ReceiptPacketHandler(null);
            parser.parse(file, handler);
            return handler.getReceiptPacketBean();
        } catch (SAXException e) {
            throw new ReceiptExplainException("[SAXException]=>file=" + file.getName() + ",parseError:" + e.getMessage(), e);
        } catch (IOException e) {
            throw new ReceiptExplainException("[IOException]=>file=" + file.getName() + ",parseError:" + e.getMessage(), e);
        }
    }

    /**
     * 读取数据包报文
     *
     * @param file 文件
     * @return 返回xpath为key，值为value的map集合
     * @throws ReceiptExplainException 异常信息
     */
    public static Map<String, String> readXmlForXPath(File file) throws ReceiptExplainException {
        if (parser == null) {
            throw new IllegalArgumentException("readXmlForXPath saxParser获取失败！");
        }
        try {
            FragmentContentHandler dh = new FragmentContentHandler(parser.getXMLReader());
            parser.parse(file, dh);
            return dh.getData();
        } catch (SAXException e) {
            throw new ReceiptExplainException("[SAXException]=>file=" + file.getName() + ",parseError:" + e.getMessage(), e);
        } catch (IOException e) {
            throw new ReceiptExplainException("[IOException]=>file=" + file.getName() + ",parseError:" + e.getMessage(), e);
        }
    }

    /**
     * 生成xpath树
     *
     * @param file
     * @return 类似xpath树状结构的层级展示
     * @throws ReceiptExplainException
     */
    public static XPathTree genXpathTree(File file) throws ReceiptExplainException {
        if (parser == null) {
            throw new IllegalArgumentException("genXpathTree saxParser获取失败！");
        }
        try {
            XPathTreeContentHandler dh = new XPathTreeContentHandler(parser.getXMLReader());
            parser.parse(file, dh);
            return dh.getData();
        } catch (SAXException e) {
            throw new ReceiptExplainException("[SAXException]=>file=" + file.getName() + ",parseError:" + e.getMessage(), e);
        } catch (IOException e) {
            throw new ReceiptExplainException("[IOException]=>file=" + file.getName() + ",parseError:" + e.getMessage(), e);
        }
    }

    /**
     * 获取回执报文对应的数据报文名称
     *
     * @param fileName 回执报文名称，仅支持错误报文、警告报文、正确报文名称解析
     * @return
     */
    public static String getDataSourcePacketName(String fileName) {
        String baseName = FilenameUtils.getBaseName(fileName);
        if (StringUtils.length(baseName) >= 55) {
            List<String> receiptPacketPrefix = Arrays.stream(ReceiptPacketEnum.values())
                    .flatMap(receiptPacketEnum -> Stream.of(AntiPackageBizEnum.LARGE_AMOUNT.getReceiptPackageFlag() + receiptPacketEnum.getFlag(),
                            AntiPackageBizEnum.SUSPICIOUS.getReceiptPackageFlag() + receiptPacketEnum.getFlag(),
                            AntiPackageBizEnum.EXCLUDE_SUSPICIOUS.getReceiptPackageFlag() + receiptPacketEnum.getFlag()))
                    .collect(Collectors.toList());
            boolean match = receiptPacketPrefix.stream().anyMatch(s -> StringUtils.equals(StringUtils.substring(baseName, 0, 4), s));
            if (match) {
                return StringUtils.substring(baseName, 5, 40) + ".XML";
            }
        }
        return "null";
    }

    public static void main(String[] args) {
        System.out.println(getDataSourcePacketName("FDCF[NPHZ2014411000012-20220704-00000318]20220704161331"));
    }

    public static boolean isCPH(String packetName) {
        return StringUtils.substring(packetName, 0, 3).equals(AntiPackageOpTypeEnum.MODIFY + AntiPackageBizEnum.LARGE_AMOUNT.getDataPackageFlag());
    }

    public static boolean isNPH(String packetName) {
        return StringUtils.substring(packetName, 0, 3).equals(AntiPackageOpTypeEnum.CREATE + AntiPackageBizEnum.LARGE_AMOUNT.getDataPackageFlag());
    }
    public static boolean isCPS(String packetName) {
        return StringUtils.substring(packetName, 0, 3).equals(AntiPackageOpTypeEnum.MODIFY + AntiPackageBizEnum.SUSPICIOUS.getDataPackageFlag());
    }

    public static boolean isNPS(String packetName) {
        return StringUtils.substring(packetName, 0, 3).equals(AntiPackageOpTypeEnum.CREATE + AntiPackageBizEnum.SUSPICIOUS.getDataPackageFlag());
    }
}

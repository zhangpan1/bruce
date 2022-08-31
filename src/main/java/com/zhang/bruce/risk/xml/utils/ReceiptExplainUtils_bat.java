package com.zhang.bruce.risk.xml.utils;


import com.zhang.bruce.risk.xml.ReceiptPacketBean;
import com.zhang.bruce.risk.xml.handler.FragmentContentHandler;
import com.zhang.bruce.risk.xml.handler.ReceiptPacketHandler;
import com.zhang.bruce.risk.xml.handler.XPathTreeContentHandler;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.PoolableObjectFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

/**
 * @author lijunhao
 * @date 2022/1/11 2:26 下午
 */
public class ReceiptExplainUtils_bat {

    private static final Log log = LogFactory.getLog(ReceiptExplainUtils_bat.class);

    /**
     * 创建一个解析XML的工厂对象
     */
    private static final SAXParserFactory PREFATORY = SAXParserFactory.newInstance();

    static ThreadLocal<SAXParser> threadLocal = ThreadLocal.withInitial(new Supplier<SAXParser>() {
        @Override
        public SAXParser get() {
            try {
                return PREFATORY.newSAXParser();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    });


    static ObjectPool<SAXParser> parserObjectPool = new ObjectPool<SAXParser>() {
        @Override
        public SAXParser borrowObject() throws Exception, NoSuchElementException, IllegalStateException {
            return null;
        }

        @Override
        public void returnObject(SAXParser saxParser) throws Exception {

        }

        @Override
        public void invalidateObject(SAXParser saxParser) throws Exception {

        }

        @Override
        public void addObject() throws Exception, IllegalStateException, UnsupportedOperationException {

        }

        @Override
        public int getNumIdle() throws UnsupportedOperationException {
            return 0;
        }

        @Override
        public int getNumActive() throws UnsupportedOperationException {
            return 0;
        }

        @Override
        public void clear() throws Exception, UnsupportedOperationException {

        }

        @Override
        public void close() throws Exception {

        }

        @Override
        public void setFactory(PoolableObjectFactory<SAXParser> poolableObjectFactory) throws IllegalStateException, UnsupportedOperationException {

        }
    };


    /**
     * 创建一个解析XML的对象
     */
    private static SAXParser parser;

    private ReceiptExplainUtils_bat() {
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
            SAXParser saxParser = threadLocal.get();
            saxParser.parse(file, handler);
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




}

package com.zhang.bruce.risk.xml.utils;

import com.yeepay.g3.utils.common.log.Logger;
import com.yeepay.g3.utils.common.log.LoggerFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * @description: 解析器池化
 * @email: pan.zhang@yeepay.com
 * @date: 2022/9/1 3:37 下午
 */
public class SAXParseFactor implements PooledObjectFactory<SAXParser> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SAXParseFactor.class);


    @Override
    public PooledObject<SAXParser> makeObject() throws Exception {
        SAXParser parser = null;
        try {
            parser = SAXParserFactory.newInstance().newSAXParser();
        } catch (Exception e) {
            LOGGER.error("创建SAXParser失败！！", e);
        }
        LOGGER.info("链接池被创建了" + parser);
        return new DefaultPooledObject<SAXParser>(parser);
    }

    @Override
    public void destroyObject(PooledObject<SAXParser> pooledObject) throws Exception {

    }

    @Override
    public boolean validateObject(PooledObject<SAXParser> pooledObject) {
        return false;
    }

    @Override
    public void activateObject(PooledObject<SAXParser> pooledObject) throws Exception {

    }

    @Override
    public void passivateObject(PooledObject<SAXParser> pooledObject) throws Exception {

    }


}

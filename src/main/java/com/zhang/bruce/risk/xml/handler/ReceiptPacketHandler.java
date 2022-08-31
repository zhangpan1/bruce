package com.zhang.bruce.risk.xml.handler;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.zhang.bruce.risk.xml.DateUtils;
import com.zhang.bruce.risk.xml.ReceiptInfo;
import com.zhang.bruce.risk.xml.ReceiptPacketBean;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.List;
import java.util.Map;

/**
 * 回执报文数据结构
 *
 * @author lijunhao
 * @date 2021/12/24 4:13 下午
 */
public class ReceiptPacketHandler extends DefaultHandler {

    private static final Log log = LogFactory.getLog(ReceiptPacketHandler.class);
    /**
     * 存储正在解析的元素的属性
     */
    private Map<String, String> currentNodeAttrMap = null;
    /**
     * 正在解析的元素的名字
     */
    private String currentTag = null;
    /**
     * 正在解析的元素的元素值
     */
    private StringBuffer currentValue = new StringBuffer();

    private List<String> currentNodes = Lists.newArrayList();

    /**
     * 开始解析的元素
     */
    private String nodeName;

    /**
     * 存储的数据
     */
    private ReceiptPacketBean receiptPacketBean;


    public ReceiptPacketHandler(String nodeName) {
        this.nodeName = nodeName;
    }

    public ReceiptPacketBean getReceiptPacketBean() {
        return receiptPacketBean;
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        this.receiptPacketBean = new ReceiptPacketBean();
    }

    @Override
    public void endDocument() throws SAXException {
//        log.info("endDocument");
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
//        log.info("startElement uri:" + uri + ", localName:" + localName + ", qName:" + qName + ",attributes" + attributes);
        //判断正在解析的元素是不是开始解析的元素
        if (StringUtils.isBlank(this.nodeName) || StringUtils.equals(qName, this.nodeName)) {
            // 开头
            this.currentNodeAttrMap = Maps.newHashMap();
        }
        currentNodes.add(qName);
        //判断正在解析的元素是否有属性值,如果有则将其全部取出并保存到map对象中，如:<person id="00001"></person>
        if (attributes != null && currentNodeAttrMap != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                currentNodeAttrMap.put(attributes.getQName(i), attributes.getValue(i));
            }
        }
        //正在解析的元素
        currentTag = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        //如果内容不为空和空格，也不是换行符则将该元素名和值和存入map中
        if (currentTag != null && currentNodeAttrMap != null) {
            switch (currentTag) {
                case "RPID":
                    // 数据包xml文件名
                    receiptPacketBean.setOriPacketName(currentValue.toString());
                    String reportDate = StringUtils.substring(currentValue.toString(), currentValue.indexOf("-") + 1, currentValue.lastIndexOf("-"));
                    receiptPacketBean.setReportDate(DateUtils.convertLocalDate(reportDate, "yyyyMMdd"));
                    break;
                case "SFID":
                    receiptPacketBean.setResultCode(currentValue.toString());
                    break;
                case "ERLC":
                    //错误/补正/警告定位
                    receiptPacketBean.getReceiptInfos().add(new ReceiptInfo());
                    receiptPacketBean.getReceiptInfos().get(receiptPacketBean.getReceiptInfos().size() - 1).setPosition(currentValue.toString());
                    break;
                case "ERRS":
                    //错误/补正/警告原因
                    receiptPacketBean.getReceiptInfos().get(receiptPacketBean.getReceiptInfos().size() - 1).setReason(currentValue.toString());
                    break;
                default:
            }
            //当前的元素已解析过，将其置空用于下一个元素的解析
            currentTag = null;
            currentValue = new StringBuffer();
        }
        currentNodes.remove(qName);
    }

    @Override
    public void characters(char[] chars, int start, int length) throws SAXException {
//        log.info("characters :" + new String(chars));
        super.characters(chars, start, length);
        String temp = new String(chars, start, length);
        if (!StringUtils.isBlank(temp) && !"\n".equals(temp.trim())){
            currentValue.append(temp);
        }
    }
}

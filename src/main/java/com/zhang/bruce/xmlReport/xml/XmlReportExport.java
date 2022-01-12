package com.zhang.bruce.xmlReport.xml;


import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * xml文件导出
 *
 * @author lijunhao
 * @date 2021/12/15 6:28 下午
 */
public class XmlReportExport extends AbstractReportExport<XmlNode> {


    private final TransformerHandler handler;

    private final FileOutputStream fos;

    private final File generateTemp;

    private static final char[] ENTER_CH = "\n".toCharArray();
    private static final char[] TAB_CH = "\t".toCharArray();

    /**
     * 节点堆栈，用于
     */
    private final Stack<XmlNode> stack = new Stack<>();


    public XmlReportExport(XmlNode root) throws Exception {
        // 创建解析器工厂
        SAXTransformerFactory fac = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        handler = fac.newTransformerHandler();
        Transformer transformer = handler.getTransformer();
        // 设置输出采用的编码方式
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        // 是否自动添加额外的空白
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        // 是否忽略xml声明
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");

        this.generateTemp = generateTemp();
        if (!this.generateTemp.exists()) {
            String parent = generateTemp.getParent();
            boolean mkdirs = new File(parent).mkdirs();
            System.out.println("创建路径：" + generateTemp.getPath() + " mkdirs=" + mkdirs);
        }
        this.fos = new FileOutputStream(generateTemp);
        Result result = new StreamResult(fos);
        handler.setResult(result);

        handleRoot(root);
    }

    /**
     * 根节点
     *
     * @param rootNode 跟节点名称
     */
    private void handleRoot(XmlNode rootNode) throws Exception {

        startElement(rootNode);

        if (rootNode instanceof XmlNode.ObjectXmlNode) {
            LinkedList<XmlNode> nodes = ((XmlNode.ObjectXmlNode) rootNode).getNodes();
            for (XmlNode node : nodes) {
                generateElement(node);
            }
        }

    }

    /**
     * 推栈
     *
     * @param rootNode
     */
    private void pushStack(XmlNode rootNode) {
        stack.push(rootNode);
    }

    /**
     * 创建元素
     *
     * @param xmlBean
     * @throws SAXException
     */
    private void startElement(XmlNode xmlBean) throws SAXException {

        AttributesImpl attrs = new AttributesImpl();
        xmlBean.getAttributes().forEach((key, val) -> attrs.addAttribute("", "", key, "", val));
        handler.characters(ENTER_CH, 0, ENTER_CH.length);
        for (int i = 0; i < stack.size(); i++) {
            handler.characters(TAB_CH, 0, TAB_CH.length);
        }
        pushStack(xmlBean);
        handler.startElement("", "", xmlBean.getName(), attrs);
    }


    @Override
    public ExportFileExtension fileExtension() {
        return ExportFileExtension.XML;
    }


    @Override
    public File export() throws Exception {
        try {
            // 剩余节点收尾
            while (!stack.empty()) {
                endElement();
            }
            handler.endDocument();
            return generateTemp;
        } finally {
            fos.close();
        }
    }


    /**
     * 创建元素
     *
     * @param xmlBean 对象
     * @return 元素
     */
    private void generateElement(XmlNode xmlBean) throws Exception {

        startElement(xmlBean);

        if (xmlBean instanceof XmlNode.TextXmlNode) {
            char[] chars = ((XmlNode.TextXmlNode) xmlBean).getText().toCharArray();
            handler.characters(chars, 0, chars.length);
        } else if (xmlBean instanceof XmlNode.ObjectXmlNode) {
            for (XmlNode bean : ((XmlNode.ObjectXmlNode) xmlBean).getNodes()) {
                generateElement(bean);
            }
        }
        endElement();
    }

    /**
     * 结束元素填充
     *
     * @throws Exception
     */
    public void endElement() throws Exception {
        XmlNode pop = this.stack.pop();
        if (pop instanceof XmlNode.ObjectXmlNode && ((XmlNode.ObjectXmlNode) pop).getNodes().size() > 0) {
            handler.characters(ENTER_CH, 0, "\n".length());
            for (int i = 0; i < stack.size(); i++) {
                handler.characters(TAB_CH, 0, TAB_CH.length);
            }
        } else if (pop instanceof XmlNode.NoneTextNode) {
            handler.characters(ENTER_CH, 0, "\n".length());
            for (int i = 0; i < stack.size(); i++) {
                handler.characters(TAB_CH, 0, TAB_CH.length);
            }
        }
        handler.endElement("", "", pop.getName());
    }

    /**
     * 追加元素
     *
     * @param node
     */
    public void appendElement(XmlNode node) throws Exception {
        generateElement(node);
    }

    /**
     * 创建元素
     *
     * @param qName      元素名
     * @param attributes 属性
     */
    public void startElement(String qName, Map<String, String> attributes) throws Exception {
        XmlNode.NoneTextNode nonTextNode = XmlNode.createNonTextNode(qName);
        nonTextNode.setAttributes(attributes);
        startElement(nonTextNode);
    }

}

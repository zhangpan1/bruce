package com.zhang.bruce.xmlReport.xml;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang.StringUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author lijunhao
 * @date 2021/12/15 7:14 下午
 */
public abstract class XmlNode {


    private XmlNode() {
    }

    public static NoneTextNode createNonTextNode(String name) {
        return new NoneTextNode(name);
    }

    /**
     * 创建纯文本的节点
     *
     * @param name 节点名称
     * @param text 文本
     * @return
     */
    public static TextXmlNode createTextNode(String name, String text) {
        return new TextXmlNode(name, text);
    }

    /**
     * 创建一个列表型的节点
     *
     * @param name 列表名称
     * @return
     */
    public static ObjectXmlNode createListNode(String name) {
        return new ObjectXmlNode(name);
    }

    public abstract void setAttribute(String attrKey, String attrVal);

    public abstract Map<String, String> getAttributes();

    public abstract String getName();

    public abstract void setAttributes(Map<String, String> attrs);

    public static class NoneTextNode extends XmlNode {

        private BasicNode node = new BasicNode();

        public NoneTextNode(String name) {
            this.node.name = name;
        }

        @Override
        public void setAttribute(String attrKey, String attrVal) {
            node.getAttributes().put(attrKey, attrVal);
        }

        @Override
        public Map<String, String> getAttributes() {
            return node.getAttributes();
        }

        @Override
        public String getName() {
            return node.getName();
        }

        @Override
        public void setAttributes(Map<String, String> attrs) {
            this.node.setAttributes(attrs);
        }
    }

    /**
     * 列表node
     */
    public static class ObjectXmlNode extends XmlNode {

        /**
         * 基本属性
         */
        private BasicNode basicNode = new BasicNode();
        /**
         * 子节点
         */
        private final LinkedList<XmlNode> children = Lists.newLinkedList();


        public ObjectXmlNode(String name) {
            basicNode.setName(name);
        }

        private ObjectXmlNode() {
        }

        @Override
        public void setAttribute(String attrKey, String attrVal) {
            this.basicNode.setAttribute(attrKey, attrVal);
        }

        @Override
        public Map<String, String> getAttributes() {
            return this.basicNode.attributes;
        }

        @Override
        public String getName() {
            return this.basicNode.name;
        }

        @Override
        public void setAttributes(Map<String, String> attrs) {
            this.basicNode.setAttributes(attrs);
        }

        public void appendAllChildren(List<? extends XmlNode> nodeList) {
            this.children.addAll(nodeList);
        }

        /**
         * 添加文本节点
         *
         * @param name
         * @param text
         */
        public void addTextChildNode(String name, String text) {
            TextXmlNode e = new TextXmlNode(name, text);
            this.addTextChildNode(e);
        }

        public void addTextChildNode(TextXmlNode textXmlNode) {
            this.children.add(textXmlNode);
        }

        public void addChildNode(XmlNode node) {
            this.children.add(node);
        }

        public LinkedList<XmlNode> getNodes() {
            return this.children;
        }
    }


    /**
     * 文本型节点
     */
    public static class TextXmlNode extends XmlNode {

        private final BasicNode basicNode = new BasicNode();

        private final String text;

        public TextXmlNode(String name, String text) {
            this.text = StringUtils.defaultString(text, "");
            this.basicNode.name = StringUtils.defaultString(name, "");;
        }

        @Override
        public String toString() {
            return "TextXmlNode{" +
                    "basicNode=" + basicNode +
                    ", text='" + text + '\'' +
                    '}';
        }

        @Override
        public void setAttribute(String attrKey, String attrVal) {
            this.basicNode.setAttribute(attrKey, attrVal);
        }

        @Override
        public Map<String, String> getAttributes() {
            return this.basicNode.attributes;
        }

        @Override
        public String getName() {
            return this.basicNode.name;
        }

        @Override
        public void setAttributes(Map<String, String> attrs) {
            this.basicNode.setAttributes(attrs);
        }


        public String getText() {
            return this.text;
        }
    }


    /**
     * 基础node
     */
    private static class BasicNode {
        /**
         * 元素名称
         */
        private String name;

        /**
         * 元素属性
         */
        private Map<String, String> attributes = Maps.newHashMap();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Map<String, String> getAttributes() {
            return attributes;
        }

        public void setAttributes(Map<String, String> attributes) {
            this.attributes = attributes;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    ", attributes=" + attributes +
                    '}';
        }

        public void setAttribute(String attrKey, String attrVal) {
            this.attributes.put(attrKey, attrVal);
        }
    }
}

package com.zhang.bruce.risk.xml.handler;

import com.zhang.bruce.risk.xml.utils.XPathTree;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author lijunhao
 * @date 2022/1/24 2:08 下午
 */
public class XPathTreeContentHandler extends DefaultHandler {


    private String xPath = "";
    private XMLReader xmlReader;
    private XPathTreeContentHandler parent;
    private StringBuilder characters = new StringBuilder();

    private XPathTree.XPathNode data = new XPathTree.XPathNode();

    public XPathTreeContentHandler(XMLReader xmlReader) {
        this.xmlReader = xmlReader;
        this.data.setPath("/");
    }

    public XPathTree getData() {
        return new XPathTree(data);
    }

    private XPathTreeContentHandler(String xPath, XMLReader xmlReader, XPathTreeContentHandler parent) {
        this(xmlReader);
        this.xPath = xPath;
        this.parent = parent;
        data.setPath(this.xPath);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {

        String childXpath = xPath + "/" + qName;
        for (int x = 0; x < atts.getLength(); x++) {
            childXpath = childXpath + "[" + atts.getQName(x) + "=\"" + atts.getValue(x) + "\"]";
        }
        XPathTreeContentHandler child = new XPathTreeContentHandler(childXpath, xmlReader, this);
        xmlReader.setContentHandler(child);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String value = characters.toString().trim();
        if (value.length() > 0) {
            data.setValue(characters.toString());
        }
        parent.data.getChildren().add(data);
        xmlReader.setContentHandler(parent);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        characters.append(ch, start, length);
    }
}

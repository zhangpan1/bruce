package com.zhang.bruce.risk.xml.handler;

import com.google.common.collect.Maps;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import java.util.Map;

/**
 * xpath解析
 *
 * @author ita010218
 */
public class FragmentContentHandler extends DefaultHandler {
    private String xPath = "";
    private XMLReader xmlReader;
    private FragmentContentHandler parent;
    private StringBuilder characters = new StringBuilder();

    private Map<String, String> data = Maps.newHashMap();

    public FragmentContentHandler(XMLReader xmlReader) {
        this.xmlReader = xmlReader;
    }

    public Map<String, String> getData() {
        return data;
    }

    private FragmentContentHandler(String xPath, XMLReader xmlReader, FragmentContentHandler parent) {
        this(xmlReader);
        this.xPath = xPath;
        this.parent = parent;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        StringBuilder childXpath = new StringBuilder().append(xPath).append("/").append(qName);

        int attrsLength = atts.getLength();
        for (int i = 0; i < attrsLength; i++) {
            childXpath.append("[").append(atts.getQName(i)).append("=\"").append(atts.getValue(i)).append("\"]");
            data.put(childXpath.toString(), "");
        }

        FragmentContentHandler child = new FragmentContentHandler(childXpath.toString(), xmlReader, this);
        xmlReader.setContentHandler(child);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String value = characters.toString().trim();
        if (value.length() > 0) {
            data.put(xPath, characters.toString());
        }
        parent.data.putAll(data);
        xmlReader.setContentHandler(parent);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        characters.append(ch, start, length);
    }
}

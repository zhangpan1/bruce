package com.zhang.bruce.xmlReport.test;

import com.google.common.collect.Maps;
import com.zhang.bruce.xmlReport.xml.XmlNode;
import com.zhang.bruce.xmlReport.xml.XmlReportExport;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/1/10 19:38
 * @Description:
 */
public class TestXmlExport {
    public static void main(String[] args) throws Exception {
        // 使用xml报表导出
        // 使用xml报表导出
        XmlNode rootNode = genRootNode();

        XmlReportExport xmlReportExport = new XmlReportExport(rootNode);

        xmlReportExport.startElement("CATIs", Maps.newHashMap());
        XmlNode.ObjectXmlNode node = XmlNode.createListNode("FILE");
        XmlNode htcRs = genLargeTradeFeature();
        node.addChildNode(htcRs);
        xmlReportExport.appendElement(node);
        xmlReportExport.endElement();


        XmlNode.ObjectXmlNode node1 = XmlNode.createListNode("FILE");
        XmlNode htcRs1 = genLargeTradeFeature();
        node1.addChildNode(htcRs1);
        xmlReportExport.appendElement(node1);
        xmlReportExport.endElement();


        xmlReportExport.export();

    }
    private static XmlNode genLargeTradeFeature() {

        XmlNode.ObjectXmlNode xmlNode = XmlNode.createListNode("HTCRs");

        for (int i = 0; i < 1; i++) {
            XmlNode.ObjectXmlNode htcr = XmlNode.createListNode("HTCR");
            //<CRCD>大额交易特征代码</CRCD>
            htcr.addChildNode(XmlNode.createTextNode("CRCD", "BRUCE"));
            //<TTNM>交易总数</TTNM>
            htcr.addChildNode(XmlNode.createTextNode("TTNM", "KKKKK"));

            // CCIFs 客户信息
            XmlNode.ObjectXmlNode cciFs = XmlNode.createListNode("CCIFs");

            // TODO 客户信息补充
            for (int j = 0; j < 1; j++) {
                XmlNode.ObjectXmlNode info = XmlNode.createListNode("CCIF");
                // 客户身份信息
                info.addChildNode(XmlNode.createTextNode("BBAM", "3"));
                cciFs.addChildNode(info);
            }
            htcr.addChildNode(cciFs);
            xmlNode.addChildNode(htcr);
        }
        return xmlNode;
    }

    /**
     * 生成数据
     *
     * @return
     */
    private static XmlNode.ObjectXmlNode genRootNode() {

        XmlNode.ObjectXmlNode root = XmlNode.createListNode("PHTR");

        //<RBIF>
        XmlNode.ObjectXmlNode info = XmlNode.createListNode("RBIF");
        //<RINM>报告机构名称</RINM>
        info.addChildNode(XmlNode.createTextNode("RINM", "3"));
        //  <RICD>报告机构编码</RICD>
        info.addChildNode(XmlNode.createTextNode("RICD", "4"));
        //	<FIRC>报告机构所在地区编码</FIRC>
        info.addChildNode(XmlNode.createTextNode("FIRC", "3"));
        //	<LEI>LEI编码</LEI>
        info.addChildNode(XmlNode.createTextNode("LEI", "3"));
        //	<CTTN>交易客户总数</CTTN>
        info.addChildNode(XmlNode.createTextNode("CTTN", "3"));
        //	<RICD>报告机构编码</RICD>
        info.addChildNode(XmlNode.createTextNode("RICD", "3"));
        info.addChildNode(generaCustomInfo());
        root.addChildNode(info);


        //<RBIF>
        XmlNode.ObjectXmlNode info1 = XmlNode.createListNode("SEIFs");
        XmlNode.ObjectXmlNode info2 = XmlNode.createListNode("STIFs");

        root.addChildNode(info1);
        root.addChildNode(info2);
        return root;
    }
    private static XmlNode generaCustomInfo() {
        // 客户业务信息
        XmlNode.ObjectXmlNode siifs = XmlNode.createListNode("SIIFs");
        XmlNode.ObjectXmlNode siif = XmlNode.createListNode("SIIF");
        // 这个需要看看是什么东西
        siif.setAttribute("seqno","1");
        // <SENM>可疑主体名称/姓名</SENM>
        siif.addChildNode(XmlNode.createTextNode("SENM", ""));
        //  <SMID>主体特约商户编号</SMID>
        siif.addChildNode(XmlNode.createTextNode("SMID", ""));
        //  <SETP>可疑主体身份证件/证明文件类型</SETP>
        siif.addChildNode(XmlNode.createTextNode("SETP", ""));
        //  <OITP>其他身份证件/证明文件类型</OITP>
        siif.addChildNode(XmlNode.createTextNode("OITP", ""));
        //  <SEID>可疑主体身份证件/证明文件/号码</SEID>
        siif.addChildNode(XmlNode.createTextNode("SEID", ""));
        siifs.addChildNode(siif);
        return siifs;
    }


}

package com.zhang.bruce.risk.xml.utils;


import com.google.common.collect.Lists;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author lijunhao
 * @date 2022/1/24 2:04 下午
 */
public class XPathTree implements Serializable {
    private static final long serialVersionUID = -9109811083392901464L;

    /**
     * 跟节点
     */
    private XPathNode root;

    public XPathTree(XPathNode data) {
        this.root = data;
    }

    public XPathNode getRoot() {
        return root;
    }

    public void setRoot(XPathNode root) {
        this.root = root;
    }


    /**
     * 从错误未知定位reqid
     *
     * @param position
     * @return
     */
    public String findTICD(String position) {
        // /PHTR/CATIs/CATI[seqno="1"]/HTCRs/HTCR[seqno="1"]/CCIFs/CCIF[seqno="1"]/TSDTs/TSDT[seqno="1"]/TSIF/CRPP
        // "/PHTR/HTCRs/HTCR[seq=\"111\"]/CCIFs/CCIF[seq=\"11\"]/TSDTs[seq=\"11\"]/TSDT/TSIF/TICD"
        String[] split = StringUtils.split(position, "/");
        if (ArrayUtils.contains(split, "TSDTs") || ArrayUtils.contains(split, "STIFs")) {
            // /PHTR/HTCRs/HTCR[seq=\"111\"]/CCIFs/CCIF[seq=\"11\"]/TSDTs[seq=\"11\"]/TSDT/TSIF/TICD
            // 有交易数据
            XPathNode temp = this.root;
            List<String> pathArr = Lists.newArrayList();
            pathArr.add("/");
            for (String subStr : split) {
                if (StringUtils.startsWithIgnoreCase(subStr, "TSDT[seqno=")
                        || StringUtils.startsWithIgnoreCase(subStr, "STIF[seqno=")) {
                    pathArr.add(subStr);
                    break;
                } else {
                    pathArr.add(subStr);
                }
            }
            pathArr.add("TSIF");
            pathArr.add("TICD");

            StringBuffer sb = new StringBuffer("/");
            for (String subStr : pathArr) {
                if (StringUtils.equalsIgnoreCase(subStr, "/")) {
                    continue;
                }
                sb.append(subStr);
                temp = temp.getChildren().stream()
                        .filter(xPathNode -> StringUtils.equalsIgnoreCase(xPathNode.getPath(), sb.toString()))
                        .findFirst().orElse(null);
                if (temp == null) {
                    return null;
                }
                sb.append("/");
            }
            return temp == null ? null : temp.getValue();
        } else {
            return null;
        }
    }

    /**
     * 从错误未知定位reqid
     *
     * @param position
     * @return
     */
    public String findSMID(String position) {
        // /PSTR/SEIFSs/SEIF[seqno="1"]/CSNM

        // /PSTR/SEIFSs/SEIF[seqno="1"]/SRIF/CRID
        String[] split = StringUtils.split(position, "/");
        if (ArrayUtils.contains(split, "SIIFs")) {
            // 有交易数据
            XPathNode temp = this.root;
            List<String> pathArr = Lists.newArrayList();
            pathArr.add("/");
            for (String subStr : split) {
                if (StringUtils.startsWithIgnoreCase(subStr, "SIIF[seqno=")) {
                    pathArr.add(subStr);
                    break;
                } else {
                    pathArr.add(subStr);
                }
            }
            pathArr.add("SMID");

            StringBuffer sb = new StringBuffer("/");
            for (String subStr : pathArr) {
                if (StringUtils.equalsIgnoreCase(subStr, "/")) {
                    continue;
                }
                sb.append(subStr);
                temp = temp.getChildren().stream()
                        .filter(xPathNode -> StringUtils.equalsIgnoreCase(xPathNode.getPath(), sb.toString()))
                        .findFirst().orElse(null);
                if (temp == null) {
                    return null;
                }
                sb.append("/");
            }
            return temp == null ? null : temp.getValue();
        } else {
            return null;
        }
    }

    /**
     * 从错误未知定位reqid
     *
     * @param position
     * @return
     */
    public String findOTIC(String position) {
        // /PHTR/CATIs/CATI[seqno="1"]/HTCRs/HTCR[seqno="1"]/CCIFs/CCIF[seqno="1"]/TSDTs/TSDT[seqno="1"]/TSIF/CRPP
        // "/PHTR/HTCRs/HTCR[seq=\"111\"]/CCIFs/CCIF[seq=\"11\"]/TSDTs[seq=\"11\"]/TSDT/TSIF/TICD"
        String[] split = StringUtils.split(position, "/");
        if (ArrayUtils.contains(split, "TSDTs")) {
            // /PHTR/HTCRs/HTCR[seq=\"111\"]/CCIFs/CCIF[seq=\"11\"]/TSDTs[seq=\"11\"]/TSDT/TSIF/TICD
            // 有交易数据

            List<String> pathArr = Lists.newArrayList();
            pathArr.add("/");
            for (String subStr : split) {
                if (StringUtils.startsWithIgnoreCase(subStr, "TSDT[seqno=")) {
                    pathArr.add(subStr);
                    break;
                } else {
                    pathArr.add(subStr);
                }
            }
            pathArr.add("OTIC");

            XPathNode temp = this.root;
            StringBuffer sb = new StringBuffer("/");
            for (String subStr : pathArr) {
                if (StringUtils.equalsIgnoreCase(subStr, "/")) {
                    continue;
                }
                sb.append(subStr);
                temp = temp.getChildren().stream()
                        .filter(xPathNode -> StringUtils.equalsIgnoreCase(xPathNode.getPath(), sb.toString()))
                        .findFirst().orElse(null);
                if (temp == null) {
                    return null;
                }
                sb.append("/");
            }
            return temp == null ? null : temp.getValue();
        } else {
            return null;
        }
    }


    /**
     * XPath节点
     */
    public static class XPathNode {

        /**
         * 路径
         */
        private String path;
        /**
         * 值
         */
        private String value;
        /**
         * 子节点
         */
        private List<XPathNode> children = Lists.newArrayList();

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public List<XPathNode> getChildren() {
            return children;
        }

        public void setChildren(List<XPathNode> children) {
            this.children = children;
        }


        @Override
        public String toString() {
            return new StringJoiner(", ", XPathNode.class.getSimpleName() + "[", "]")
                    .add("path='" + path + "'")
                    .add("value='" + value + "'")
                    .add("children=" + children)
                    .toString();
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", XPathTree.class.getSimpleName() + "[", "]")
                .add("root=" + root)
                .toString();
    }
}

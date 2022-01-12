package com.zhang.bruce.xmlReport.xml;

/**
 * 导出扩展文件
 *
 * @author lijunhao
 */
public enum ExportFileExtension {

    /**
     * zip文件
     */
    ZIP("zip"),
    /**
     * xml文件
     */
    XML("xml");

    /**
     * 文件后缀名
     */
    private final String code;

    public String getCode() {
        return code;
    }

    ExportFileExtension(String code) {
        this.code = code;
    }
}

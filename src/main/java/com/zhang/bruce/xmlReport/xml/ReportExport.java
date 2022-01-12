package com.zhang.bruce.xmlReport.xml;

import java.io.File;

/**
 * 报表导出
 *
 * @author lijunhao
 * @date 2021/12/15 6:27 下午
 */
public interface ReportExport<T> {

    /**
     * 文件扩展名
     *
     * @return
     */
    public ExportFileExtension fileExtension();

    /**
     * 导出
     *
     * @return
     */
    public File export() throws Exception;


}

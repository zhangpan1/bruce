package com.zhang.bruce.xmlReport.xml;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * @author lijunhao
 * @date 2021/12/16 10:22 上午
 */
public abstract class AbstractReportExport<T> implements ReportExport<T> {

    /**
     * 生成临时文件
     *
     * @return 文件名
     */
    protected File generateTemp() {

        ExportFileExtension exportFileExtension = fileExtension();
        String uuid = UUID.randomUUID().toString();
        String dmt = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // return new File(dmt + File.separator + uuid + "." + exportFileExtension.getCode());
        return new File("D:\\tmp"+File.separator + uuid + "." + exportFileExtension.getCode());
    }

}

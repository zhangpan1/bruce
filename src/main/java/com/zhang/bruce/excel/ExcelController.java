package com.zhang.bruce.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.zhang.bruce.exportcsv.WriteMo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 15:16
 * @Description:
 */
@RequestMapping("/excel")
@RestController
public class ExcelController {

    @Resource
    private EasyExcelUtil easyExcelUtil;

    @GetMapping("/export")
    public void exportExcel(HttpServletResponse response) {
        easyExcelUtil.dataExport300w(response);
    }

    @GetMapping("/export2")
    public void exportExcel2(HttpServletResponse response) {
        easyExcelUtil.dataExportCsv(response);
    }



}

package com.zhang.bruce.risktest.business;

import com.zhang.bruce.excel.EasyExcelUtil;
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
public class CheckListGenelaController {

    @Resource
    private EasyExcelUtil easyExcelUtil;

    @GetMapping("/export")
    public void exportExcel(HttpServletResponse response) {
        easyExcelUtil.dataExport300w(response);
    }





}

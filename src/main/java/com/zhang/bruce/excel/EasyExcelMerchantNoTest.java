package com.zhang.bruce.excel;

import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/9/25 5:12 下午
 */
@RequestMapping("/importMecNo")
@RestController
@Slf4j
public class EasyExcelMerchantNoTest {
    @Resource
    private IActResultLogService actResultLogService;

    // EasyExcel的读取Excel数据的API
    @GetMapping("/readMecNo")
    public void import2DBFromExcel10wTest() {
        String fileName = "/Users/ita010226/Downloads/全国数据解密.xlsx";
        // 记录开始读取Excel时间,也是导入程序开始时间
        long startReadTime = System.currentTimeMillis();
        log.info("------开始读取Excel的Shet时间(包括导入数据过程):" + startReadTime + " ms------");
        // 读取所有Sheet的数据.每次读完一个Sheeet就会调用这个方法
        EasyExcel.read(fileName, ActResultLogVO.class, new EasyExcelGeneralDataMybatisListener(actResultLogService)).doReadAll();
//        EasyExcel.read(fileName, new EasyExcelGeneralDataJDBCListener(actResultLogService)).doReadAll();
        long endReadTime = System.currentTimeMillis();
        log.info("------结束读取Excel的Sheet时间(包括导入数据过程):" + endReadTime + " ms------");
        log.info("------导入总花费时长：{}", ((endReadTime - startReadTime) / 1000) + "s------");
    }
}

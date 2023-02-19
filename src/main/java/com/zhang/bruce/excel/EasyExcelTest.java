package com.zhang.bruce.excel;

import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 16:28
 * @Description:
 */
@RequestMapping("/excel")
@RestController
@Slf4j
public class EasyExcelTest {
    @Resource
    private IActResultLogService actResultLogService;

    // EasyExcel的读取Excel数据的API
    @GetMapping("/read")
    public void import2DBFromExcel10wTest() {
        String fileName = "D:\\ant\\fileName.csv";
        // 记录开始读取Excel时间,也是导入程序开始时间
        long startReadTime = System.currentTimeMillis();
        log.info("------开始读取Excel的Shet时间(包括导入数据过程):" + startReadTime + " ms------");
        // 读取所有Sheet的数据.每次读完一个Sheeet就会调用这个方法
        EasyExcel.read(fileName, ActResultLogVO.class, new EasyExcelGeneralDataMybatisListener(actResultLogService))
                .registerConverter(new EasyExcelLocalDateConvert()).doReadAll();
//        EasyExcel.read(fileName, new EasyExcelGeneralDataJDBCListener(actResultLogService)).doReadAll();
        long endReadTime = System.currentTimeMillis();
        log.info("------结束读取Excel的Sheet时间(包括导入数据过程):" + endReadTime + " ms------");
        log.info("------导入总花费时长：{}", ((endReadTime - startReadTime) / 1000) + "s------");
    }
}

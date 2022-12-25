package com.zhang.bruce.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/21 18:34
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class TestExcelController {
    @Resource
    private UserService userService;

    @GetMapping("/exportUser")
    public String exportUser(HttpServletResponse response) throws IOException {
        userService.selectResult();
        return null;
    }

    @PostMapping("/importUser")
    public Object importUser(@RequestBody MultipartFile file) throws IOException {
        ExcelListener userImportListener = new ExcelListener(userService);
        ExcelReader excelReader = null;
        try {
            excelReader = EasyExcel.read(file.getInputStream(), UserImportVO.class, userImportListener).build();
            // 构建一个sheet 这里可以指定名字或者no
            ReadSheet readSheet = EasyExcel.readSheet(0).build();
            // 读取一个sheet
            excelReader.read(readSheet);
        } catch (Exception e) {
            log.error("文件读取失败：" + e.getMessage());
            return "文件读取失败" + e.getMessage();
        } finally {
            if (excelReader != null) {
                // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
                excelReader.finish();
            }
        }
        return null;
    }

}

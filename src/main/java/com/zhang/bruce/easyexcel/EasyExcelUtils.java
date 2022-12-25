package com.zhang.bruce.easyexcel;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.context.WriteContextImpl;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;

import java.io.IOException;
import java.io.OutputStream;
import java.util.*;
/**
 * @author bruce
 * @version 1.0
 * @date 2022/11/25 18:08
 * @Description:
 */




/**
 * @author 小布
 * @version 1.0.0
 * @date on  2021/5/27 16:36
 * {@link WriteContextImpl#finish(boolean onException) 会自动关闭流}
 */
public class EasyExcelUtils<T> {
    /**
     * 写单个表头
     */
    public static List<List<String>> simpleHead(String[] headArr) {
        List<List<String>> headTitles = new ArrayList<>();
        for (String s : headArr) {
            List<String> head = new ArrayList<>();
            head.add(s);
            headTitles.add(head);
        }
        return headTitles;
    }

    /**
     * horizontalCellStyleStrategy
     * 默认策略
     *
     * @return com.alibaba.excel.write.style.HorizontalCellStyleStrategy
     * @author 小布
     * @date 2022/1/17 17:13
     */
    public static HorizontalCellStyleStrategy horizontalCellStyleStrategy() {
        // 头的策略
        WriteCellStyle headWriteCellStyle = new WriteCellStyle();
        headWriteCellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        WriteFont headWriteFont = new WriteFont();
        headWriteFont.setFontName("微软雅黑");
        headWriteFont.setFontHeightInPoints((short) 10);
        headWriteCellStyle.setWriteFont(headWriteFont);
        // 内容格式
        WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
        WriteFont contentWriteFont = new WriteFont();
        contentWriteFont.setFontName("微软雅黑");
        contentWriteFont.setFontHeightInPoints((short) 9);
        contentWriteCellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        contentWriteCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        contentWriteCellStyle.setHorizontalAlignment(HorizontalAlignment.CENTER);
        contentWriteCellStyle.setBorderBottom(BorderStyle.THIN);
        contentWriteCellStyle.setBorderLeft(BorderStyle.THIN);
        contentWriteCellStyle.setBorderRight(BorderStyle.THIN);
        contentWriteCellStyle.setBorderTop(BorderStyle.THIN);
        contentWriteCellStyle.setWriteFont(contentWriteFont);
        return new HorizontalCellStyleStrategy(headWriteCellStyle, contentWriteCellStyle);
    }


    /**
     * EasyExcel不支持Map的写入  将LinkedHashMap 转成 List<List<Object>>
     *
     * @param list list
     * @return java.util.List<java.util.List < java.lang.Object>>
     * @author 小布
     * @date 2022/1/25 9:10
     */
    public static List<List<Object>> map2List(List<LinkedHashMap<String, Object>> list) {
        List<List<Object>> excelList = new ArrayList<>();
        for (LinkedHashMap<String, Object> map : list) {
            List<Object> data = new ArrayList<>();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                data.add(entry.getValue());
                // if (isImage(String.valueOf(entry.getValue()))) {
                //     // 设置超链接
                //     WriteCellData<String> hyperlink = new WriteCellData<>(String.valueOf(entry.getValue()));
                //     HyperlinkData hyperlinkData = new HyperlinkData();
                //     hyperlink.setHyperlinkData(hyperlinkData);
                //     hyperlinkData.setAddress(String.valueOf(entry.getValue()));
                //     hyperlinkData.setHyperlinkType(HyperlinkData.HyperlinkType.URL);
                //     data.add(hyperlink);
                // } else {
                //     data.add(entry.getValue());
                // }
            }
            excelList.add(data);
        }
        return excelList;
    }

    public static Boolean isImage(String value) {
        String s = value.toLowerCase();
        if (s.contains(".jpg")) {
            return true;
        }
        if (s.contains(".png")) {
            return true;
        }
        if (s.contains(".gif")) {
            return true;
        }
        return s.contains(".bmp");
    }

    public static List<List<Object>> map2ListMap(List<String> keysList, List<Map<String, Object>> list) {
        if (null == list || 0 == list.size()) {
            return new ArrayList<>();
        }
        List<List<Object>> excelList = new ArrayList<>();
        for (Map<String, Object> map : list) {
            List<Object> data = new ArrayList<>();
            for (String key : keysList) {
                data.add(map.getOrDefault(key.toLowerCase(Locale.ROOT), map.get(key)));
            }
            excelList.add(data);
        }
        return excelList;
    }

    public static HorizontalCellStyleStrategy horizontalCellStyleStrategyAuto() {
        // 头的策略
        WriteCellStyle headWriteCellStyle = new WriteCellStyle();
        headWriteCellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        WriteFont headWriteFont = new WriteFont();
        headWriteFont.setFontName("等线");
        headWriteFont.setFontHeightInPoints((short) 11);
        headWriteCellStyle.setShrinkToFit(true);
        headWriteCellStyle.setWriteFont(headWriteFont);
        // 内容格式
        WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
        WriteFont contentWriteFont = new WriteFont();
        contentWriteFont.setFontName("等线");
        contentWriteFont.setFontHeightInPoints((short) 11);
        contentWriteCellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        contentWriteCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        contentWriteCellStyle.setHorizontalAlignment(HorizontalAlignment.LEFT);
        contentWriteCellStyle.setBorderBottom(BorderStyle.THIN);
        contentWriteCellStyle.setBorderLeft(BorderStyle.THIN);
        contentWriteCellStyle.setBorderRight(BorderStyle.THIN);
        contentWriteCellStyle.setBorderTop(BorderStyle.THIN);
        contentWriteCellStyle.setShrinkToFit(true);
        contentWriteCellStyle.setWriteFont(contentWriteFont);
        return new HorizontalCellStyleStrategy(headWriteCellStyle, contentWriteCellStyle);
    }

    /**
     * writeWithCustomizeCellStyle
     * 自定义的默认样式写数据
     *
     * @param out       out
     * @param sheetName sheetName
     * @param head      head
     * @param data      data
     * @author 小布
     * @date 2022/1/18 9:53
     */
    public void writeWithCustomize(OutputStream out, String sheetName, List<List<String>> head, List<T> data) throws IOException {
        try {
            EasyExcel.write(out, UserVO.class)
                    .registerWriteHandler(horizontalCellStyleStrategy())
                    .sheet(sheetName).head(head)
                    .doWrite(data);
        } finally {
            out.close();
        }

    }

    /**
     * 默认的样式写文件
     */
    public void writeWithDefaultCellStyle(OutputStream out, String sheetName, String[] headArr, List<T> data) throws IOException {
        ExcelWriter excelWriter = null;
        try {
            excelWriter = EasyExcelFactory.write(out).build();
            // 动态添加表头，适用一些表头动态变化的场景
            WriteSheet sheet = new WriteSheet();
            sheet.setSheetName(sheetName);
            sheet.setSheetNo(0);
            // 创建一个表格，用于 Sheet 中使用
            WriteTable table = new WriteTable();
            table.setTableNo(1);
            table.setHead(simpleHead(headArr));
            // 写数据
            excelWriter.write(data, sheet, table);
        } finally {
            // 千万别忘记finish 会帮忙关闭流
            if (excelWriter != null) {
                excelWriter.finish();
            }
            out.close();
        }
    }

    /**
     * writeWithCustomizeExcludeColumn
     * 动态排除要写入的字段
     *
     * @param out                     out
     * @param sheetName               sheetName
     * @param head                    head
     * @param excludeColumnFiledNames excludeColumnFiledNames
     * @param data                    data
     * @author 小布
     * @date 2022/1/26 13:40
     */
    public void writeWithCustomizeExcludeColumn(OutputStream out, String sheetName, List<List<String>> head, Set<String> excludeColumnFiledNames, List<T> data) throws IOException {
        try {
            EasyExcel.write(out, UserVO.class).excludeColumnFiledNames(excludeColumnFiledNames)
                    .registerWriteHandler(horizontalCellStyleStrategy())
                    .sheet(sheetName).head(head)
                    .doWrite(data);
        } finally {
            out.close();
        }

    }
}


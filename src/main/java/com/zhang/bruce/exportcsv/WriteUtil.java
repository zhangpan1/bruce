package com.zhang.bruce.exportcsv;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.zhang.bruce.excel.ActResultLogVO;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 20:18
 * @Description:
 */
public class WriteUtil {
    // 读取文件
    public static List<ActResultLogVO> readRd(String filePath){
        List<ActResultLogVO> rdList = new ArrayList<>();
        EasyExcel.read(filePath, ActResultLogVO.class, new ReadListener<ActResultLogVO>() {
            @Override
            public void invoke(ActResultLogVO data, AnalysisContext context) {
                rdList.add(data);
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext context) {
                System.out.println(rdList.size());
            }
        }).charset(Charset.forName("UTF-8")).sheet().doRead();
        return rdList;
    }
//    // 读取文件
//    public static List<RundownTitleMo> readRt(String filePath){
//        List<RundownTitleMo> rtList = new ArrayList<>();
//        EasyExcel.read(filePath, RundownTitleMo.class,
//                new PageReadListener<RundownTitleMo>(datalist ->{
//                    //System.out.println(datalist.size()+"=");
//                    rtList.addAll(datalist);
//                })).sheet().doRead();
//        //System.out.println(rtList.size()+"==");
//        return rtList;
//    }

    //分组

}

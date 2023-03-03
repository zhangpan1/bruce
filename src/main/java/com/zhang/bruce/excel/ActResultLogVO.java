package com.zhang.bruce.excel;

import com.alibaba.excel.annotation.ExcelProperty;

import java.io.Serializable;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 15:13
 * @Description:
 */
public class ActResultLogVO implements Serializable {


    @ExcelProperty(value = "card",index = 0)
    private String onlineseqid;

    public String getOnlineseqid() {
        return onlineseqid;
    }

    public void setOnlineseqid(String onlineseqid) {
        this.onlineseqid = onlineseqid;
    }
}

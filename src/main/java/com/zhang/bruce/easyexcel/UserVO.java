package com.zhang.bruce.easyexcel;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: xueqimiao
 * @Date: 2022/9/28 09:43
 */
@Data
public class UserVO implements Serializable {

    /**
     * @ExcelIgnore 不导出此列
     */
    @ExcelIgnore
    private Long id;

    @ExcelProperty(value = "用户名")
    private String userName;

    @ExcelProperty(value = "年龄")
    private Integer age;

    @ExcelProperty(value = "生日")
    private Date birthday;


    public UserVO() {
    }

    public UserVO(Long id, String userName, Integer age, Date birthday) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.birthday = birthday;
    }
}

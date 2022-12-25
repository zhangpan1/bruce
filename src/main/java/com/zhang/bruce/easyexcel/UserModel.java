package com.zhang.bruce.easyexcel;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: xueqimiao
 * @Date: 2022/9/28 09:43
 */
@Data
public class UserModel implements Serializable {

    private Long id;

    private String userName;

    private Integer age;

    private Date birthday;


    public UserModel() {
    }

    public UserModel(Long id, String userName, Integer age, Date birthday) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.birthday = birthday;
    }
}

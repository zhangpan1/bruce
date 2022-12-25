package com.zhang.bruce.easyexcel;

import java.util.List;

/**
 * @Author: xueqimiao
 * @Date: 2022/9/28 09:45
 */
public interface UserService {

    /**
     * 模拟数据库查询数据
     * @return
     */
    List<UserModel> getUserList();

    /**
     * 保存用户进数据库
     * @param vos
     */
    void saveUsers(List<UserImportVO> vos);

    void selectResult();
}

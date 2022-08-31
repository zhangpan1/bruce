package com.zhang.bruce.java8.product.day01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 9:13 下午
 */
@Component
@Slf4j
public class AFileResolve implements IFileStrategy {

    @Override
    public FileTypeResolveEnum gainFileType() {
        return FileTypeResolveEnum.File_A_RESOLVE;
    }

    @Override
    public void resolve(Object objectparam) {
        log.info("A 类型解析文件，参数：{}",objectparam);
        //A类型解析具体逻辑
    }
}

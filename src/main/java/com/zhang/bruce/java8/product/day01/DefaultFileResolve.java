package com.zhang.bruce.java8.product.day01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 9:15 下午
 */
@Component
@Slf4j
public class DefaultFileResolve implements IFileStrategy {

    @Override
    public FileTypeResolveEnum gainFileType() {
        return FileTypeResolveEnum.File_DEFAULT_RESOLVE;
    }

    @Override
    public void resolve(Object objectparam) {
        log.info("默认类型解析文件，参数：{}",objectparam);
        //默认类型解析具体逻辑
    }
}

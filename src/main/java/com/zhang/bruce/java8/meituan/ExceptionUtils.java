package com.zhang.bruce.java8.meituan;

import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/5 4:44 下午
 */
public class ExceptionUtils {
    /**
     * 提取真正的异常
     */
    public static Throwable extractRealException(Throwable throwable) {
        if (throwable instanceof CompletionException || throwable instanceof ExecutionException) {
            if (throwable.getCause() != null) {
                return throwable.getCause();
            }
        }
        return throwable;
    }
}

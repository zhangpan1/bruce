package com.zhang.bruce.risk.xml.utils;

/**
 * 回执解析异常
 *
 * @author lijunhao
 */
public class ReceiptExplainException extends Exception {

    public ReceiptExplainException() {
    }

    public ReceiptExplainException(String message) {
        super(message);
    }

    public ReceiptExplainException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReceiptExplainException(Throwable cause) {
        super(cause);
    }

    public ReceiptExplainException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

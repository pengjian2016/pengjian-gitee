package com.pengjian.edu.common.exception;

/**
 * @author MRT
 * @date 2022/2/11 17:49
 */
public class OperationFailException extends ServiceException{
    public OperationFailException() {
        super();
    }

    /**
     * 带信息的异常
     *
     * @param msg 信息
     */
    public OperationFailException(String msg) {
        super(msg);
    }

    /**
     * 带异常类
     *
     * @param msg   异常信息
     * @param cause 异常对象
     */
    public OperationFailException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public OperationFailException(Throwable cause) {
        super(cause);
    }

    protected OperationFailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

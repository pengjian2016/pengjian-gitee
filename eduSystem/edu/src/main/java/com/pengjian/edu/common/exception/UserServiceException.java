package com.pengjian.edu.common.exception;

/**
 * @author MRT
 * @date 2022/1/21 1:45
 */
public class UserServiceException extends ServiceException{
    public UserServiceException() {
        super();
    }

    /**
     * 带信息的异常
     *
     * @param msg 信息
     */
    public UserServiceException(String msg) {
        super(msg);
    }

    /**
     * 带异常类
     *
     * @param msg   异常信息
     * @param cause 异常对象
     */
    public UserServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UserServiceException(Throwable cause) {
        super(cause);
    }

    protected UserServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package com.pengjian.edu.common.exception;

/**
 * @author MRT
 * @date 2022/1/21 1:40
 */
public class ServiceException extends RuntimeException {

    public ServiceException(){super();}

    /**
     * 带信息的异常
     * @param msg 信息
     */
    public ServiceException(String msg){super((msg));}

    /**
     * 带异常类
     * @param msg 异常信息
     * @param cause 异常对象
     */
    public ServiceException(String msg, Throwable cause){
        super(msg,cause);
    }
    public ServiceException(Throwable cause) {
        super(cause);
    }

    protected ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

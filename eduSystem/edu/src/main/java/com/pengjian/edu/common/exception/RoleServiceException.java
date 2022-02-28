package com.pengjian.edu.common.exception;

/**
 * @author MRT
 * @date 2022/1/21 1:45
 */
public class RoleServiceException extends ServiceException{
    public RoleServiceException() {
        super();
    }

    /**
     * 带信息的异常
     *
     * @param msg 信息
     */
    public RoleServiceException(String msg) {
        super(msg);
    }

    /**
     * 带异常类
     *
     * @param msg   异常信息
     * @param cause 异常对象
     */
    public RoleServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public RoleServiceException(Throwable cause) {
        super(cause);
    }

    protected RoleServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

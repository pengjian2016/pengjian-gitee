package com.pengjian.edu.common.handler;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dev33.satoken.exception.NotLoginException;
import com.pengjian.edu.common.AjaxResult;
import com.pengjian.edu.common.constants.Constants;
import com.pengjian.edu.common.exception.ServiceException;

/**
 * @author MRT
 * @date 2022/2/11 18:30
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ServiceException.class)
    @ResponseBody
    public AjaxResult serviceExceptionHandler(ServiceException e){
       AjaxResult ajaxResult = AjaxResult.error();
       ajaxResult.put(Constants.EXCEPTION_MESSAGE,e.getMessage());
        return ajaxResult;
    }

    @ExceptionHandler(value = NotLoginException.class)
    @ResponseBody
    public AjaxResult notLoginExceptionHandler(Exception e){
        AjaxResult ajaxResult = AjaxResult.error();
        ajaxResult.put(Constants.EXCEPTION_MESSAGE,e.getMessage());
        ajaxResult.put(Constants.TOKEN_CODE,5001);
        return ajaxResult;
    }
    @ExceptionHandler(BindException.class)
    @ResponseBody
    public AjaxResult bindExceptionHandler(BindException e) {
        FieldError error = e.getFieldError();
        String message = String.format("%s:%s", "缺少参数", error.getDefaultMessage());
        return AjaxResult.error(message);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public AjaxResult exceptionHandler(MethodArgumentNotValidException e) {
        FieldError error = e.getBindingResult().getFieldError();
        String message = String.format("%s:%s", "缺少参数", error.getDefaultMessage());
        return AjaxResult.error(message);
    }
    @ResponseBody
    @ExceptionHandler(value = ConstraintViolationException.class)
    public AjaxResult constraintViolationExceptionHandler(HttpServletRequest req, ConstraintViolationException ex) {
        // 拼接错误
        StringBuilder detailMessage = new StringBuilder();
        for (ConstraintViolation<?> constraintViolation : ex.getConstraintViolations()) {
            // 使用 ; 分隔多个错误
            if (detailMessage.length() > 0) {
                detailMessage.append(";");
            }
            // 拼接内容到其中
            detailMessage.append(constraintViolation.getMessage());
        }
        // 包装 CommonResult 结果
        return AjaxResult.error(detailMessage.toString());
    }
}

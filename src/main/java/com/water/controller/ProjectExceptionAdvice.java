package com.water.controller;

import com.water.exception.BusinessException;
import com.water.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null, ex.getMessage());
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        return new Result(ex.getCode(),null, ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
//        System.out.println("嘿嘿，捉到异常了哦");
        return new Result(Code.SYSTEM_UNKNOWN_ERR,null, "系统繁忙，请稍后再试");
    }
}

package com.zkr.demo.commons.handler;

import com.zkr.demo.commons.entity.ApiResponse;
import com.zkr.demo.commons.entity.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public ApiResponse handleServiceException(ServiceException e) {
        log.error(e.getMessage(), e);
        return ApiResponse.fail(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ApiResponse handleBindException(BindException e)
    {
        log.error(e.getMessage(), e);
        String message = e.getMessage();
        return ApiResponse.fail(message);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiResponse handleException(Exception e)
    {
        log.error(e.getMessage(), e);
        return ApiResponse.fail(e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ApiResponse handleRuntimeException(RuntimeException e)
    {
        log.error(e.getMessage(), e);
        return ApiResponse.fail(e.getMessage());
    }
}
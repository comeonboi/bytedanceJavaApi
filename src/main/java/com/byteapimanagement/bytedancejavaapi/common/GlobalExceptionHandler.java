package com.byteapimanagement.bytedancejavaapi.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response error(Exception e) {
        e.printStackTrace();
        return Response.errorResponse().message("打咩打咩，打咩哟，打咩nano哟");
    }

}


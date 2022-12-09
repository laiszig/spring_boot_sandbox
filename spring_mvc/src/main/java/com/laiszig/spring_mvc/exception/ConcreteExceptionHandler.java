package com.laiszig.spring_mvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ConcreteExceptionHandler {

    @ExceptionHandler(IllegalStateException.class)
    @ResponseBody
    public String handleIllegalStateException(Exception e) {
        return "Error occurred" + e.getMessage();
    }
}

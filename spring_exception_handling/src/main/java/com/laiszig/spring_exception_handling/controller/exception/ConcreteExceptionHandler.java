package com.laiszig.spring_exception_handling.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ConcreteExceptionHandler {

    @ExceptionHandler(IllegalStateException.class)
    @ResponseBody
    public String handleIllegalStateException(Exception exc) {
        return "Error occurred: " + exc.getMessage();
    }
}

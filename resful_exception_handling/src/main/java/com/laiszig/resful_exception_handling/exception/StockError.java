package com.laiszig.resful_exception_handling.exception;

import lombok.Value;

@Value
public class StockError {

    String code;
    String message;
}

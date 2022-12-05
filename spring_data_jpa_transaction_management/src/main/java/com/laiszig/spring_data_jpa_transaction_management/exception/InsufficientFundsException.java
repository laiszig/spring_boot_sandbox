package com.laiszig.spring_data_jpa_transaction_management.exception;

public class InsufficientFundsException extends RuntimeException{

    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

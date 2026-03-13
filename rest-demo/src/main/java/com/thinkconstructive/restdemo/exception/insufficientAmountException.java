package com.thinkconstructive.restdemo.exception;

public class insufficientAmountException extends RuntimeException{

    public insufficientAmountException(String msg){
        super(msg);
    }
}

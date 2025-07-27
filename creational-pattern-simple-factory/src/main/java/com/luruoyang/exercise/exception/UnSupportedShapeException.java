package com.luruoyang.exercise.exception;

public class UnSupportedShapeException extends Exception{
    private String message;

    public UnSupportedShapeException(String message) {
        super(message);
        this.message = message;
    }
}

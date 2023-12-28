package com.uexcel.exception.handler;

public class EmployeeNotFoundException extends RuntimeException{
    private String message;
    public EmployeeNotFoundException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

package com.uexcel.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@ControllerAdvice
public class EmployeeExceptionHandler {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(EmployeeNotFoundException.class)
    public String employeeNotFoundHandler(EmployeeNotFoundException e){
        return e.getMessage();
    }
}

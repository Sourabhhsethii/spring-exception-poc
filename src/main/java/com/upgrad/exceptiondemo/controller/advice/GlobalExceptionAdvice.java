package com.upgrad.exceptiondemo.controller.advice;

import com.upgrad.exceptiondemo.exceptions.RequestedResourceNotFoundException;
import com.upgrad.exceptiondemo.model.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(RequestedResourceNotFoundException.class)
    ResponseEntity<ErrorModel> handleRequestedResourceNotFoundException(){
        return new ResponseEntity(ErrorModel
                .builder()
                .errorCode("ERR_RESOURCE_NOT_FOUND")
                .errorMessage("Resource Not Found")
                .build(), HttpStatus.BAD_REQUEST);
    }
}

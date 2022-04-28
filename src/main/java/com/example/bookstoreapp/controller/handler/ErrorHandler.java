package com.example.bookstoreapp.controller.handler;

import lombok.extern.slf4j.Slf4j;
import model.constants.ExceptionConstants;
import model.dto.ExceptionDto;
import model.exception.NotFoundException;
import model.exception.UpdateBookException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static model.constants.ExceptionConstants.*;
import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
@Slf4j
public class ErrorHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    public ExceptionDto handle(Exception ex) {
        log.error("Exception", ex);
        return new ExceptionDto(UNEXPECTED_EXCEPTION_CODE, UNEXPECTED_EXCEPTION_MESSAGE);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ExceptionDto handle(DataIntegrityViolationException ex) {
        log.error("Exception", ex);
        return new ExceptionDto(SQL_VALIDATION_CODE, SQL_VALIDATION_MESSAGE);
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public ExceptionDto handle(NotFoundException ex) {
        log.error("Exception", ex);
        return new ExceptionDto(ex.getCode(), ex.getMessage());
    }

    @ExceptionHandler(UpdateBookException.class)
    @ResponseStatus(FORBIDDEN)
    public ExceptionDto handle(UpdateBookException ex) {
        log.error("Exception", ex);
        return new ExceptionDto(ex.getCode(), ex.getMessage());
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ExceptionDto handle(MethodArgumentNotValidException ex) {
        log.error("Exception ", ex);
        return new ExceptionDto(VALIDATION_EXCEPTION_CODE, VALIDATION_EXCEPTION_MESSAGE);
    }
}
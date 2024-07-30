package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

@Slf4j
@RestControllerAdvice
public class ExeptionController {
    @ExceptionHandler({ Exception.class })
    public ResponseDTO<Void> Duplicate(Exception e) {
        log.info("ex: ", e);
        return ResponseDTO.<Void>builder().status(500).msg("Duplicate entry").build();// view
    }
}

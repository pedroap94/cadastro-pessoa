package com.pedro.cadastropessoa.handler;

import com.pedro.cadastropessoa.exception.MissingServletRequestParameterExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class MissingServletRequestParameterExceptionHandler {
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<MissingServletRequestParameterExceptionDetails>
    handlerMissingServletRequestParameterException(MissingServletRequestParameterException e){
        return new ResponseEntity<>(MissingServletRequestParameterExceptionDetails.builder()
                .title("Bad Request. Wrong type of argument")
                .status(HttpStatus.BAD_REQUEST.value())
                .timestamp(LocalDateTime.now())
                .build(), HttpStatus.BAD_REQUEST);
    }
}

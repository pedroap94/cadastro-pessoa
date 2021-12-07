package com.pedro.cadastropessoa.handler;

import com.pedro.cadastropessoa.exception.IllegalArgumentExceptionDetail;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<IllegalArgumentExceptionDetail> handleriae(IllegalArgumentException e) {
        return new ResponseEntity<>(IllegalArgumentExceptionDetail.builder()
                .title("Wrong identificador size")
                .status(HttpStatus.NOT_ACCEPTABLE.value())
                .localDateTime(LocalDateTime.now())
                .build(), HttpStatus.NOT_ACCEPTABLE);
    }

}

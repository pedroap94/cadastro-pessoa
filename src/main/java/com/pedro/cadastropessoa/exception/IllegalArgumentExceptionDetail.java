package com.pedro.cadastropessoa.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class IllegalArgumentExceptionDetail {
    private String title;
    private int status;
    private LocalDateTime localDateTime;
}

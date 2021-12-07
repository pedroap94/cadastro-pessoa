package com.pedro.cadastropessoa.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class PeopleDTO {
    @NotEmpty
    private String nome;
    @NotNull
    @Min(0)
    private Long identificador;
}

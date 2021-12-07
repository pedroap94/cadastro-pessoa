package com.pedro.cadastropessoa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long identificador;
    private String tipoIdentificador;

    public People(String nome, Long identificador, String tipoIdentificador) {
        this.nome = nome;
        this.identificador = identificador;
        this.tipoIdentificador = tipoIdentificador;
    }
}

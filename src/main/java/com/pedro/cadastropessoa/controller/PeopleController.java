package com.pedro.cadastropessoa.controller;

import com.pedro.cadastropessoa.model.People;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/people")
@RequiredArgsConstructor
public class PeopleController {


    @PostMapping
    public ResponseEntity<People> register(@RequestParam String nome,
                                           @RequestParam String tipoIdentificador,
                                           @RequestParam Integer identificador) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

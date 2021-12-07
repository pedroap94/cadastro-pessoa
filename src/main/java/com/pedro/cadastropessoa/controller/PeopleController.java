package com.pedro.cadastropessoa.controller;

import com.pedro.cadastropessoa.dto.PeopleDTO;
import com.pedro.cadastropessoa.model.People;
import com.pedro.cadastropessoa.service.PeopleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/people")
@RequiredArgsConstructor
@Api(value = "API REST Cadastro Pessoa")
public class PeopleController {
    private final PeopleService peopleService;

    @PostMapping
    @ApiOperation(value = "Registra uma nova pessoa no sistema")
    public ResponseEntity<PeopleDTO> register(@RequestBody @Valid PeopleDTO peopleDTO) throws Exception {
        peopleService.peopleRegister(peopleDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

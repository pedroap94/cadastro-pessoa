package com.pedro.cadastropessoa.service;

import com.pedro.cadastropessoa.dto.PeopleDTO;
import com.pedro.cadastropessoa.model.People;
import com.pedro.cadastropessoa.repository.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class PeopleService {

    private final PeopleRepository peopleRepository;

    public void peopleRegister(PeopleDTO peopleDTO) throws Exception {
        int length = peopleDTO.getIdentificador().toString().length();
        try {
            if (length == 11) {
                People people = new People(peopleDTO.getNome(), peopleDTO.getIdentificador(), "CPF");
                peopleRepository.save(people);
            } else if (length == 14) {
                People people = new People(peopleDTO.getNome(), peopleDTO.getIdentificador(), "CNPJ");
                peopleRepository.save(people);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

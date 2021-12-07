package com.pedro.cadastropessoa.service;

import com.pedro.cadastropessoa.repository.PeopleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
@AllArgsConstructor
public class PeopleService {

    static final Pattern pattern = Pattern.compile("\\D", Pattern.MULTILINE);

    private final PeopleRepository peopleRepository;

    public void peopleRegister(){

    }
}

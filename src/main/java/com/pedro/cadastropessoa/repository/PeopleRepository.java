package com.pedro.cadastropessoa.repository;

import com.pedro.cadastropessoa.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, String> {
}

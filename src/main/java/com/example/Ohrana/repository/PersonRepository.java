package com.example.Ohrana.repository;

import com.example.Ohrana.models.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findBySurname (String surname);
}

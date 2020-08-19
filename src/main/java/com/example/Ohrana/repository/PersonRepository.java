package com.example.Ohrana.repository;

import com.example.Ohrana.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}

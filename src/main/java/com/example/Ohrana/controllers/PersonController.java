package com.example.Ohrana.controllers;

import com.example.Ohrana.models.Person;
import com.example.Ohrana.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/person")
    public String ohranaTruda(Model model)
    {
        Iterable<Person> persons = personRepository.findAll();
        model.addAttribute("persons", persons);
        return "person";
    }

}

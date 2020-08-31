package com.example.Ohrana.controllers;

import com.example.Ohrana.models.Person;
import com.example.Ohrana.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;


@Controller
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/person")
    public String ohranaTruda(@RequestParam(required = false) String filter, Model model)
    {
        Iterable<Person> persons = personRepository.findAll();

        if (filter != null && !filter.isEmpty()){
            persons = personRepository.findBySurname(filter);
        }
        else {
            persons = personRepository.findAll();
        }

        model.addAttribute("persons", persons);
        model.addAttribute("filter", filter);
        return "person";
    }

    @GetMapping("/person/add")
        public String personAdd(Model model){
        return "person-add";
        }
    @PostMapping("/person/add")
        public String personPostAdd(@RequestParam String name,
                                    @RequestParam String surname,
                                    @RequestParam String patronymic,
                                    @RequestParam String tab, Model model){
        Person person = new Person(name,surname,patronymic,tab);
        personRepository.save(person);
        return "redirect:/person";
    }

    @GetMapping("/person/{id}")
    public String personDetails(@PathVariable(value = "id") long id, Model model){
        if (!personRepository.existsById(id)){
            return "redirect:/person";
        }
        Optional<Person> person = personRepository.findById(id);
        ArrayList<Person> personArrayList = new ArrayList<>();
        person.ifPresent(personArrayList::add);
        model.addAttribute("person", personArrayList);
        return "person-details";
    }

    @GetMapping("/person/{id}/edit")
    public String personEdit(@PathVariable(value = "id") long id, Model model){
        if (!personRepository.existsById(id)){
            return "redirect:/person";
        }
        Optional<Person> person = personRepository.findById(id);
        ArrayList<Person> personArrayList = new ArrayList<>();
        person.ifPresent(personArrayList::add);
        model.addAttribute("person", personArrayList);
        return "person-edit";
    }

    @PostMapping("/person/{id}/edit")
    public String personPostEdit(@PathVariable(value = "id") long id,
                                    @RequestParam String name,
                                    @RequestParam String surname,
                                    @RequestParam String patronymic,
                                     @RequestParam String tab,Model model){
        Person person = personRepository.findById(id).orElseThrow();
        person.setName(name);
        person.setSurname(surname);
        person.setPatronymic(patronymic);
        person.setTab(tab);
        personRepository.save(person);
        return "redirect:/person";
    }

    @PostMapping("/person/{id}/delete")
    public String personPostDelete(@PathVariable(value = "id") long id, Model model){
        Person person = personRepository.findById(id).orElseThrow();
        personRepository.delete(person);
        return "redirect:/person";
    }


}

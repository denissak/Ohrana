package com.example.Ohrana.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "profile_id")
    private Long id;
    private String name;
    private String surname;
    private String patronymic;
    private String tab;






    public Person(){}




    public Person(String name, String surname, String patronymic, String tab) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.tab = tab;
    }



    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

}

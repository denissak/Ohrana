package com.example.Ohrana.models;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String patronymic;
    private String profession;


    private String structSubdivision;
    private String tab;

/*    private */

    public Person(){}

    public Person(String name, String surname, String patronymic,String structSubdivision, String profession, String tab) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.profession = profession;
        this.structSubdivision = structSubdivision;
        this.tab = tab;
    }

    public String getStructSubdivision() {
        return structSubdivision;
    }

    public void setStructSubdivision(String structSubdivision) {
        this.structSubdivision = structSubdivision;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}

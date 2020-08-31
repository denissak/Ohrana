package com.example.Ohrana.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String patronymic;
    private String tab;
    @OneToMany (mappedBy = "person", cascade = CascadeType.ALL)
    private Set<Profile> profiles;


    public Set<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Set<Profile> profiles) {
        this.profiles = profiles;
    }

    public Person(){}


    public Person(String name, String surname, String patronymic, String tab, Set<Profile> profiles) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.tab = tab;
        this.profiles = profiles;
    }

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

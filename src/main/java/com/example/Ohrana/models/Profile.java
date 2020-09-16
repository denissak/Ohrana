package com.example.Ohrana.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Profile {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "profile_id")
    private Long id;
    @ManyToMany
    @JoinTable (name = "profile_person", joinColumns = @JoinColumn (name = "profile_id"), inverseJoinColumns = @JoinColumn (name = "person_id"))
    private List<Person> persons;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable (name = "profile_structsubdivision", joinColumns = @JoinColumn (name = "profile_id"), inverseJoinColumns = @JoinColumn (name = "structsubdivision_id"))
    private List<StructSubdivision> structSubdivisions;

    public Profile() {
    }

    public Profile(List<Person> persons, List <StructSubdivision> structSubdivisions) {
        this.persons = persons;
        this.structSubdivisions = structSubdivisions;
    }

    public Profile(Profile person, Profile structSubdivision) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Person> getPerson() {
        return persons;
    }

    public void setPerson(List <Person> person) {
        this.persons = person;
    }

    public List <StructSubdivision> getStructSubdivision() {
        return structSubdivisions;
    }

    public void setStructSubdivision(List <StructSubdivision> structSubdivision) {
        this.structSubdivisions = structSubdivision;
    }
}

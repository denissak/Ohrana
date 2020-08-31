package com.example.Ohrana.models;

import javax.persistence.*;

@Entity
public class Profile {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Person person;
    @ManyToOne
    private StructSubdivision structSubdivision;


    public Profile() {
    }

    public Profile(Person person, StructSubdivision structSubdivision) {
        this.person = person;
        this.structSubdivision = structSubdivision;
    }

    public Profile(Profile person, Profile structSubdivision) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public StructSubdivision getStructSubdivision() {
        return structSubdivision;
    }

    public void setStructSubdivision(StructSubdivision structSubdivision) {
        this.structSubdivision = structSubdivision;
    }
}

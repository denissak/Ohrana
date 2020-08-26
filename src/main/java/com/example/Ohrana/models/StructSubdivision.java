package com.example.Ohrana.models;

import javax.persistence.*;

@Entity
public class StructSubdivision {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;
    private String structSubdivision;
    @ManyToOne
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStructSubdivision() {
        return structSubdivision;
    }

    public void setStructSubdivision(String structSubdivision) {
        this.structSubdivision = structSubdivision;
    }

}

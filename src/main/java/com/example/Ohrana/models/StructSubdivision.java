package com.example.Ohrana.models;

import javax.persistence.*;

@Entity
public class StructSubdivision {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String structSubdivision;

    public StructSubdivision(String structSubdivision) {
        this.structSubdivision = structSubdivision;
    }

    public StructSubdivision() {
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

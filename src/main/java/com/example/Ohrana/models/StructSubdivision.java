package com.example.Ohrana.models;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class StructSubdivision {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "structsubdivision_id")
    private Long id;
    private String structSubdivision;
    private String profession;
/*    private List<Profile> profiles;*/

    public StructSubdivision() {
    }
    public StructSubdivision(String structSubdivision) {
        this.structSubdivision = structSubdivision;
    }




    public StructSubdivision(String structSubdivision, String profession) {
        this.structSubdivision = structSubdivision;
        this.profession = profession;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}

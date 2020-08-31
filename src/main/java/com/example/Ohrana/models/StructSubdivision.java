package com.example.Ohrana.models;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class StructSubdivision {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String structSubdivision;
    private String profession;
    @OneToMany (mappedBy = "structSubdivision", cascade = CascadeType.ALL)
    private Set<Profile> profiles;

    public StructSubdivision() {
    }
    public StructSubdivision(String structSubdivision) {
        this.structSubdivision = structSubdivision;
    }

    public StructSubdivision(String structSubdivision, String profession, Set<Profile> profiles) {
        this.structSubdivision = structSubdivision;
        this.profession = profession;
        this.profiles = profiles;
    }

    public StructSubdivision(String structSubdivision, String profession) {
        this.structSubdivision = structSubdivision;
        this.profession = profession;
    }

    public Set<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Set<Profile> profiles) {
        this.profiles = profiles;
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

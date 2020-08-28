/*
package com.example.Ohrana.models;

*/
/*import com.example.Ohrana.config.util.EntityIdResolver;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;*//*


import javax.persistence.*;

@Entity
*/
/*@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
scope = Coveralls.class,
resolver = EntityIdResolver.class,
property = "id")*//*

public class Coveralls
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String size;
    private String height;


}
*/

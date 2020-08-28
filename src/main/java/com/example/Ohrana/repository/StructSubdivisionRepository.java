package com.example.Ohrana.repository;

import com.example.Ohrana.models.StructSubdivision;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StructSubdivisionRepository extends CrudRepository<StructSubdivision, Long> {
    List<StructSubdivision> findByStructSubdivision (String structSubdivision);
}

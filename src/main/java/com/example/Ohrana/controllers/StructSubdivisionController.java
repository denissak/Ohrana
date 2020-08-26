package com.example.Ohrana.controllers;

import com.example.Ohrana.models.StructSubdivision;
import com.example.Ohrana.repository.StructSubdivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StructSubdivisionController {
    @Autowired
    private StructSubdivisionRepository structSubdivisionRepository;

    @GetMapping("/structsubdivision")
    public String ohranaTruda(@RequestParam(required = false) String filter, Model model){
        Iterable<StructSubdivision> structSubdivisions = structSubdivisionRepository.findAll();
        if (filter != null && !filter.isEmpty()){
            structSubdivisions = structSubdivisionRepository.findByStructSubdivision(filter);
        }
        else {
            structSubdivisions = structSubdivisionRepository.findAll();
        }
        model.addAttribute("structSubdivisions", structSubdivisions);
        return "structsubdivision";
    }


    @GetMapping("/structsubdivision/add")
    public String structSubdivisionAdd(Model model){
        return "structsubdivision-add";
    }
    @PostMapping("/structsubdivision/add")
    public String structSubdivisionPostAdd(@RequestParam String structsubdivision, Model model){
        StructSubdivision structSubdivision = new StructSubdivision(structsubdivision);
        structSubdivisionRepository.save(structSubdivision);
        return "redirect:/structsubdivision";
    }

}

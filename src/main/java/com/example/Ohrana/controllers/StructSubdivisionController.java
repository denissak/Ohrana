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
    public String ohranaTruda(Model model)
    {
        Iterable<StructSubdivision> structSubdivisions = structSubdivisionRepository.findAll();
        model.addAttribute("structsubdivision", structSubdivisions);
        return "structsubdivision";
    }

    @GetMapping("/structsubdivision/add")
    public String structSubdivisionAdd(Model model){
        return "structsubdivision-add";
    }
    @PostMapping("/structsubdivision/add")
    public String structSubdivisionPostAdd(@RequestParam StructSubdivision structSubdivision, Model model){
        structSubdivisionRepository.save(structSubdivision);
        return "redirect:/structsubdivision";
    }

}

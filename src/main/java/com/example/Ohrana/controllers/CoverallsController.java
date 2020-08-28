/*
package com.example.Ohrana.controllers;

import com.example.Ohrana.models.Coveralls;
import com.example.Ohrana.repository.CoverallsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CoverallsController {
    @Autowired
    private CoverallsRepository coverallsRepository;

    @GetMapping("/coveralls")
    public String viewCoveralls(@RequestParam(required = false) String filter, Model model)
    {
        Iterable<Coveralls> coveralls = coverallsRepository.findAll();

        if (filter != null && !filter.isEmpty()){
            coveralls = coverallsRepository.findByName(filter);
        }
        else {
            coveralls = coverallsRepository.findAll();
        }

        model.addAttribute("coveralls", coveralls);
        model.addAttribute("filter", filter);
        return "coveralls";
    }
}
*/

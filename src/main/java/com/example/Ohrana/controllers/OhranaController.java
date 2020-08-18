package com.example.Ohrana.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OhranaController {
    @GetMapping("/ohranaTruda")
        public String ohranaTruda(Model model)
        {
           return "ohrana-truda";

        }

}

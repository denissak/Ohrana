package com.example.Ohrana.controllers;

import com.example.Ohrana.models.Person;
import com.example.Ohrana.models.Profile;
import com.example.Ohrana.models.StructSubdivision;
import com.example.Ohrana.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfileController {
    @Autowired
    private ProfileRepository profileRepository;

    @GetMapping("/profile")
    public String profileShow(@RequestParam(required = false) Model model) {


        Iterable<Profile> profiles = profileRepository.findAll();


        model.addAttribute("profiles", profiles);

        return "profile";
    }

    @GetMapping("/profile/add")
    public String profileAdd(Model model){
        return "profile-add";
    }
    @PostMapping("/profile/add")
    public String profilePostAdd(@RequestParam Profile person,
                                @RequestParam Profile structSubdivision, Model model){
        Profile profile = new Profile(person,structSubdivision);
        profileRepository.save(profile);
        return "redirect:/profile";
    }

}

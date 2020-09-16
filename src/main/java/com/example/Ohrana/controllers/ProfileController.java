package com.example.Ohrana.controllers;

import com.example.Ohrana.models.Person;
import com.example.Ohrana.models.Profile;
import com.example.Ohrana.models.StructSubdivision;
import com.example.Ohrana.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ProfileController {
    @Autowired
    private ProfileRepository profileRepository;

    @GetMapping("/profile")
    public String profileShow(Model model) {
        Iterable<Profile> profiles = profileRepository.findAll();
        model.addAttribute("profiles", profiles);
        return "profile";
    }

    @GetMapping("/profile/add")
    public String profileAdd(Model model){
        return "profile-add";
    }
    @PostMapping("/profile/add")
    public String profilePostAdd(@RequestParam  Profile persons,
                                @RequestParam Profile structSubdivisions, Model model){
        Profile profile = new Profile(persons,structSubdivisions);
/*        profile.setPerson(p);*/

        profileRepository.save(profile);
        return "redirect:/profile";
    }
    @GetMapping("/profile/add/{id}")
    public String personAdd(@PathVariable(value = "id") long id, Model model){
        if (!profileRepository.existsById(id)){
            return "redirect:/profile";
        }
        Optional<Profile> profile = profileRepository.findById(id);
        ArrayList<Profile> profileArrayList = new ArrayList<>();
        profile.ifPresent(profileArrayList::add);
        model.addAttribute("profile", profileArrayList);
        return "person-add";
    }

/*    @PostMapping("/person/add/")
    public String profilePostAdd(@PathVariable(value = "id") long id,
                                 @RequestParam List <Person> persons ,
                                 @RequestParam List <StructSubdivision> structSubdivisions, Model model){
        Profile profile = profileRepository.findById(id).orElseThrow();
        profile.setPerson(persons);
        profile.setStructSubdivision(structSubdivisions);
        profileRepository.save(profile);
        return "redirect:/profile";
    }*/
}

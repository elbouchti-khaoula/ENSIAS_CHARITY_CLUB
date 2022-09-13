package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Deplacement;
import com.cindh.project.cindh_project.repositories.DeplacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeplacementController {
    @Autowired
    DeplacementRepository deplacementRepository;

    @PostMapping("/add/dep")
    public String addNewDep (@RequestParam String nom) {
        Deplacement dep = new Deplacement();
        dep.setNommember(nom);
        deplacementRepository.save(dep);
        return "Saved";
    }


    @GetMapping("/show/dep")
    public Iterable<Deplacement> getAllDep() {
        return deplacementRepository.findAll();
    }
}

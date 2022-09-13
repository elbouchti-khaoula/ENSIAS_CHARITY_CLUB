package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Encours;
import com.cindh.project.cindh_project.repositories.EncoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncoursController {
    @Autowired
    EncoursRepository encoursRepository;

    @GetMapping("/show/encours")
    public Iterable<Encours> getAllEncours() {
        return encoursRepository.findAll();
    }
}

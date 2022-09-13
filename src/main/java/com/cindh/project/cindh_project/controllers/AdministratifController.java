package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Administratif;
import com.cindh.project.cindh_project.repositories.AdministratifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdministratifController {
    @Autowired
    AdministratifRepository administratifRepository;

    @GetMapping("/show/admin")
    public Iterable<Administratif> getAllAdmin() {
        return administratifRepository.findAll();
    }
}

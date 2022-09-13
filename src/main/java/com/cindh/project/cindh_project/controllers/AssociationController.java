package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Association;
import com.cindh.project.cindh_project.repositories.AssociationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssociationController {
    @Autowired
    AssociationRepository associationRepository;

    @GetMapping("/show/assoc")
    public Iterable<Association> getAllAssoc() {
        return associationRepository.findAll();
    }
}

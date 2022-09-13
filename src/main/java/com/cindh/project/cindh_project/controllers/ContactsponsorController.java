package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Administratif;
import com.cindh.project.cindh_project.models.Contactsponsor;
import com.cindh.project.cindh_project.repositories.ContactsponsorReposotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsponsorController {
    @Autowired
    ContactsponsorReposotory contactsponsorReposotory;

    @GetMapping("/show/ctcspons")
    public Iterable<Contactsponsor> getAllCtcspons() {
        return contactsponsorReposotory.findAll();
    }
}

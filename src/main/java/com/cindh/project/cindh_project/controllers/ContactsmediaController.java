package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Contactsmedia;
import com.cindh.project.cindh_project.repositories.ContactsmediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsmediaController {
    @Autowired
    ContactsmediaRepository contactsmediaRepository;

    @GetMapping("/show/ctcmedia")
    public Iterable<Contactsmedia> getAllCtcmedia() {
        return contactsmediaRepository.findAll();
    }
}

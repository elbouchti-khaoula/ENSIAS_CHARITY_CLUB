package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Spam;
import com.cindh.project.cindh_project.repositories.SpamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpamController {
    @Autowired
    SpamRepository spamRepository;

    @GetMapping("/show/spam")
    public Iterable<Spam> getAllSpam() {
        return spamRepository.findAll();
    }
}

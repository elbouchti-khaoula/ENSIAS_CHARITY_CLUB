package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Presence;
import com.cindh.project.cindh_project.repositories.PresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresenceController {
    @Autowired
    PresenceRepository presenceRepository;

    @GetMapping("/show/presence")
    public Iterable<Presence> getAllPresence() {
        return presenceRepository.findAll();
    }
}

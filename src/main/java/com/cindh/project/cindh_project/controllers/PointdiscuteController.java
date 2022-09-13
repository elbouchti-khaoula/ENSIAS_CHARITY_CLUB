package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Pointdiscute;
import com.cindh.project.cindh_project.repositories.PointdiscuteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointdiscuteController {
    @Autowired
    PointdiscuteRepository pointdiscuteRepository;

    @GetMapping("/show/point")
    public Iterable<Pointdiscute> getAllPoints() {
        return pointdiscuteRepository.findAll();
    }
}

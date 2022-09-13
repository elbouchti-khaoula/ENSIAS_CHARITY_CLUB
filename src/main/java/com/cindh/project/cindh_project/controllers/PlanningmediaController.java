package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Administratif;
import com.cindh.project.cindh_project.models.Planningmedia;
import com.cindh.project.cindh_project.repositories.PlanningmediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanningmediaController {
    @Autowired
    PlanningmediaRepository planningmediaRepository;

    @GetMapping("/show/planmedia")
    public Iterable<Planningmedia> getAllPlanmedia() {
        return planningmediaRepository.findAll();
    }
}

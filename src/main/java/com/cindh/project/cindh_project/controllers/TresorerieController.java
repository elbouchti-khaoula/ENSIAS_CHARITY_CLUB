package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Tresorerie;
import com.cindh.project.cindh_project.repositories.TresorerieRepository;
import com.cindh.project.cindh_project.services.TresorerieServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@Controller
public class TresorerieController {
    @Autowired
    TresorerieRepository tresorerieRepository;

    @Autowired
    private TresorerieServiceI tresorerieService;


    @GetMapping("/show/tresorerie")
    String getAllTresorerie(Model model)
    {   model.addAttribute("activ_list",tresorerieService.getAllTresorerie());
        return "tresorerie";
    }

}

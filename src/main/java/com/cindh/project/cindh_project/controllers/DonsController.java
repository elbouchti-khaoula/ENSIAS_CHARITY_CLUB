package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Dons;
import com.cindh.project.cindh_project.models.Tache;
import com.cindh.project.cindh_project.repositories.DonsRepository;
import com.cindh.project.cindh_project.repositories.TacheRepository;
import com.cindh.project.cindh_project.services.DonsServiceI;
import com.cindh.project.cindh_project.services.TacheServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Controller
public class DonsController {
    @Autowired
    DonsRepository donsRepository;

    @Autowired
    private DonsServiceI donsService;

    /*@PostMapping("/add/dons")
    public String addNewDons (@RequestParam String activ) {
        Dons d = new Dons();
        d.setActivite(activ);
        donsRepository.save(d);
        return "Saved";
    }*/


    @Autowired
    TacheRepository tacheRepository;

    @Autowired
    TacheServiceI tacheService;
    DonsServiceI donServ;



    @GetMapping("/show/dons")
    String getAllDons(Model model)
    {   model.addAttribute("dons_list",donsService.getAllDons());
        List<Tache> taches = tacheService.getTacheByCellule("dons");
        model.addAttribute("listetaches",taches);
        return "Dons";
    }

    @GetMapping("/insertaff")
    public String getInsert()
    {
        return "form1";
    }

    @PostMapping("/insert")
    public String addingDon(@RequestParam(name="prog") String activite, @RequestParam(name="jour") Date jour, @RequestParam(name="heure") Time heure) {
        donServ.addtachedon(activite,jour,heure);
        return "dons";
    }
}

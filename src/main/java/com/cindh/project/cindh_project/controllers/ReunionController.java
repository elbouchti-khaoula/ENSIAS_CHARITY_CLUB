package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Reunion;
import com.cindh.project.cindh_project.repositories.EncoursRepository;
import com.cindh.project.cindh_project.repositories.ReunionRepository;
import com.cindh.project.cindh_project.services.ReunionServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
//import org.springframework.web.bind.annotation.RestController;


@Controller
public class ReunionController {
    @Autowired
    ReunionRepository reunionRepository;
    EncoursRepository encoursRepository;

    @Autowired
    private ReunionServiceI reunionService;


    @GetMapping("/show/reunion")
    String getAllReunion(Model model)
    {   model.addAttribute("reunion_list",reunionService.getAllreunions());
        Reunion reudons = reunionService.getLastReunionByCellule("dons").get(0);
        Date jd = reudons.getDate();
        model.addAttribute("dons",jd);

        Reunion reugen = reunionService.getLastReunionByCellule("general").get(0);
        Date jg = reudons.getDate();
        model.addAttribute("general",jg);

        Reunion reupd = reunionService.getLastReunionByCellule("projetdurable").get(0);
        Date jpd = reudons.getDate();
        model.addAttribute("projetdurable",jpd);

        Reunion reuspons = reunionService.getLastReunionByCellule("sponsoring").get(0);
        Date jspons = reudons.getDate();
        model.addAttribute("sponsoring",jspons);

        Reunion reumedia = reunionService.getLastReunionByCellule("media").get(0);
        Date jmedia = reudons.getDate();
        model.addAttribute("media",jmedia);

        Reunion reutec = reunionService.getLastReunionByCellule("technique").get(0);
        Date jtec = reudons.getDate();
        model.addAttribute("technique",jtec);

        Reunion reugt = reunionService.getLastReunionByCellule("givetake").get(0);
        Date jgt = reudons.getDate();
        model.addAttribute("gt",jgt);

        return "Home";
    }


}

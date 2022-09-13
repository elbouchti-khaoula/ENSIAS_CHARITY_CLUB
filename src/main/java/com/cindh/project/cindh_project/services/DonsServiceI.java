package com.cindh.project.cindh_project.services;

import com.cindh.project.cindh_project.models.Dons;
import com.cindh.project.cindh_project.repositories.DonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;

@Service
public class DonsServiceI implements IdonsService{


    @Autowired
    private DonsRepository donsRepository;

    @Override
    public Iterable<Dons>  getAllDons()
    {
        return donsRepository.findAll();
    }

    @Override
    public Dons addtachedon(String activite, Date jour, Time heure) {
        Dons tache = new Dons(activite,jour,heure);
        donsRepository.save(tache);
        return tache;
    }

}


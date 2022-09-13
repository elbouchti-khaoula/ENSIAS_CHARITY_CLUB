package com.cindh.project.cindh_project.services;


import java.util.ArrayList;
import java.util.List;

import com.cindh.project.cindh_project.models.Encours;
import com.cindh.project.cindh_project.models.Reunion;
import com.cindh.project.cindh_project.repositories.ReunionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReunionServiceI implements IreunionService{

    @Autowired
    private ReunionRepository reunionRepository;

    @Override
    public Iterable<Reunion>  getAllreunions()
    {
        return reunionRepository.findAll();
    }

    @Override
    public List<Reunion> getLastReunionByCellule(String cellule) {
        List<Reunion> liste = (List<Reunion>) reunionRepository.findAll();
        List<Reunion> listfinale = new ArrayList<Reunion>() ;
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).getCellule().equals(cellule)){
                listfinale.add(liste.get(i));
            }
        }
        return listfinale;
    }

}

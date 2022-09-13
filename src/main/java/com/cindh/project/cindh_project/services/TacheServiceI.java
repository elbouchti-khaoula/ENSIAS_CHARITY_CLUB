package com.cindh.project.cindh_project.services;

import com.cindh.project.cindh_project.models.Tache;
import com.cindh.project.cindh_project.repositories.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TacheServiceI implements ItacheService{

    @Autowired
    private TacheRepository tacheRepository;

    @Override
    public Iterable<Tache> getAllTache() {
        return  tacheRepository.findAll();
    }

    @Override
    public List<Tache> getTacheByCellule(String cellule) {
        List<Tache> liste = (List<Tache>) tacheRepository.findAll();
        List<Tache> listfinale = new ArrayList<Tache>() ;
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).getCellule().equals(cellule)){
                listfinale.add(liste.get(i));
            }
        }
        return listfinale;
    }

}




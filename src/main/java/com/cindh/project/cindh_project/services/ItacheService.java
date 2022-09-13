package com.cindh.project.cindh_project.services;

import com.cindh.project.cindh_project.models.Tache;
import com.cindh.project.cindh_project.models.Tresorerie;

import java.util.List;

public interface ItacheService {
    Iterable<Tache>  getAllTache();
    public List<Tache> getTacheByCellule(String cellule);
}

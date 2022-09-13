package com.cindh.project.cindh_project.services;

import com.cindh.project.cindh_project.models.Dons;

import java.sql.Date;
import java.sql.Time;

public interface IdonsService {
    Iterable<Dons>  getAllDons();
    public Dons addtachedon(String activite, Date jour, Time heure);
}

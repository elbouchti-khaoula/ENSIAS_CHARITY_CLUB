
package com.cindh.project.cindh_project.services;


import com.cindh.project.cindh_project.models.Reunion;

import java.util.List;


public interface IreunionService {
    Iterable<Reunion>  getAllreunions();
    List<Reunion> getLastReunionByCellule(String cellule);
}
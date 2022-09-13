package com.cindh.project.cindh_project.services;

import com.cindh.project.cindh_project.models.Tresorerie;
import com.cindh.project.cindh_project.repositories.DonsRepository;
import com.cindh.project.cindh_project.repositories.TresorerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TresorerieServiceI implements ItresorerieService{

    @Autowired
    private TresorerieRepository tresorerieRepository;

    @Override
    public Iterable<Tresorerie> getAllTresorerie() {
        return tresorerieRepository.findAll();
    }
}

package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Deplacement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeplacementRepository extends CrudRepository<Deplacement, Long> {
}

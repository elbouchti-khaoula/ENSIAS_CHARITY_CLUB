package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Encours;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncoursRepository extends CrudRepository<Encours,Long> {
}

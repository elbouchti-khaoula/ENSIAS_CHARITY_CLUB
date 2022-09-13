package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Dons;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonsRepository extends CrudRepository<Dons, Long>{
}

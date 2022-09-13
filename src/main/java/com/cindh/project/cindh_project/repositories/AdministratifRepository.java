package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Administratif;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratifRepository extends CrudRepository<Administratif, Long>{
}

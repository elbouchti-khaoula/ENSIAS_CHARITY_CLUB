package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Tache;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheRepository extends CrudRepository<Tache,Long> {
}

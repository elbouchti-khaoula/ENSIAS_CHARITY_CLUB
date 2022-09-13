package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Reunion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReunionRepository extends CrudRepository<Reunion,Long> {
}

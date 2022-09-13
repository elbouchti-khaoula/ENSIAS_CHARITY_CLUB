package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Association;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationRepository extends CrudRepository<Association, Long> {
}

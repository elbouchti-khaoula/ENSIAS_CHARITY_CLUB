package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Presence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresenceRepository extends CrudRepository<Presence,Long> {
}

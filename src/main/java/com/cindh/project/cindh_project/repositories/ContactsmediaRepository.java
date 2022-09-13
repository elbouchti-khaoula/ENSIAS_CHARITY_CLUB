package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Contactsmedia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsmediaRepository extends CrudRepository<Contactsmedia,Long> {
}

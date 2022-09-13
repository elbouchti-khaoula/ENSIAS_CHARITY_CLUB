package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Tresorerie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TresorerieRepository extends CrudRepository<Tresorerie,Long> {
}

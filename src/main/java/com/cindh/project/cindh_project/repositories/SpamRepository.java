package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Spam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpamRepository extends CrudRepository<Spam,Long> {
}

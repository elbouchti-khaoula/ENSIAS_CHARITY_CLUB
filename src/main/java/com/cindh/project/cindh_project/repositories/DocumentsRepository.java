package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Documents;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentsRepository extends CrudRepository<Documents , Long> {
}

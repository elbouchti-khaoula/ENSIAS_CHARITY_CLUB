package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Members;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends CrudRepository<Members,Long> {
}

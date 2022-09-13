package com.cindh.project.cindh_project.repositories;

import com.cindh.project.cindh_project.models.Contactsponsor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsponsorReposotory extends CrudRepository<Contactsponsor,Long> {
}

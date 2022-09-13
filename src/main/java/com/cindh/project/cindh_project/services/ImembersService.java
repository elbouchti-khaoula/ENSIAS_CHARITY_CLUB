package com.cindh.project.cindh_project.services;

import com.cindh.project.cindh_project.models.Members;

import java.util.List;
import java.util.Optional;

public interface ImembersService {

    Iterable<Members>  getAllMember();
    Optional<Members> getMemberById(Long id);
}

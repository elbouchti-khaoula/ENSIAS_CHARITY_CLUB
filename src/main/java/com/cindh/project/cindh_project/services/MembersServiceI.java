package com.cindh.project.cindh_project.services;

import com.cindh.project.cindh_project.models.Members;
import com.cindh.project.cindh_project.models.Reunion;
import com.cindh.project.cindh_project.repositories.MembersRepository;
import com.cindh.project.cindh_project.repositories.ReunionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembersServiceI implements ImembersService {
    @Autowired
    private MembersRepository membersRepository;

    @Override
    public Iterable<Members>  getAllMember()
    {
        return membersRepository.findAll();
    }

    @Override
    public Optional<Members> getMemberById(Long id){
        return membersRepository.findById(id);
    }
}

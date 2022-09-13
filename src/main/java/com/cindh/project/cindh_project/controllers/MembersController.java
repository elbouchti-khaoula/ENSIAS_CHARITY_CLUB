package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Members;
import com.cindh.project.cindh_project.repositories.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MembersController {
    @Autowired
    MembersRepository membersRepository;

    @GetMapping("/show/members")
    public Iterable<Members> getAllMembers() {
        return membersRepository.findAll();
    }

    @GetMapping("/register")
    public String login() {
        return "register";
    }
}

package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Members;
import com.cindh.project.cindh_project.models.Tache;
import com.cindh.project.cindh_project.repositories.MembersRepository;
import com.cindh.project.cindh_project.repositories.TacheRepository;
import com.cindh.project.cindh_project.services.TacheServiceI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.persistence.Table;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@Table(name= "tache", schema = "club")
@SpringBootTest
class TacheControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mvc;
    @BeforeEach
    public void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @MockBean
    TacheServiceI tacheService;
    @Test
    void getTacheByCellule() throws Exception {
        List<Tache> listTache= new ArrayList<>();
        String s = "2022-05-23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = sdf.parse(s);
        
        List<Members> listMembers= new ArrayList<>();
        //idmembers;nom;prenom;role;password;email;numtel;villemembre;
        listMembers.add(new Members(1L,"khaoula","date","true","true","khaoula@gmail.com","dons","khenifra"));
        listMembers.add(new Members(2L,"jj","date","true","true","khaoula@gmail.com","dons","khenifra"));
        listTache.add(new Tache(1L,"jj",date,"true",1,"dons"));
        listTache.add(new Tache(2L,"jj",date,"false",2,"dons"));

        Mockito.when( tacheService.getTacheByCellule("dons")).thenReturn(listTache);
        String url="/show/dons";
        mvc.perform( MockMvcRequestBuilders
                        .get("/show/{cellule}", "dons")).andExpect(status().isOk())
                .andReturn();

    }


}
package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Members;
import com.cindh.project.cindh_project.models.Tache;
import com.cindh.project.cindh_project.repositories.MembersRepository;
import com.cindh.project.cindh_project.repositories.TacheRepository;
import com.cindh.project.cindh_project.services.MembersServiceI;
import com.cindh.project.cindh_project.services.TacheServiceI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.persistence.Table;

import java.lang.reflect.Member;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.nio.file.Paths.get;
import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.BDDMockito.given;

@Table(name= "members", schema = "club")
@SpringBootTest
class MembersControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mvc;

    @BeforeEach
    public void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @MockBean
    MembersRepository membersRepository;

    @MockBean
    MembersServiceI membersService;

    @Test
    void getAllMembers() throws Exception {
        String s = "2022-05-23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = sdf.parse(s);
        List<Members> listMembers= new ArrayList<>();
        //idmembers;nom;prenom;role;password;email;numtel;villemembre;
        listMembers.add(new Members(1L,"khaoula","date","true","true","khaoula@gmail.com","dons","khenifra"));
        listMembers.add(new Members(2L,"jj","date","true","true","khaoula@gmail.com","dons","khenifra"));
        //when
        Mockito.when( membersService.getAllMember()).thenReturn(listMembers);
        String url="/";
        //then
        mvc.perform( MockMvcRequestBuilders
                        .get(url))
                .andExpect(status().isOk())
                .andReturn();
        //when
        given(membersRepository.findAll())
                .willReturn(listMembers);
        Iterable<Members> response= new ArrayList<>();
        response = membersService.getAllMember();
        // Then
        assertEquals(1l, response.iterator().next().getIdmembers());
        assertEquals("khaoula", response.iterator().next().getNom());
        assertEquals("khenifra", response.iterator().next().getVillemembre());

    }
    @Test
    public void getMemberById() throws Exception {
        Long id1 = 1L;
        int id = 1;
        //Members Member;
        Members obj = new Members(1L, "jj", "date", "true", "true", "khaoula@gmail.com", "dons", "khenifra");
        Optional<Members> optional = Optional.of(obj);
        Mockito.when(membersService.getMemberById(id1)).thenReturn(optional);

        mvc.perform( MockMvcRequestBuilders
                        .get("/"))
                .andExpect(status().isOk())
                .andReturn();

        Optional<Members> response;

        response = membersService.getMemberById(id1);
        // Then
        //assertThat(response.get(0).getIdmembers(), is(1L));
        assertEquals(1l, response.get().getIdmembers());
        assertEquals("jj", response.get().getNom());
    }
}
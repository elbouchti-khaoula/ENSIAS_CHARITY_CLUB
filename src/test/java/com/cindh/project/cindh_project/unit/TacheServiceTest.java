package com.cindh.project.cindh_project.unit;

import com.cindh.project.cindh_project.models.Members;
import com.cindh.project.cindh_project.models.Tache;
import com.cindh.project.cindh_project.repositories.MembersRepository;
import com.cindh.project.cindh_project.repositories.TacheRepository;
import com.cindh.project.cindh_project.services.TacheServiceI;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.persistence.Table;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Table(name= "tache", schema = "club")
@SpringBootTest
public class TacheServiceTest {
    @MockBean
    TacheServiceI tacheService;

    @MockBean
    TacheRepository tacheRepository;

    @MockBean
    MembersRepository membersRepository;

    @Test
    void getTacheByCellule() throws Exception {
        List<Tache> listTache= new ArrayList<>();
        String s = "2022-05-23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = sdf.parse(s);
        List<Members> listMembers= new ArrayList<>();
        listMembers.add(new Members(1L,"khaoula","date","true","true","khaoula@gmail.com","dons","khenifra"));
        listMembers.add(new Members(2L,"jj","date","true","true","khaoula@gmail.com","dons","khenifra"));
        listTache.add(new Tache(1L,"jj",date,"true",1,"dons"));
        listTache.add(new Tache(2L,"jj",date,"false",2,"dons"));

        given(tacheService.getTacheByCellule("dons")).willReturn(listTache);
        List<Tache> response= new ArrayList<>();
        response = tacheService.getTacheByCellule("dons");
        // Then
        assertEquals(1l, response.get(0).getIdtache());
        assertEquals(2l, response.get(1).getIdtache());
        assertEquals("dons", response.get(0).getCellule());
    }

}

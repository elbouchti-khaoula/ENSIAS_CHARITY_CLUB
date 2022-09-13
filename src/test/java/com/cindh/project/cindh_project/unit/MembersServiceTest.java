package com.cindh.project.cindh_project.unit;

import com.cindh.project.cindh_project.models.Members;
import com.cindh.project.cindh_project.repositories.MembersRepository;
import com.cindh.project.cindh_project.services.MembersServiceI;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.persistence.Table;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Table(name= "members", schema = "club")
@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
public class MembersServiceTest {
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

        given(membersService.getAllMember())
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

        given(membersService.getMemberById(id1))
                .willReturn(optional);

        Optional<Members> response;
        //when
        response = membersService.getMemberById(id1);
        // Then
        //assertThat(response.get(0).getIdmembers(), is(1L));
        assertEquals(1l, response.get().getIdmembers());
        assertEquals("jj", response.get().getNom());
    }
}

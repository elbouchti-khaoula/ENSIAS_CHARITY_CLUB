package com.cindh.project.cindh_project.unit;

import com.cindh.project.cindh_project.models.Reunion;
import com.cindh.project.cindh_project.services.ReunionServiceI;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.persistence.Table;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Table(name= "reunion", schema = "club")
@SpringBootTest
public class ReunionServiceTest {

    @MockBean
    ReunionServiceI reunionService;

    @Test
    void getAllReunion() throws Exception  {

        List<Reunion> listReunion= new ArrayList<>();

        String s = "2022-05-23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = sdf.parse(s);

        Long idreunion=1L;
        Long idreunion2=2L;

        long now = System.currentTimeMillis();
        Time heure = new Time(now);

        String cellule="technique";
        String cellule2="dons";
        listReunion.add(new Reunion(idreunion,date,heure,cellule));
        listReunion.add(new Reunion(3L,date,heure,cellule));
        listReunion.add(new Reunion(idreunion2,date,heure,cellule2));
        listReunion.add(new Reunion(4L,date,heure,cellule2));

        given(reunionService.getLastReunionByCellule("technique"))
                .willReturn(listReunion);
        List<Reunion> response1= reunionService.getLastReunionByCellule("technique");
        //assertThat(response.get(0).getIdmembers(), is(1L));
        assertEquals(1l, response1.get(0).getIdreunion());
        assertEquals(3l, response1.get(1).getIdreunion());
        assertEquals("technique", response1.get(0).getCellule());
        assertEquals(date, response1.get(0).getDate());

    }
}

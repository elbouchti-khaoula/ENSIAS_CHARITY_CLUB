package com.cindh.project.cindh_project.unit;

import com.cindh.project.cindh_project.models.Documents;
import com.cindh.project.cindh_project.models.Members;
import com.cindh.project.cindh_project.repositories.DocumentsRepository;
import com.cindh.project.cindh_project.services.DocumentsServiceI;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.persistence.Table;
import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//@RunWith(SpringJUnit4ClassRunner.class)
@Table(name= "document", schema = "club")
@SpringBootTest
public class DocumentsServiceTest {
    @MockBean
    DocumentsRepository documentsRepository;

    @MockBean
    DocumentsServiceI documentsService;

    @Test
    void getdocs() throws Exception  {
        //Long docId;String docName;String type;byte[] docData;
        byte[] byt = new byte[10];
        List<Documents> listDocuments= new ArrayList<>();
        listDocuments.add(new Documents(1L,"name1","dondDoc",byt));
        listDocuments.add(new Documents(2L,"name2","dondDoc",byt));
        listDocuments.add(new Documents(3L,"name3","dondDoc",byt));
        listDocuments.add(new Documents(4L,"name4","dondDoc",byt));

        given(documentsService.getFiles())
                .willReturn(listDocuments);
        List<Documents> response= new ArrayList<>();
        response = documentsService.getFiles();
        // Then
        //assertThat(response.get(0).getIdmembers(), is(1L));
        assertEquals(1l, response.get(0).getDocId());
        assertEquals("name1", response.get(0).getDocName());
    }
    @Test
    void getfilebyId() throws Exception {
        Long id1 = 1L;
        int id = 1;
        byte[] byt = new byte[10];
        List<Documents> listDocuments= new ArrayList<>();
        Documents obj = new Documents(1L,"name1","dondDoc",byt);
        Optional<Documents> optional = Optional.of(obj);

        given(documentsService.getfilebyId(id1))
                .willReturn(optional);

        Optional<Documents> response;
        //when
        response = documentsService.getfilebyId(id1);
        // Then
        //assertThat(response.get(0).getIdmembers(), is(1L));nh
        assertEquals(1l, response.get().getDocId());
        assertEquals("name1", response.get().getDocName());

    }
}

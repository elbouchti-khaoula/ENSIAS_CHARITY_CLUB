package com.cindh.project.cindh_project.controllers;
import com.cindh.project.cindh_project.models.Documents;
import com.cindh.project.cindh_project.models.Members;
import com.cindh.project.cindh_project.repositories.DocumentsRepository;
import com.cindh.project.cindh_project.services.DocumentsServiceI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Lob;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Table(name= "document", schema = "club")
@SpringBootTest
class DocumentsControllerTest {
    //public Documents saveFile(MultipartFile file);
    //public List<Documents> getFiles();
    //public Optional<Documents> getfilebyId(Long docId);

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mvc;

    @BeforeEach
    public void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


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

        Mockito.when( documentsService.getFiles()).thenReturn(listDocuments);
        String url="/show/docs";

        mvc.perform( MockMvcRequestBuilders
                        .get(url))
                .andExpect(status().isOk())
                .andReturn();
        List<Documents> response= new ArrayList<>();
        response = documentsService.getFiles();
        // Then
        //assertThat(response.get(0).getIdmembers(), is(1L));
        assertEquals(1l, response.get(0).getDocId());
        assertEquals("name1", response.get(0).getDocName());
    }


}
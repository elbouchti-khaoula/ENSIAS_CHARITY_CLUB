package com.cindh.project.cindh_project.services;

import com.cindh.project.cindh_project.models.Documents;
import com.cindh.project.cindh_project.models.Tache;
import com.cindh.project.cindh_project.repositories.DocumentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DocumentsServiceI implements IdocumentsService{
    @Autowired
    private DocumentsRepository docrepo;
    @Override
    public Documents saveFile(MultipartFile file) {
        String name = file.getOriginalFilename();
        try {
            Documents doc = new Documents(name, file.getContentType(), file.getBytes());
            return docrepo.save(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
    @Override
    public List<Documents> getFiles(){
        List<Documents> liste = (List<Documents>) docrepo.findAll();
        return liste;
    }

    @Override
    public Optional<Documents> getfilebyId(Long docId){
        return docrepo.findById(docId);
    }

}

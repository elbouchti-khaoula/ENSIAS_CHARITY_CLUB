package com.cindh.project.cindh_project.controllers;

import com.cindh.project.cindh_project.models.Documents;
import com.cindh.project.cindh_project.services.DocumentsServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class DocumentsController {
    @Autowired
    private DocumentsServiceI docServ;
    @GetMapping("/show/docs")
    String getdocs(Model model){
        List<Documents> docs =  docServ.getFiles() ;
        model.addAttribute("docs",docs);
        return "admin";

    }

    @PostMapping("/upload")
    public String uploadMultipleFiles(@RequestParam("files") MultipartFile[] files  ){
        for (MultipartFile file: files) {
            docServ.saveFile(file);
        }
        return "redirect:/show/docs";
    }

    @GetMapping("/download/{docId}")
    public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Long docId){
        Documents docs = docServ.getfilebyId(docId).get();
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(docs.getType()))
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+docs
                        .getDocName()+"\"").body(new ByteArrayResource(docs.getDocData()));
    }
}

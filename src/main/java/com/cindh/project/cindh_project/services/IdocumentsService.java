package com.cindh.project.cindh_project.services;

import com.cindh.project.cindh_project.models.Documents;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface IdocumentsService {
    public Documents saveFile(MultipartFile file);
    public List<Documents> getFiles();
    public Optional<Documents> getfilebyId(Long docId);
}

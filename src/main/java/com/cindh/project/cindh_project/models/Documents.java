package com.cindh.project.cindh_project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Documents {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long docId;
    private String docName;
    private String type;

    @Lob
    private byte[] docData;


    public Documents(String name, String contentType, byte[] bytes) {
        this.docName = name;
        this.type = contentType;
        this.docData = bytes;
    }
}

package com.cindh.project.cindh_project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Date;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Administratif {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idadministratif;

    private String calegorie;

    private Date date;

    private Blob fichier;
}

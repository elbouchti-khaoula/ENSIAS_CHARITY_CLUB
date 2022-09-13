package com.cindh.project.cindh_project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Contactsponsor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idorganisme;

    private Long idmember;

    private String nommember;

    private String prenommember;

    private String nomorganisme;

    private String domainedactivite;

    private String nomresponsable;

    private String poste;

    private String tels;

    private String emails;

    private String adresse;

    private String remarque;


}

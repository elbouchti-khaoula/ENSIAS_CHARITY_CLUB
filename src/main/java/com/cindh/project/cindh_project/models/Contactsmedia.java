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
public class Contactsmedia {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idmedia;

    private String nomorganisme;

    private String domaine;

    private String email;

    private String numtel;

}

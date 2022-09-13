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
public class Deplacement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long iddeplacement;

    private Long idmember;

    private String nommember;

    private String prenommember;

    private String ville;

    private String lieudep;

    private String fdbackdep;

    private String depottirelire;

    private String fdbacktirelire;

}

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
public class Members {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idmembers;

    private String nom;

    private String prenom;

    private String role;

    private String password;

    private String email;

    private String numtel;

    private String villemembre;

}

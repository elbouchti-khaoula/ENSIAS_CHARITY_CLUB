package com.cindh.project.cindh_project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Tache{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idtache;

    private String description;

    private Date deadline;

    private String done;

    private Long idmember;

    private String cellule;

}

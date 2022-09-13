package com.cindh.project.cindh_project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Planningmedia {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idplan;

    private Date jour;

    private Time heure;

    private String activite;

}

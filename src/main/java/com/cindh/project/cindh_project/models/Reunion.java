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
public class Reunion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idreunion;

    private Date date;

    private Time heure;

    private String cellule;
}

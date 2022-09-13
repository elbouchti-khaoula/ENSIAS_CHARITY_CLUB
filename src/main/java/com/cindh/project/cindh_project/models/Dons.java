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
public class Dons {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idactivite;

    private String activite;

    private Date jour;

    private Time heure;

    public Dons(String activite, Date jour, Time heure) {
        this.activite = activite;
        this.jour=jour;
        this.heure=heure;
    }

}

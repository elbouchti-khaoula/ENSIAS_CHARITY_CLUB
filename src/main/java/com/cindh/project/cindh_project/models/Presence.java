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
public class Presence {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idpresence;

    private Long idreunion;

    private Long idmember;

    private String etatpresence;
}

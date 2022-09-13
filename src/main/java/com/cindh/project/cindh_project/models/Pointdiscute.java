package com.cindh.project.cindh_project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Pointdiscute {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idpoint;

    private String description;
}

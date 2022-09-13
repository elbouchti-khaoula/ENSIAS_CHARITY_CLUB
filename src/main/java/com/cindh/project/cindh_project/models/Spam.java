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
public class Spam {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idspam;

    private String influencername;

    private String influenceremail;

    private String influencerphone;

    private String influenceraccount;

    private Date date;

}

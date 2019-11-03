package com.thomasmore.ArtiestService.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="artiest")
@Data
@NoArgsConstructor

public class Artiest {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ArtiestID")
    private int ArtiestID;

    @Column(name="naam")
    private String naam;

    @Column(name="biografie")
    private String biografit;

    @Column(name="id")
    private String nationaliteit;

    @Column(name="jaren")
    private String jaren;

    @Column(name="aantalSchilderijen")
    private String aantalSchilderijen;

}
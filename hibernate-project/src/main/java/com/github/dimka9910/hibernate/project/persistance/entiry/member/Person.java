package com.github.dimka9910.hibernate.project.persistance.entiry.member;

import com.github.dimka9910.hibernate.project.persistance.entiry.Building;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    Building building;


}

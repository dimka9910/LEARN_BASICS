package com.github.dimka9910.hibernate.project.persistance.entiry.member;

import com.github.dimka9910.hibernate.project.persistance.entiry.Building;

import javax.persistence.*;
import java.util.List;

@Entity
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    List<Building> buildings;
}

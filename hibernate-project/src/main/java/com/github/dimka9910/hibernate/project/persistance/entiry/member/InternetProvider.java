package com.github.dimka9910.hibernate.project.persistance.entiry.member;

import com.github.dimka9910.hibernate.project.persistance.entiry.Building;

import javax.persistence.*;
import java.util.List;

@Entity
public class InternetProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    List<Building> buildings;
}

package com.github.dimka9910.hibernate.project.persistance.entiry;

import com.github.dimka9910.hibernate.project.persistance.entiry.member.Organization;
import com.github.dimka9910.hibernate.project.persistance.entiry.member.Person;
import com.github.dimka9910.hibernate.project.persistance.entiry.member.RegistryDocument;

import javax.persistence.*;
import java.util.List;

@Entity
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    List<Person> persons;

    @ManyToOne
    Organization organization;

    @OneToOne
    RegistryDocument registryDocument;

    @ManyToMany
    List<Building> buildings;

}

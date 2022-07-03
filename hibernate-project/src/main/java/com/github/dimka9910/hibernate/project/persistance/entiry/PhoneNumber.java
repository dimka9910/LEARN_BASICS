package com.github.dimka9910.hibernate.project.persistance.entiry;

import com.github.dimka9910.hibernate.project.dto.Operators;

import javax.persistence.*;

@Entity
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    Operators operator;

    String phoneNumber;

}

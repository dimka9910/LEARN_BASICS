package com.github.dimka9910.hibernate.project.persistance.entiry.address;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class FlatAddress extends Address{

    Integer Stage;

}

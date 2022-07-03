package com.github.dimka9910.hibernate.project.persistance.entiry.address;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class HouseAddress extends Address{

    Integer flatsAmount;

}

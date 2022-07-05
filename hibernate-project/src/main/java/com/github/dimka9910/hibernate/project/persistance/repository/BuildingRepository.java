package com.github.dimka9910.hibernate.project.persistance.repository;

import com.github.dimka9910.hibernate.project.persistance.entiry.Building;
import com.github.dimka9910.hibernate.project.persistance.entiry.member.InternetProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Long> {
}

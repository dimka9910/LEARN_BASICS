package com.github.dimka9910.hibernate.project.persistance.repository;

import com.github.dimka9910.hibernate.project.persistance.entiry.Building;
import com.github.dimka9910.hibernate.project.persistance.entiry.member.InternetProvider;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;
import java.util.List;

public interface InternetProviderRepository extends JpaRepository<InternetProvider, Long> {
}

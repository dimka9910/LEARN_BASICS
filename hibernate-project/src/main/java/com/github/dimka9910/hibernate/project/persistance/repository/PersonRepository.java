package com.github.dimka9910.hibernate.project.persistance.repository;

import com.github.dimka9910.hibernate.project.persistance.entiry.member.InternetProvider;
import com.github.dimka9910.hibernate.project.persistance.entiry.member.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

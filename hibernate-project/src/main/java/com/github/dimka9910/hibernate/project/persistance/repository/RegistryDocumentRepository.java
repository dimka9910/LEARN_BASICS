package com.github.dimka9910.hibernate.project.persistance.repository;

import com.github.dimka9910.hibernate.project.persistance.entiry.Building;
import com.github.dimka9910.hibernate.project.persistance.entiry.member.RegistryDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistryDocumentRepository extends JpaRepository<RegistryDocument, Long> {
}

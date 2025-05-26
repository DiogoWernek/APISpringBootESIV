package com.projeto.engenharia.esiv_fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.engenharia.esiv_fatec.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
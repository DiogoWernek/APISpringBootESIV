package com.projeto.engenharia.esiv_fatec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.engenharia.esiv_fatec.model.Company;
import com.projeto.engenharia.esiv_fatec.repository.CompanyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Optional<Company> getCompanyById(String id) {
        return companyRepository.findById(id);
    }

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }

    public void deleteCompany(String id) {
        companyRepository.deleteById(id);
    }
}

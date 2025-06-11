package com.projeto.engenharia.esiv_fatec.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.engenharia.esiv_fatec.model.Company;
import com.projeto.engenharia.esiv_fatec.service.EmailService;

@Service
public class CompanyRepositoryService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private EmailService emailService;

    public Company createCompany(Company company) {
        Company savedCompany = companyRepository.save(company);
        
        emailService.sendNewClientNotification(company.getFantasyName());

        return savedCompany;
    }

}

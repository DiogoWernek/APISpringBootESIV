package com.projeto.engenharia.esiv_fatec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projeto.engenharia.esiv_fatec.model.Company;
import com.projeto.engenharia.esiv_fatec.service.CompanyService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanies() {
        List<Company> companies = companyService.getAllCompanies();
        return new ResponseEntity<>(companies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable("id") Long id) {
        Optional<Company> company = companyService.getCompanyById(id);
        return company.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }    

    @PostMapping
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        try {
            Company createdCompany = companyService.createCompany(company);
            return new ResponseEntity<>(createdCompany, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }    

    @PutMapping("/{id}")
    public ResponseEntity<Company> updateCompany(@PathVariable("id") Long id, @RequestBody Company company) {
        Optional<Company> existingCompany = companyService.getCompanyById(id);
        if (existingCompany.isPresent()) {
            Company updatedCompany = companyService.updateCompany(company);
            return new ResponseEntity<>(updatedCompany, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable("id") Long id) {
        companyService.deleteCompany(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}